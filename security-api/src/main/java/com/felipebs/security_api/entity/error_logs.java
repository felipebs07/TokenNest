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
@Table(name = "error_logs", catalog = "security")
public class error_logs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long log_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "error_date")
    private LocalDateTime error_date;

    @Column(name = "stack_trace")
    private String stack_trace;

    @Column(name = "error_message")
    private String error_message;
}
