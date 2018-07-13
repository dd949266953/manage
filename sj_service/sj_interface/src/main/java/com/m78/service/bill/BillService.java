package com.m78.service.bill;
/**
 * 账单业务接口
 */

import com.m78.entity.Bill;

import java.util.List;

public interface BillService {

    /**
     * 获取所有未缴账单
     * @return
     */
    List<Bill> getAllNoBill(int page,int pageSize);

    /**
     * 获取所有未缴账单总数
     * @return
     */
    Long getAllNoBillCount();
}
