package com.abbos.user.repository;

import com.abbos.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:31
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}
