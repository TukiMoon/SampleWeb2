package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.UserInfo;

/**
 * ユーザー情報テーブル Repository(DAO)
 * 
 * @author tukinari
 * 
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}
