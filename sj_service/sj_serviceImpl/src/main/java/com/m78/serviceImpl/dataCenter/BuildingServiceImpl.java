package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Building;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.BuildingMapper;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.dataCenter.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 楼宇接口实现类
 */
@Service(version = "1.0.0")
public class BuildingServiceImpl implements BuildingService {
    // 楼宇
    @Autowired
    private BuildingMapper buildingMapper;
    // 字典
    @Autowired
    private DictionaryItemMapper dictionaryItemMapper;

    /**
     * 楼宇列表
     *
     * @return
     */
    @Override
    public List<Building> getBuildingList(int page, int limit, String buildingName) {
        int start = (page - 1) * limit;
        return buildingMapper.getBuildingList(start, limit, buildingName);
    }

    /**
     * 查询小区数量根据名字
     */
    @Override
    public Long getBuildingCountByName(String buildingName) {
        return buildingMapper.getBuildingCountByName(buildingName);
    }
    /**
     * 根据id修改楼宇
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Building record) {
        return buildingMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return buildingMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加楼宇
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Building record) {
        return buildingMapper.insert(record);
    }

    /**
     * 查询楼宇类型
     *
     * @return
     */
    @Override
    public List<DictionaryItem> getBuildingType() {
        return dictionaryItemMapper.getBuildingType();
    }
}
