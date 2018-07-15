package com.m78.mapper;

import com.m78.entity.Staff;

import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    /**
     * 查询人员信息
     */
    List<Staff> getStaff();
}