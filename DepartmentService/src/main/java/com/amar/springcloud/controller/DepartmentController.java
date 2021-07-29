package com.amar.springcloud.controller;

import com.amar.springcloud.entity.Department;
import com.amar.springcloud.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id) {
        return departmentService.findDepartmentById(id);
    }

    @GetMapping("/")
    public List<Department> findAll() {
        return departmentService.findAllDepartments();
    }
}
