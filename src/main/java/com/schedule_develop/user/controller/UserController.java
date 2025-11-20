package com.schedule_develop.user.controller;

import com.schedule_develop.user.dto.*;
import com.schedule_develop.user.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {
    // 속성
    private final UserService userService;

    // 생성자

    // 기능
    // 유저 생성 및 저장 (회원가입)
    @PostMapping("/users")
    public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(request));
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<Void> login(@Valid @RequestBody LoginRequest request, HttpSession session) {
        SessionUser sessionUser = userService.login(request);

        session.setAttribute("loginUser", sessionUser);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    // 유저 선택 조회
    @GetMapping("/users/{userId}")
    public ResponseEntity<GetUserResponse> getUser(@PathVariable long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findOne(userId));
    }

    // 유저 전부 조회
    @GetMapping("/users")
    public ResponseEntity<List<GetUserResponse>> getUserList() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    // 유저 수정
    @PatchMapping("/users")
    public ResponseEntity<UpdateUserResponse> updateUser(
            @SessionAttribute(name = "loginUser", required = false) SessionUser sessionUser,
            @Valid @RequestBody UpdateUserRequest request) {
        UpdateUserResponse response = userService.update(sessionUser.getId(), request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    // 유저 삭제
    @DeleteMapping("/users")
    public ResponseEntity<Void> deleteUser(
            @SessionAttribute(name = "loginUser", required = false) SessionUser sessionUser
    )
    {
        userService.delete(sessionUser.getId());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
