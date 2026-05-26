package com.shree.backend_learning.repository;

import com.shree.backend_learning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> { }
