package com.m78.serviceImpl.bill;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Chargeitem;
import com.m78.mapper.ChargeitemMapper;
import com.m78.service.bill.ChargeItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class ChargeItemServiceImpl implements ChargeItemService {
    @Autowired
    private ChargeitemMapper chargeitemMapper;

    @Override
    public List<Chargeitem> getAllCharge() {
        return chargeitemMapper.getAllCharge();
    }
}
