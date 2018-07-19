package com.m78.serviceImpl.bill;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Bill;
import com.m78.entity.ChargeId;
import com.m78.mapper.BillMapper;
import com.m78.mapper.ChargeIdMapper;
import com.m78.mapper.CommunityMapper;
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
    @Autowired
    private ChargeIdMapper chargeIdMapper;
    @Autowired
    private CommunityMapper communityMapper;

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

    @Override
    public int addBill(Bill bill, ChargeId chargeId) {
        int num= billMapper.insertSelective(bill);
        if(num==1){
            chargeId.setBillid(bill.getId());
           num= chargeIdMapper.insertSelective(chargeId);
        }
        return  num;
    }

    @Override
    public int addImportBill(Bill bill, String charItemName,
                             String type, String communityName,
                             Long singId, String phone) {
        Long communityId=communityMapper
        return 0;
    }
}
