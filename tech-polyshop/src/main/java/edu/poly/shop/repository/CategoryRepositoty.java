package edu.poly.shop.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.shop.domain.Category;

@Repository
public interface CategoryRepositoty extends JpaRepository<Category, Long> {
   List<Category> findByNameContaining(String name);
   Page<Category> findByNameContaining(String name, Pageable pageable);
}
