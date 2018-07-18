package com.m78.service.staff;

import com.m78.entity.Staff;

import java.util.List;

/**
 * 人员接口
 */
public interface staffService {
    /**
     * 查询员工
     * @return
     */
        List<Staff> getStaff(int page,int pageSize,String name);

    /**
     * 查询员工数量
     */
    Long getStaffNumber();

    /**
     * 删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加员工
     */
    int insert(Staff record);

    /**
     * 根据id进行查询
     */
    Staff getStaffId(int id);
}
