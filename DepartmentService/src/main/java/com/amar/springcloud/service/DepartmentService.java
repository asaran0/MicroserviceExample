package com.amar.springcloud.service;

import com.amar.springcloud.entity.Department;
import com.amar.springcloud.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        Optional<Department> department = departmentRepo.findById(departmentId);
        return department.get();
    }

    public List<Department> findAllDepartments() {
        return departmentRepo.findAll();
    }
}
