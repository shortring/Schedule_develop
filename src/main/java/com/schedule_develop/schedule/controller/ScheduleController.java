package com.schedule_develop.schedule.controller;

import com.schedule_develop.schedule.dto.*;
import com.schedule_develop.schedule.service.ScheduleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/{userId}/schedule_develops")
public class ScheduleController {
    // 속성
    private final ScheduleService scheduleService;

    // 생성자

    // 기능
    // 일정 생성
    @PostMapping
    public ResponseEntity<CreateScheduleResponse> createSchedule(
            @PathVariable long userId,
            @Valid @RequestBody CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.save(userId, request));
    }

    // 일정 선택 조회
    @GetMapping("/{scheduleId}")
    public ResponseEntity<GetScheduleResponse> getSchedule(@PathVariable long scheduleId) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findOne(scheduleId));
    }

    // 일정 목록 조회
    @GetMapping
    public ResponseEntity<List<GetScheduleResponse>> getScheduleList(@PathVariable long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findAllByUserName(userId));
    }

    // 일정 수정
    @PutMapping("/{scheduleId}")
    public ResponseEntity<UpdateScheduleResponse> updateSchedule(
            @PathVariable long scheduleId,
            @Valid @RequestBody UpdateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.update(scheduleId, request));
    }

    // 일정 삭제
    @DeleteMapping("/{scheduleId}")
    public ResponseEntity<Void> deleteSchedule(
            @PathVariable long scheduleId,
            @Valid @RequestBody DeleteScheduleRequest request
    )
    {
        scheduleService.delete(scheduleId, request);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}































