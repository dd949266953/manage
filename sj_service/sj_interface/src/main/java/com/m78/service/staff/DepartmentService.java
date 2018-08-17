package com.m78.service.staff;

import com.m78.entity.Department;
import com.m78.entity.DictionaryItem;

import java.util.List;

/**
 * 部门管理
 */
public interface DepartmentService {
    /**
     * 获取所部门
     * @return
     */
    List<Department> getAllDeparment();

    /**
     * 分页查询部门及下属人员总数
     * @return
     */
    List<Department> getAllDeparmentBypage(int page,int limit,String departmentName);

    /**
     * 根据id删除部门信息
     * @param departmentId
     * @return
     */
    int deleteDepartmentById(Long departmentId);

    /**
     * 根据名称获取部门总数
     * @param departmentName
     * @return
     */
    Long getAllDepartmentCount(String departmentName );

    /**
     * 获取员工职位类型
     * @return
     */
    List<DictionaryItem> getUserOption();

}
