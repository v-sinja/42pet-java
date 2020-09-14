package com.pet.vsinja.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
public class UserDomain {
    private long seq;
    private String sign_type;
    private String id;
    private String password;
    private String di;
    private String access_token;
}
