package com.opencart.repository;

import com.opencart.datamodel.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        return LoginModel.builder()
                .email("olena@gmail.com")
                .password("olena")
                .build();
    }
}
