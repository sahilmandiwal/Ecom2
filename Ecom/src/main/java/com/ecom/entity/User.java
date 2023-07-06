package com.ecom.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users_data")
public class User {

    @Id
    private String userId;

    @Column(name="user_name", length = 20, nullable = false)
    private String name;

    @Column(name="user_email")
    private String email;

    @Column(name="user_password", length=10, nullable = false)
    private String password;

    @Column(name="gender", length=6,nullable = false)
    private String gender;

    @Column(name="about_user",length=100)
    private String about;

    @Column(name="user_image_name")
    private String imageName;


}
