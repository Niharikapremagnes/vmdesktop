package com.mindtree.sba.repository;

import com.mindtree.sba.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    List<Brand> findByOrderByNameAsc();

    Brand findByNameEqualsIgnoreCase(String name);
    
}
