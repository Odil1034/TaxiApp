//package soft.club.taxizmati.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    String[] WHITE_LIST = new String[]{
//            "/auth/login/**",
//            "/auth/signup/**",
//            "/car/**"
//    };
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, UserDetailsService userDetailsService) throws Exception {
//
//        http.authorizeHttpRequests(auth -> {
//            auth
////                    .requestMatchers(WHITE_LIST).permitAll()
//                    .requestMatchers("/**").authenticated();
//        });
//
//        http.httpBasic(Customizer.withDefaults());
//        http.userDetailsService(userDetailsService);
//
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withUsername("user")
//                .password("{noop}pass")
//                .roles("USER")
//                .build();
//        UserDetails seller = User.withUsername("seller")
//                .password("{noop}pass")
//                .roles("SELLER")
//                .build();
//        UserDetails admin = User.withUsername("admin")
//                .password("{noop}pass")
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin, seller);
//    }
//}
