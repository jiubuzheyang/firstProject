package com.study.myfirst.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.myfirst.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper extends BaseMapper<User> {
}
