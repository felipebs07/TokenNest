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
@Table(name = "permissions_users", catalog = "security")
public class permissions_users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private Long permission_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "menu_id")
    private Long menu_id;

    @Column(name = "read_permission", columnDefinition = "bpchar", length = 3)
    private String read_permission;

    @Column(name = "create_permission", columnDefinition = "bpchar", length = 3)
    private String create_permission;

    @Column(name = "update_permission", columnDefinition = "bpchar", length = 3)
    private String update_permission;

    @Column(name = "delete_permission", columnDefinition = "bpchar", length = 3)
    private String delete_permission;

    @Column(name = "custom_permission", columnDefinition = "jsonb", length = 3)
    private String custom_permission;

    @Column(name = "created_date")
    private LocalDateTime created_date;

    @Column(name = "updated_date")
    private LocalDateTime updated_date;
}
