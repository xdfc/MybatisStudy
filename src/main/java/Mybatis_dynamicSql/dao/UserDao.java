package Mybatis_dynamicSql.dao;

import Mybatis_dynamicSql.entity.User;
import Mybatis_dynamicSql.util.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UserDao {
    public List<User> getUserByCondition(Map<String,String> map) throws IOException {
        SqlSession session = MybatisUtil.getSession();
        List<User> list = session.selectList("Mybatis_dynamicSql.entity.User.mapper.UserMap.getUserByCondition",map);
        session.close();
        return list;
    }
}
