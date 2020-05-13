package com.ljx.dao;

import com.ljx.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ljx on 2019/12/23.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
