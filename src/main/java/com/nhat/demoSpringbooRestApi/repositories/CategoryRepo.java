package com.nhat.demoSpringbooRestApi.repositories;

import com.nhat.demoSpringbooRestApi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
    List<Category> findByName(String name);
}
