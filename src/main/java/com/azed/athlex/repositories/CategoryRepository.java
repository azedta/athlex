package com.azed.athlex.repositories;

import com.azed.athlex.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Category, Long> {
}
