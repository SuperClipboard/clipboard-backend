package io.github.jasonkayzk.clipboardbackend.dao;

import io.github.jasonkayzk.clipboardbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);

    void deleteById(Long id);
}
