package Mybatis_dynamicSql.test;

import Mybatis_dynamicSql.dao.UserDao;
import Mybatis_dynamicSql.entity.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","a");
        UserDao userDao = new UserDao();
        System.out.println(userDao.getUserByCondition(map).toString());
    }
}
