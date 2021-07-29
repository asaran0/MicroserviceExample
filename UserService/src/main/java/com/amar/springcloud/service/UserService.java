package com.amar.springcloud.service;

import com.amar.springcloud.entity.User;
import com.amar.springcloud.repository.UserRepository;
import com.amar.springcloud.vo.Department;
import com.amar.springcloud.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Optional<User> userOp = userRepository.findById(userId);
        User newUser = userOp.get();
//        newUser.setId(user.getId());
//        newUser.setAddress(user.getAddress());
//        newUser.setDepartmentId(user.getDepartmentId());
//        newUser.setEmailId(user.getEmailId());

        vo.setUser(newUser);
        Department department;
        department = fetchDepartmentFromMicroservice(newUser.getDepartmentId());
        vo.setDepartment(department);
        return vo;
    }

    // To get department from department microservice we need rest template.
    private Department fetchDepartmentFromMicroservice(long departmentId) {
        // if we are not using service registry
//        return  restTemplate.getForObject(
//                "http://localhost:9001/departments/"+departmentId,
//                Department.class);
        // if we are using service registry
        return  restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/departments/"+departmentId,
                Department.class);

    }
}
