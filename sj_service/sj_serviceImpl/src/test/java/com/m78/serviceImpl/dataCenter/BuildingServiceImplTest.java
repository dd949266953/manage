package com.m78.serviceImpl.dataCenter;

import com.m78.mapper.BuildingMapper;
import com.m78.mapper.TenementMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildingServiceImplTest {

    @Autowired
    private BuildingMapper buildingMapper;

    @Test
    public void getBuildingCountByName() {
    }

    @Test
    public void getBuildingByCommunityId() {
        System.out.println(buildingMapper.getBuildingByCommunityId(Long.valueOf(1)));
    }
}