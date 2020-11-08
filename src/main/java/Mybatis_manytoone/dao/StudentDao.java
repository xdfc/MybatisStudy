package Mybatis_manytoone.dao;

import Mybatis_manytoone.entity.Student;
import Mybatis_manytoone.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class StudentDao {
    public List<Student> getStudent() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSession();
        List<Student> list= sqlSession.selectList("Mybatis_manytoone.entity.student.mapper.getStudents");
        sqlSession.close();
        return list;
    }
}
