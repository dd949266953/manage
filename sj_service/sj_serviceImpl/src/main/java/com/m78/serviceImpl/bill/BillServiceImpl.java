package com.m78.serviceImpl.bill;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Bill;
import com.m78.mapper.BillMapper;
import com.m78.service.bill.BillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 账单业务逻辑实现
 */
@Service(version = "1.0.0")
public class BillServiceImpl  implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Bill> getAllNoBill(int page,int pageSize) {
        int start=(page-1)*pageSize;
        return billMapper.getAllNoBill(start,pageSize);
    }

    @Override
    public Long getAllNoBillCount() {
        return billMapper.getAllNoBillCount();
    }
}
