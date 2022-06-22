package com.example.uploadimage.Repo;

import com.example.uploadimage.Domain.ImageDb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepo extends JpaRepository<ImageDb, Long>{
    Optional<ImageDb> findByName(String name);
}
