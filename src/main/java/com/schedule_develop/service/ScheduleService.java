package com.schedule_develop.service;

import com.schedule_develop.dto.*;
import com.schedule_develop.entity.ScheduleDevelop;
import com.schedule_develop.entity.User;
import com.schedule_develop.exception.ElementNotFoundException;
import com.schedule_develop.exception.IllegalPasswordException;
import com.schedule_develop.repository.ScheduleRepository;
import com.schedule_develop.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    // 속성
    private final ScheduleRepository scheduleRepository;
    private final UserRepository userRepository;
    // 생성자

    // 기능
    // 일정 생성 및 저장
    @Transactional
    public CreateScheduleResponse save(long userId, CreateScheduleRequest request) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다.")
        );

        ScheduleDevelop schedule = new ScheduleDevelop(
                request.getTitle(),
                request.getContent(),
                user
        );
        ScheduleDevelop savedSchedule = scheduleRepository.save(schedule);

        return new CreateScheduleResponse(
                savedSchedule.getId(),
                savedSchedule.getTitle(),
                savedSchedule.getContent(),
                savedSchedule.getUser(),
                savedSchedule.getCreatedAt(),
                savedSchedule.getModifiedAt()
        );
    }

    // 일정 단 건 조회
    @Transactional
    public GetScheduleResponse findOne(long scheduleId) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ElementNotFoundException("없는 일정입니다.")
        );
        return new GetScheduleResponse(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getUser(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }

    // 일정 목록 조회
    @Transactional
    public List<GetScheduleResponse> findAllByUserName(long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ElementNotFoundException("없는 유저입니다")
        );

        List<ScheduleDevelop> scheduleList;
        scheduleList = scheduleRepository.findAllByUser(user);

        return scheduleList.stream()
                .map(schedule -> new GetScheduleResponse(
                        schedule.getId(),
                        schedule.getTitle(),
                        schedule.getContent(),
                        schedule.getUser(),
                        schedule.getCreatedAt(),
                        schedule.getModifiedAt()
                ))
                .toList();
    }

    // 일정 수정
    @Transactional
    public UpdateScheduleResponse update(Long scheduleId, UpdateScheduleRequest request) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ElementNotFoundException("없는 일정입니다.")
        );

        if (schedule.getUser().getPassword().equals(request.getPassword())) {
            schedule.updateSchedule(request.getTitle(), request.getContent());
        } else {
            throw new IllegalPasswordException("잘못된 비밀번호입니다");
        }

        return new UpdateScheduleResponse(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }

    // 일정 삭제
    @Transactional
    public void delete(long scheduleId, DeleteScheduleRequest request) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ElementNotFoundException("없는 일정입니다.")
        );

        if (schedule.getUser().getPassword().equals(request.getPassword())) {
            scheduleRepository.deleteById(scheduleId);
        } else {
            throw new IllegalPasswordException("잘못된 비밀번호입니다");
        }
    }
}
