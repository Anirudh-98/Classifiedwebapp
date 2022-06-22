package com.example.app.Database;

import com.example.app.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
    List<User> findByBrand(String brand);
}
