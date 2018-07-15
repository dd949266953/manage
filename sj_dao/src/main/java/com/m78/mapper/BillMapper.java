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
    List<Bill> getAllNoBill(@Param("page") int page,@Param("pageSize")int pageSize,@Param("name") String name);
    //查询未缴账单总数
    Long  getAllNoBillCount();
    //更新未缴账单为已收费
    int updateBillById(@Param("billID") Long billID);
    //查询所有已缴费账单
    List<Bill> getAllYseBills(@Param("page") int page,@Param("pageSize")int pageSize,@Param("name") String name);
    //拆线呢已缴费账单总数
    Long  getAllYseBillCount();

    //获取通知账单数据
    List<Bill> getAllSend(@Param("page") int page,@Param("pageSize")int pageSize,@Param("name")String name);
    //获取所有通知数据总数
    Long getAllSendCount();
}