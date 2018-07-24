package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Building;
import com.m78.mapper.BuildingMapper;
import com.m78.service.dataCenter.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 楼宇接口实现类
 */
@Service(version="1.0.0")
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    /**
     * 楼宇列表
     * @return
     */
    @Override
    public List<Building> getBuildingList(int page, int limit, String buildingName) {
        int start=(page-1)*limit;
        return buildingMapper.getBuildingList(start,limit,buildingName);
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

    /**
     * 添加楼宇
     * @param record
     * @return
     */
    @Override
    public int insert(Building record) {
        return buildingMapper.insert(record);
    }
}
