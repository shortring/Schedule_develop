package com.schedule_develop.controller;

import com.schedule_develop.dto.*;
import com.schedule_develop.service.ScheduleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    // 속성
    private final ScheduleService scheduleService;

    // 생성자

    // 기능
    // 일정 생성
    @PostMapping("/schedule_develops")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@Valid @RequestBody CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.save(request));
    }

    // 일정 선택 조회
    @GetMapping("/schedule_develops/{scheduleId}")
    public ResponseEntity<GetScheduleResponse> getSchedule(@PathVariable long scheduleId) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findOne(scheduleId));
    }

    // 일정 목록 조회
    @GetMapping("/schedule_develops")
    public ResponseEntity<List<GetScheduleResponse>> getScheduleList(@RequestParam String scheduleName) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findAllByName(scheduleName));
    }

    // 일정 수정
    @PutMapping("/schedule_develops/{scheduleId}")
    public ResponseEntity<UpdateScheduleResponse> updateSchedule(
            @PathVariable long scheduleId,
            @Valid @RequestBody UpdateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.update(scheduleId, request));
    }

    // 일정 삭제
    @DeleteMapping("/schedule_develops/{scheduleId}")
    public ResponseEntity<Void> deleteSchedule(
            @PathVariable long scheduleId,
            @Valid @RequestBody DeleteScheduleRequest request
    )
    {
        scheduleService.delete(scheduleId, request);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}































