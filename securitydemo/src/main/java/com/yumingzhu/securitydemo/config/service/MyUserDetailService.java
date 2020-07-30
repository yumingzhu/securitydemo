package com.yumingzhu.securitydemo.config.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author yumigzhu
 * @Date 2020/7/30 17:41
 */
@Service
public class MyUserDetailService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("ymz")){
            String password = new BCryptPasswordEncoder().encode("123");
            return  new User(username,password, AuthorityUtils.createAuthorityList("user"));
        }
        return null;
    }
}
