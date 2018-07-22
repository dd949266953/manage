package com.m78.mapper;

import com.m78.entity.Staff;
import org.apache.ibatis.annotations.Param;

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
    List<Staff> getStaff(@Param("page") int page, @Param("pageSize")int pageSize, @Param("name") String name);
    /**
     * 查询人员数量
     */
    Long getStaffNumber();

    /**
     * 根据id进行查询
     */
    Staff getStaffId(@Param("id") int id);


    /**
     * 查询人员信息
     */
    List<Staff> getPersonal();
}