package com.schedule_develop.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "schedule_develops")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScheduleDevelop extends BaseTimeEntity {
    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id값 해쉬로 변경할것
    private Long id;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 50, nullable = false)
    private String content;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String password;

    // 생성자
    public ScheduleDevelop(String title, String content, String name, String password) {
        this.title = title;
        this.content = content;
        this.name = name;
        this.password = password;
    }

    public void updateSchedule(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public void updateScheduleTitle(String title) {
        this.title = title;
    }

    public void updateScheduleName(String name) {
        this.name = name;
    }

    // 기능

}
