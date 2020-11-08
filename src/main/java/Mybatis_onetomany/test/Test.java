package Mybatis_onetomany.test;

import Mybatis_onetomany.dao.TeacherDao;
import Mybatis_onetomany.entity.Teacher;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = teacherDao.getTeacher(1);
        System.out.println(teacher);
    }
}
