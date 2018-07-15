package com.m78.serviceImpl.Buillding;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Building;
import com.m78.mapper.BuildingMapper;
import com.m78.service.building.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version="1.0.0")
public class BuilldingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    /**
     * 楼宇列表
     * @return
     */
    @Override
    public List<Building> getBuildingList() {
        return buildingMapper.getBuildingList();
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return buildingMapper.deleteByPrimaryKey(id);
    }
}
