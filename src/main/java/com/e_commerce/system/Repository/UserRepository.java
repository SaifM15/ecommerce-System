package com.e_commerce.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_commerce.system.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
