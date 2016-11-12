package com.zhuyan.mapper;

import java.util.List;

import com.zhuyan.pojo.User;

public interface UserMapper {
	// 1、 根据用户ID查询用户信息
	public User findUserById(int id);
}
