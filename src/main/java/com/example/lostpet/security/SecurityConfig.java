package com.example.lostpet.security;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig{
    /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        authorizedConfig ->{
                            authorizedConfig.requestMatchers("/public").permitAll();
                            authorizedConfig.anyRequest().authenticated();
                        }
                )
                .formLogin(Customizer.withDefaults())
                .build();
    }*/
}
