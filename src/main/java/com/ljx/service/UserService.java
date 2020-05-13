package com.ljx.service;

import com.ljx.po.User;

/**
 * Created by ljx on 2019/12/23.
 */
public interface UserService {

    User checkUser(String username, String password);
}
