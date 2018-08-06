package com.m78.mapper;

import com.m78.entity.Carport;
import com.m78.vo.CarportVo;

import java.util.List;

public interface CarportMapper {
    int deleteByPrimaryKey(Long carportno);

    int insert(Carport record);

    int insertSelective(Carport record);

    Carport selectByPrimaryKey(Long carportno);

    int updateByPrimaryKeySelective(Carport record);

    int updateByPrimaryKey(Carport record);

    /**
     * 查询所有车位
     * @param carportNo
     * @param start
     * @param limit
     * @return
     */
    List<CarportVo>getAllCarport(Long carportNo,int start,int limit);

    /**
     * 查询车位数量
     * @param carportNo
     * @return
     */
    Long getCountCarport(Long carportNo);
}