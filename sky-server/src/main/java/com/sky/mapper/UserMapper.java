package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {
    /**
     * 根据openid查询用户信息
     *
     * @param openid
     * @return
     */
    @Select("select * from user where openid=#{openid}")
    User getByOpenid(String openid);

    /**
     * 添加新用户信息
     *
     * @param user
     */
    void insert(User user);

    /**
     * 根据userId查询用户信息
     *
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{userId}")
    User getById(Long userId);

    /**
     * 根据时间区间统计用户数量
     *
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
