package com.m78.service.bill;
/**
 * 账单业务接口
 */

import com.m78.entity.Bill;
import com.m78.entity.ChargeId;

import java.util.Arrays;
import java.util.List;

public interface BillService {

    /**
     * 获取所有未缴账单
     * @return
     */
    List<Bill> getAllNoBill(int page,int pageSize,String name);

    /**
     * 获取所有未缴账单总数
     * @return
     */
    Long getAllNoBillCount();

    /**
     * 根据id删除账单
     * @param id
     * @return
     */
    int deleteBillById(Long id);

    /**
     * 更新未缴账单为已收费
     * @param id
     * @return
     */
    int updateBillById(Long id);

    /**
     * 查询所有已缴费的账单
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    List<Bill> getAllYseBills(int page,int pageSize,String name);

    /**
     * 获取已缴费账单的总数
     * @return
     */
    Long getAllYseBillCount();

    /**
     * 批量删除
     * @param bills
     * @return
     */
    int deletePiLiangBill(Long [] bills);

    /**
     * 获取所有通知的账单数据
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    List<Bill> getAllSend(int page,int pageSize,String name);

    /**
     * 获取通知总数
     * @return
     */
    Long getAllSendCount();

    /**
     * 添加账单
     * @return
     */
    int addBill(Bill bill, ChargeId chargeId);

    int addImportBill(Bill bill,String charItemName,String type,String phone);
}
