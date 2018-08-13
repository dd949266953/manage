package com.m78.service.bill;

import com.m78.entity.Chargeitem;

import java.util.List;

public interface ChargeItemService {
    //查询全部收费标准
    List<Chargeitem> getAllCharge();
}
