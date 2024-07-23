package com.example.springlearn.service;

import com.example.springlearn.entity.Department;
import com.example.springlearn.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    @Override
    public List<Department> fetchAllDepartment() {
        return departmentRepository.findAll();
    }
    @Override
    public Department fetchDepartmentById(Long departmentId){
        return departmentRepository.getReferenceById(departmentId);
    }

}