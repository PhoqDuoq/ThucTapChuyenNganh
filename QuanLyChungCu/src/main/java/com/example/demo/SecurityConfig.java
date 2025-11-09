package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth

                        // ---- ĐÂY LÀ PHẦN QUAN TRỌNG ----
                        // Cho phép tất cả mọi người truy cập vào các thư mục này
                        .requestMatchers("/css/**", "/js/**", "/img/**", "/vendor/**").permitAll()

                        // Cấu hình các trang admin: Yêu cầu phải đăng nhập
                        .requestMatchers("/admin/**").authenticated()

                        // Tất cả các yêu cầu khác
                        .anyRequest().permitAll() // Hoặc .authenticated() tùy bạn
                )
                .formLogin(form -> form
                        // .loginPage("/login")  // Bạn có thể tạo trang đăng nhập tùy chỉnh sau
                        // .permitAll()
                        .defaultSuccessUrl("/admin/dashboard", true) // Chuyển đến dashboard sau khi login
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                );

        return http.build();
    }
}