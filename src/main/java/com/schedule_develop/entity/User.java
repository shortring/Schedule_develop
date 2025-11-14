package com.schedule_develop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Entity
@Table(name="users")
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class User extends BaseTimeEntity{
    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String email;
    private String password;
//    @OneToMany(mappedBy = "user")
//    private List<ScheduleDevelop> scheduleDevelopList = new ArrayList<>();

    //생성자
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void updateUser(@NotBlank String name, @Email String email) {
        this.name = name;
        this.email = email;
    }

    //기능
}
