package com.m78.serviceImpl.dataCenter;

import com.m78.entity.HouseTentment;
import com.m78.mapper.HouseTentmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseServiceImplTest {

    @Autowired
    private HouseTentmentMapper houseTentmentMapper;

    @Test
    public void bindHouseRelationTenement() {
        HouseTentment houseTentment=new HouseTentment();
        houseTentment.setHouseid(Long.valueOf(1));
        houseTentment.setTentmentid(Long.valueOf(1));
        houseTentment.setRelationid(Long.valueOf(48));
        System.out.println(houseTentmentMapper.insertSelective(houseTentment));
    }
}