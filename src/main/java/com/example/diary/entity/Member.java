package com.example.diary.entity;

import com.example.diary.constant.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "members")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userid;

    private String userpw;

    private String userpw1;

    private String name;

    private String phonenum;

    private String email;

    private String address;

    private Role role;
}
