package Mybatis_annotation.test;

import Mybatis_annotation.dao.UserDao;
import Mybatis_annotation.entity.User;
import Mybatis_annotation.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> list= userDao.getList();
        for(User u:list){
            System.out.println(u);
        }
    }
}
