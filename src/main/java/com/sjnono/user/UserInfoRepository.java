package com.sjnono.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByName(String name);

    UserInfo findByEmail(String email);

    UserInfo findByNameAndPassword(String name, String password);
}
