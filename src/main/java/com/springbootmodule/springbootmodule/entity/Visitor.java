package com.springbootmodule.springbootmodule.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
@Accessors(chain = true)
public class Visitor {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String lastName;
    private String phone;
    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    private void create(){
        createdAt = new Date();
    }

    @PreUpdate
    private void update(){
        updatedAt = new Date();
    }
}