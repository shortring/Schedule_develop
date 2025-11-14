package com.schedule_develop.service;

import com.schedule_develop.dto.*;
import com.schedule_develop.entity.User;
import com.schedule_develop.exception.ElementNotFoundException;
import com.schedule_develop.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class UserService {
    // 속성
    private final UserRepository userRepository;
    // 생성자

    // 기능
    // 유저 생성 후 저장
    @Transactional
    public CreateUserResponse save(CreateUserRequest request) {
        User user = new User(
            request.getName(),
            request.getEmail()
            //request.getPassword();
        );

        User savedUser = userRepository.save(user);

        return new CreateUserResponse(
                user.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getCreatedAt(),
                savedUser.getModifiedAt()
        );
    }

    // 유저 조회
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

    // 유저 수정
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

    @Transactional
    public UpdateUserResponse update(long userId, UpdateUserRequest request) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다.")
        );

        user.updateUser(request.getName(), request.getEmail());

        return new UpdateUserResponse(
                user.getId(),
                user.getName(),
                //user.getPassword(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getModifiedAt()
        );
    }

    @Transactional
    public void delete(long userId, DeleteUserRequest request) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다.")
        );

//        if (user.getPassword().equals(request.getPassword())) {
//            scheduleRepository.deleteById(scheduleId);
//        } else {
//            throw new IllegalPasswordException("잘못된 비밀번호입니다");
//        }
        userRepository.deleteById(userId);
    }

    // 유저 삭제

}