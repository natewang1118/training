//package com.example.training.security;
//
//import com.example.training.domain.User;
//import com.example.training.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
//
//    @Resource
//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.findByAccount(username);
//        if (user == null) {
//            logger.warn("User Not Found with username : " + username);
//            throw new UsernameNotFoundException("User Not Found with username : " + username);
//        }
//
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//
//        return org.springframework.security.core.userdetails.User.builder()
//                .username(user.getUsername())
//                .password(encodedPassword)
//                .roles("admin").build();
//
////        return new UserDetailsImpl(user.getUsername(), user.getPassword(), new SimpleGrantedAuthority("test"));
//    }
//
//}
