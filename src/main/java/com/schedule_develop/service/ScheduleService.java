package com.schedule_develop.service;

import com.schedule_develop.dto.*;
import com.schedule_develop.entity.ScheduleDevelop;
import com.schedule_develop.exception.IllegalPasswordException;
import com.schedule_develop.exception.ScheduleNotFoundException;
import com.schedule_develop.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class ScheduleService {
    // 속성
    private final ScheduleRepository scheduleRepository;
    // 생성자

    // 기능
    // 일정 생성 및 저장
    @Transactional
    public CreateScheduleResponse save(CreateScheduleRequest request) {
        ScheduleDevelop schedule = new ScheduleDevelop(
                request.getTitle(),
                request.getContent(),
                request.getName(),
                request.getPassword()
        );
        ScheduleDevelop savedSchedule = scheduleRepository.save(schedule);

        return new CreateScheduleResponse(
                savedSchedule.getId(),
                savedSchedule.getTitle(),
                savedSchedule.getContent(),
                savedSchedule.getName(),
                savedSchedule.getCreatedAt(),
                savedSchedule.getModifiedAt()
        );
    }

    // 일정 단 건 조회
    @Transactional
    public GetScheduleResponse findOne(long scheduleId) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ScheduleNotFoundException("없는 일정입니다.")
        );
        return new GetScheduleResponse(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getName(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }

    // 일정 목록 조회 (이름으로 검색)
    @Transactional
    public List<GetScheduleResponse> findAllByName(String scheduleName) {
        List<ScheduleDevelop> scheduleList;
        if(scheduleName.isEmpty()) {
            scheduleList = scheduleRepository.findAll();
        }else {
            scheduleList = scheduleRepository.findAllByName(scheduleName);
        }
        List<GetScheduleResponse> dtoList = new ArrayList<>();

        scheduleList.stream()
                .forEach(schedule -> { dtoList.add(new GetScheduleResponse(schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getName(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
                ));
                }
        );

        return dtoList;
    }

    // 일정 수정
    @Transactional
    public UpdateScheduleResponse update(Long scheduleId, UpdateScheduleRequest request) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ScheduleNotFoundException("없는 일정입니다.")
        );

        if (schedule.getPassword().equals(request.getPassword())) {
            schedule.updateSchedule(request.getTitle(), request.getName());
        } else {
            throw new IllegalPasswordException("잘못된 비밀번호입니다");
        }

        return new UpdateScheduleResponse(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getName(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }

    // 일정 삭제
    @Transactional
    public void delete(long scheduleId, DeleteScheduleRequest request) {
        ScheduleDevelop schedule = scheduleRepository.findById(scheduleId).orElseThrow(
                () -> new ScheduleNotFoundException("없는 일정입니다.")
        );

        if (schedule.getPassword().equals(request.getPassword())) {
            scheduleRepository.deleteById(scheduleId);
        } else {
            throw new IllegalPasswordException("잘못된 비밀번호입니다");
        }
    }
}
