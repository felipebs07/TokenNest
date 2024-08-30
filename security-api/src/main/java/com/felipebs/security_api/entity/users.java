package com.felipebs.security_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users", catalog = "security")
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "username", length = 200)
    private String username;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "password", length = 60)
    private String password;

    @Column(name = "created_date")
    private LocalDateTime created_date;

    @Column(name = "updated_date")
    private LocalDateTime updated_date;

    @Column(name = "status", columnDefinition = "bpchar", length = 3)
    private String status;
}
