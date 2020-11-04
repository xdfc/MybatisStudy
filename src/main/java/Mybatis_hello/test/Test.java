package Mybatis_hello.test;

import Mybatis_hello.entity.User;
import Mybatis_hello.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        User user = sqlSession.selectOne("UserMap.selectUser",1);
        System.out.println("id= "+user.getId()+",name="+user.getName()+",pwd="+user.getPwd());
        sqlSession.close();
    }
}
