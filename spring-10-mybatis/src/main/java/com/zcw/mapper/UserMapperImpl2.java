package com.zcw.mapper;

import com.zcw.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:32 2020/7/22
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
