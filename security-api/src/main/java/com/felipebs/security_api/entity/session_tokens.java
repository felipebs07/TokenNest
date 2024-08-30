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
@Table(name = "session_tokens", catalog = "security")
public class session_tokens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_id")
    private Long token_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "token")
    private String token;

    @Column(name = "ip_address")
    private String ip_address;

    @Column(name = "created_date")
    private LocalDateTime created_date;

    @Column(name = "expired_date")
    private LocalDateTime expired_date;
}
