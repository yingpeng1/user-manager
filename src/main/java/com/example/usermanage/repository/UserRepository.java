package com.example.usermanage.repository;

import com.example.usermanage.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity,String> {
    Page<UserEntity> findAll(Pageable pageable);
    UserEntity findByUserNameOrEmail(String userName,String email);
    UserEntity findByUserName(String userName);
    UserEntity findByEmail(String email);
}
