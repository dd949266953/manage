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
    List<Staff> getStaff();
    /**
     * 删除
     */
    int deleteByPrimaryKey(Long id);
}
