package com.example.training.service.impl;

import com.example.training.domain.User;
import com.example.training.mapper.UserMapper;
import com.example.training.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
@CacheConfig(cacheNames = "userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(key = "#account")
    public User findByAccount(String account) {
        User user = userMapper.findUserByAccount(account);
        if (Objects.isNull(user)) {
            logger.warn("User Not Found with username : " + account);
            throw new UsernameNotFoundException("查無該帳號 : " + account);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @CacheEvict(value = "user", key = "#p0")
    public void clear(String account) {

    }

}
