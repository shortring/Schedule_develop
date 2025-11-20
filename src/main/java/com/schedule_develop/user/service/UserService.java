package com.schedule_develop.user.service;

import com.schedule_develop.common.exception.BadInputRequestException;
import com.schedule_develop.user.dto.*;
import com.schedule_develop.user.entity.User;
import com.schedule_develop.common.exception.ElementNotFoundException;
import com.schedule_develop.common.exception.IllegalPasswordException;
import com.schedule_develop.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    // 속성
    private final UserRepository userRepository;
    // 생성자

    // 기능
    // 유저 생성 후 저장
    @Transactional
    public CreateUserResponse save(CreateUserRequest request){
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new BadInputRequestException("이미 사용 중인 이메일입니다");
        }

        User user = new User(
            request.getName(),
            request.getEmail(),
            request.getPassword(),
            request.getNickname()
        );

        User savedUser = userRepository.save(user);

        return new CreateUserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getNickname(),
                savedUser.getCreatedAt(),
                savedUser.getModifiedAt()
        );
    }

    // 유저 조회 (단건)
    @Transactional
    public GetUserResponse findOne(long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다")
        );

        return new GetUserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getModifiedAt()
        );
    }

    // 유저 조회 (다건)
    @Transactional
    public List<GetUserResponse> findAll() {
        List<User> userList = userRepository.findAll();
        List<GetUserResponse> dtoList = new ArrayList<>();

        for (User user : userList) {
            dtoList.add(new GetUserResponse(
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getCreatedAt(),
                    user.getModifiedAt()
            ));
        }

        return dtoList;
    }

    // 유저 수정
    @Transactional
    public UpdateUserResponse update(long userId, UpdateUserRequest request) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다.")
        );
        user.updateUser(request.getName(), request.getEmail());

        return new UpdateUserResponse(
                user.getId(),
                user.getNickname(),
                user.getName(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getModifiedAt()
        );
    }

    // 유저 삭제
    @Transactional
    public void delete(long userId) {
        userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다.")
        );

        userRepository.deleteById(userId);
    }

    // 로그인
    @Transactional
    public SessionUser login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail()).orElseThrow(
                () -> new IllegalPasswordException("잘못된 이메일, 혹은 비밀번호입니다")
        );

        if (!user.getPassword().equals(request.getPassword())) {
            throw new IllegalPasswordException("잘못된 이메일, 혹은 비밀번호입니다");
        }
        return new SessionUser(
                user.getId(),
                user.getName()
        );
    }

}