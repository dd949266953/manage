package com.m78.service.dataCenter;

import com.m78.entity.Building;
import com.m78.entity.CommunityBuilding;
import com.m78.entity.DictionaryItem;
import com.m78.vo.BuildingVo;

import java.util.List;

/**
 * 楼宇接口
 */
public interface BuildingService {

    /**
     * 查询楼宇列表
     */
    List<BuildingVo> getBuildingList(int page, int limit, String buildingName);

    /**
     * 查询楼宇总数根据名称
     * @return
     */
    Long getBuildingCountByName(String buildingName);

    /**
     * 根据id修改楼宇
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Building record);

    /**
     * 删除楼宇
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加楼宇
     */
    int insert(BuildingVo record);

    /**
     * 查询楼宇类型
     */
    List<DictionaryItem> getBuildingType();


}
