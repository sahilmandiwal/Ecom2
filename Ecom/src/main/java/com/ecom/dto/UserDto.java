package com.ecom.dto;

import lombok.*;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String UserId;

    private String name;

    private String email;
    private String password;
    private String gender;
    private String about;

    private String image;
}
