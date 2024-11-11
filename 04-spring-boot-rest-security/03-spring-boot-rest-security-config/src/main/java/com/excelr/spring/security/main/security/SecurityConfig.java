package com.excelr.spring.security.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig
{
    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails aman = User.builder().username("aman").password("{noop}test123").roles("EMPLOYEE").build();

        UserDetails manohar = User.builder().username("manohar").password("{noop}test123").roles("MANAGER").build();

        UserDetails jagan = User.builder().username("jagan").password("{noop}test123").roles("EMPLOYEE", "MANAGER", "ADMIN").build();

        return new InMemoryUserDetailsManager(aman, manohar, jagan);
    }
}
