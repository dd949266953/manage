package com.m78.mapper;

import com.m78.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
    //查询所有未缴账单
    List<Bill> getAllNoBill(@Param("page") int page,@Param("pageSize")int pageSize);
    //查询未缴账单总数
    Long  getAllNoBillCount();

}