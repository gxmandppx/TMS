package top.imengying.tms.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.imengying.tms.Entity.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User login(String username,String password);
    int addUser(User user);
    List<User> all(int tid);
}
