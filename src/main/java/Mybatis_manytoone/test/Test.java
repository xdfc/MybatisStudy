package Mybatis_manytoone.test;

import Mybatis_manytoone.dao.StudentDao;
import Mybatis_manytoone.entity.Student;
import Mybatis_manytoone.entity.User;
import Mybatis_manytoone.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        StudentDao studentDao = new StudentDao();
        List<Student> list = studentDao.getStudent();
        for(Student stu:list){
            System.out.println("student name is " + stu.getName()+"  teacher is "+ stu.getTeacher().getName());
        }
    }
}
