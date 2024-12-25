package com.webczw.my.swagger.service;

import com.webczw.my.swagger.vo.UserVO;

import java.util.List;

public interface IUserService {
    List<UserVO> findUserListById(Long userId);
}
