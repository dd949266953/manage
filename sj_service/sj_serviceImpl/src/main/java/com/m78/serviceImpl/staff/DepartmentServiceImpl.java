package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Department;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.DepartmentMapper;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.staff.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 实现类
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DictionaryItemMapper dictionaryItemMapper;

    @Override
    public List<Department> getAllDeparment() {
        return departmentMapper.getDepartment();
    }

    @Override
    public List<Department> getAllDeparmentBypage(int page, int limit, String departmentName) {
        int start=(page-1)*limit;
        return departmentMapper.getAllDepartmentByName(departmentName,start,limit);
    }

    @Override
    public int deleteDepartmentById(Long departmentId) {
        return departmentMapper.deleteByPrimaryKey(departmentId);
    }

    @Override
    public Long getAllDepartmentCount(String departmentName) {
        return departmentMapper.getAllCount(departmentName);
    }

    @Override
    public List<DictionaryItem> getUserOption() {
        return dictionaryItemMapper.getUserOption();
    }
}
