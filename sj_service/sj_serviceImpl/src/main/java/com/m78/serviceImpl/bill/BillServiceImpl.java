package com.m78.serviceImpl.bill;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Bill;
import com.m78.mapper.BillMapper;
import com.m78.service.bill.BillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * 账单业务逻辑实现
 */
@Service(version = "1.0.0")
public class BillServiceImpl  implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Bill> getAllNoBill(int page,int pageSize,String name) {
        int start=(page-1)*pageSize;
        return billMapper.getAllNoBill(start,pageSize,name);
    }

    @Override
    public Long getAllNoBillCount() {
        return billMapper.getAllNoBillCount();
    }

    @Override
    public int deleteBillById(Long id) {
        return billMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateBillById(Long id) {
        return billMapper.updateBillById(id);
    }

    @Override
    public List<Bill> getAllYseBills(int page, int pageSize, String name) {
        int start=(page-1)*pageSize;
        return billMapper.getAllYseBills(start,pageSize,name);
    }

    @Override
    public Long getAllYseBillCount() {
        return billMapper.getAllYseBillCount();
    }

    @Override
    public int deletePiLiangBill(Long[] bills) {
        int num=0;
        for (Long var:bills){
            num=billMapper.deleteByPrimaryKey(var);
            if (num!=1){
                num=2;
                break;
            }
        }
        return num;
    }

    @Override
    public List<Bill> getAllSend(int page, int pageSize, String name) {
        int start=(page-1)*pageSize;
        return billMapper.getAllSend(start,pageSize,name);
    }

    @Override
    public Long getAllSendCount() {
        return billMapper.getAllSendCount();
    }
}
