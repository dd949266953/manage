package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Building;
import com.m78.entity.CommunityBuilding;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.BuildingMapper;
import com.m78.mapper.CommunityBuildingMapper;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.dataCenter.BuildingService;
import com.m78.vo.BuildingVo;
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
    //小区楼宇关系
    @Autowired
    private CommunityBuildingMapper communityBuildingMapper;

    /**
     * 楼宇列表
     *
     * @return
     */
    @Override
    public List<BuildingVo> getBuildingList(int page, int limit, String buildingName) {
        int start = (page-1) * limit ;
        return buildingMapper.getBuildingList(start,limit,buildingName);
    }

    /**
     * 查询楼宇数量根据名字
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
     * 查询楼宇id和名称根据小区名称
     * @return
     */
    @Override
    public List<BuildingVo> getBuildingIdAndNameByCommunityId(Long communityId) {
        return buildingMapper.getBuildingIdAndNameByCommunityId(communityId);
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
    public int insert(BuildingVo record) {
        Building building=new Building();
        building.setName(record.getName());
        building.setUnittotal(record.getUnittotal());
        building.setPliestotal(record.getPliestotal());
        building.setBuildingtype(Long.valueOf(record.getBuildingtype()));
        building.setBuildingstructure(record.getBuildingstructure());
        building.setOrientation(record.getOrientation());
        //添加成功返回值
        int buildid=buildingMapper.insert(building);
        Long buildingId=building.getId();
        CommunityBuilding communityBuilding=new CommunityBuilding();
        communityBuilding.setCommunitid(record.getCommunityId());
        communityBuilding.setBuildingid(buildingId);
        int cb=communityBuildingMapper.insert(communityBuilding);
        int num=0;
        if(buildid==1&&cb==1){
            num=1;
        }
        return num;
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

    /**
     * 查询单元总数根据楼宇id
     */
    @Override
    public Long getUnitTotalByBuildingId(Long buildingId) {
        return buildingMapper.getUnitTotalByBuildingId(buildingId);
    }
    /**
     * 查询楼层总数根据楼宇id
     * @return
     */
    @Override
    public Long getBuildingPliesById(Long buildingId) {
        return buildingMapper.getBuildingPliesById(buildingId);
    }
}
