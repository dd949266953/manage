package com.m78.mapper;

import com.m78.entity.House;
import com.m78.entity.HouseTentment;
import com.m78.vo.HouseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    /**
     * 根据主键删除
     *
     * @param houseid
     * @return
     */
    int deleteByPrimaryKey(Long houseid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long houseid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    /**
     * 根据单元查询房屋
     * @param unitNumber
     * @return
     */
    List<House>getHouseByUnit(@Param("unitNumber") Long unitNumber);

    /**
     * 查询所有房屋
     *
     * @return
     */
    List<HouseVo> getAllHouse(@Param("houseName") String houseName, @Param("start") int start, @Param("limit") int limit);

    /**
     * 查询房屋总数根据房号
     *
     * @param houseName
     * @return
     */
    Long getHouseCountByName(@Param("houseName") String houseName);

}