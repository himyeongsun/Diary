package com.example.diary.entity;

import com.example.diary.constant.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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

    @Column(nullable = false, unique = true)
    @Size(min = 8, max = 16)
    private String userid;

    @Column(nullable = false)
    @Size(min = 10, max = 16)
    private String userpw;

    @Column(nullable = false)
    @Size(min = 10, max = 16)
    private String userpw1;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phonenum;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;
}
