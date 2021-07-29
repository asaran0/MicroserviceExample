package com.amar.springcloud.repository;


import com.amar.springcloud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    Department findDepartmentById(Long departmentId);
}
