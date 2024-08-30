package com.felipebs.security_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "menus", catalog = "security")
public class menus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long menu_id;

    @Column(name = "menu_icon", length = 20)
    private String menu_icon;

    @Column(name = "menu_route", length = 100)
    private String menu_route;

    @Column(name = "menu_name", length = 20)
    private String menu_name;
}
