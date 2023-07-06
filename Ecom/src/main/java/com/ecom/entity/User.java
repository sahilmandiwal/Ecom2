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
@Table(name="users_data2")
public class User {

    @Id
    private String userId;

    @Column(name="user_name")
    private String name;

    @Column(name="user_email")
    private String email;

    @Column(name="user_password")
    private String password;

    @Column(name="gender")
    private String gender;

    @Column(name="about_user")
    private String about;

    @Column(name="user_image_name")
    private String imageName;


}
