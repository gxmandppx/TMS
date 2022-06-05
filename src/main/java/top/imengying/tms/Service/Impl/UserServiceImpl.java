package top.imengying.tms.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.imengying.tms.Mapper.UserMapper;
import top.imengying.tms.Entity.User;
import top.imengying.tms.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String username,String password) {
        return userMapper.login(username,password);
    }
}
