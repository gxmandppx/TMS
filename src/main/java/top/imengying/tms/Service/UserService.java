package top.imengying.tms.Service;

import top.imengying.tms.Entity.User;

public interface UserService {
    public User login(String username,String password);
}
