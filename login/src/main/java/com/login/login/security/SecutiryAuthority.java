package com.login.login.security;

import org.springframework.security.core.GrantedAuthority;

import com.login.login.entity.Authority;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SecutiryAuthority implements GrantedAuthority{
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName().toString();
    }

}
