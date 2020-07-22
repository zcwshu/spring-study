package com.zcw.mapper;

import com.zcw.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:03 2020/7/22
 */
public class UserMapperImpl implements UserMapper{

    //我们的操作原来都是用sqlSession来执行,现在都是用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return  mapper.selectUser();
    }
}
