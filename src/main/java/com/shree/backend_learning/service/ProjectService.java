package com.shree.backend_learning.service;

import com.shree.backend_learning.entity.Project;
import com.shree.backend_learning.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return this.projectRepository.findAll();
    }

    public Project createProject(Project project) {
        return this.projectRepository.save(project);
    }
}
