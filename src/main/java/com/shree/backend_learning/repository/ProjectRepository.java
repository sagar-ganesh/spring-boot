package com.shree.backend_learning.repository;

import com.shree.backend_learning.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
