package Mybatis_annotation.dao;

import Mybatis_annotation.entity.User;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserDao {

    //注解开发不需要mapper.xml的配置文件
    @Select("select * from user")
    List<User> getList();
}
