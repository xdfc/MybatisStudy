package Mybatis_crud.dao;

import Mybatis_crud.entity.User;
import Mybatis_crud.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class UserDao {
    public User getById(int id) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        User user = sqlSession.selectOne("UserMap.selectUser",id);
        sqlSession.close();
        return user;
    }

    public List<User> getAll() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        List<User> userList = sqlSession.selectList("UserMap.selectAll");
        sqlSession.close();
        return userList;
    }

    public int addUser(User user) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        int result = sqlSession.insert("UserMap.addUser",user);
        //需要手动提交事务
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    public int updateUser(User user) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        //看源码
        // insert和delete都是调用update的
        int result = sqlSession.update("UserMap.updateUser",user);
        //需要手动提交事务
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    public int deleteUser(int id) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        //换成insert或者update也是可以的
        int result = sqlSession.delete("UserMap.deleteUser",id);
        //需要手动提交事务
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
