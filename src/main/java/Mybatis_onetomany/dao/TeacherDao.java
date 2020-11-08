package Mybatis_onetomany.dao;


import Mybatis_onetomany.entity.Teacher;
import Mybatis_onetomany.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class TeacherDao {
    public Teacher getTeacher(int tid) throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        Teacher teacher= sqlSession.selectOne("Mybatis_onetomay.entity.teacher.mapper.getTeacher",tid);
        sqlSession.close();
        return teacher;
    }
}
