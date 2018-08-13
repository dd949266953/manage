package com.m78.serviceImpl.bill;

import com.m78.mapper.ChargeitemMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ChargeItemServiceImplTest {
    @Autowired
    private ChargeitemMapper chargeitemMapper;
    @Test
    public void getAllCharge() {
        System.out.println(chargeitemMapper.getAllCharge());
    }
}