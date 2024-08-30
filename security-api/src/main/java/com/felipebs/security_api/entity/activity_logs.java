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
@Table(name = "activity_logs", catalog = "security")
public class activity_logs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long log_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "action_user")
    private String action_user;

    @Column(name = "action_date")
    private LocalDateTime action_date;

    @Column(name = "ip_address")
    private String ip_address;

    @Column(name = "log_info")
    private String log_info;
}
