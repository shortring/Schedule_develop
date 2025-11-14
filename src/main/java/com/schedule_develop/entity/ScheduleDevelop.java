package com.schedule_develop.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Table(name = "schedule_develops")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScheduleDevelop extends BaseTimeEntity {
    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 50, nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // 생성자
    public ScheduleDevelop(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public void updateSchedule(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 기능

}
