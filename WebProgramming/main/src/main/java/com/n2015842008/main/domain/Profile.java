package com.n2015842008.main.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Profile {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String network;

    @Column
    private String username;

    @Column
    private String url;

    @Column
    private LocalDateTime createdDate;

    @Builder

    public Profile(String network, String username, String url, LocalDateTime createdDate) {
        this.network = network;
        this.username = username;
        this.url = url;
        this.createdDate = createdDate;
    }
}
