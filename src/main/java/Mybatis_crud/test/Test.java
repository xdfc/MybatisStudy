package Mybatis_crud.test;

import Mybatis_crud.dao.UserDao;
import Mybatis_crud.entity.User;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //根据id查询
        UserDao userDao = new UserDao();
//        System.out.println(userDao.getById(4).toString());
        //查询所有
        List<User> userList = userDao.getAll(2,2);
        for(User u:userList){
            System.out.println(u);
        }
/*        //插入
        User user = new User();
        user.setName("fangcong");
        user.setPwd(28);
        System.out.println(userDao.addUser(user));
        //更新
        User user1 = userDao.getById(2);
        user1.setName("hello");
        System.out.println(userDao.updateUser(user1));
        //删除
        System.out.println(userDao.deleteUser(2));*/
    }
}
