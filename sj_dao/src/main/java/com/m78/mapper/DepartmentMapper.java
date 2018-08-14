package com.m78.mapper;

import com.m78.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    /**
     * 部门查询
     */
    List<Department> getDepartment();

    /**
     * 分页根据名称查询部门信息
     * @param name
     * @param start
     * @param end
     * @return
     */
    List<Department> getAllDepartmentByName(@Param("name") String name,@Param("start") int start,
                                            @Param("end") int end);

    /**
     * 获取总数
     * @param name
     * @return
     */
    Long getAllCount(@Param("name") String name);
}