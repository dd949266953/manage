package com.m78.serviceImpl.staff;

import com.m78.entity.Department;
import com.m78.service.staff.DepartmentService;

import java.util.List;

/**
 * 实现类
 */
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public List<Department> getAllDeparment() {
        return null;
    }

    @Override
    public List<Department> getAllDeparmentBypage(int page, int limit, String departmentName) {
        return null;
    }

    @Override
    public int deleteDepartmentById(Long departmentId) {
        return 0;
    }

    @Override
    public Long getAllDepartmentCount(String departmentName) {
        return null;
    }
}
