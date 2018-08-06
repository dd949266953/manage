package com.m78.service.dataCenter;

import com.m78.entity.DictionaryItem;
import com.m78.entity.House;
import com.m78.vo.HouseVo;

import java.util.List;

public interface HouseService {
    /**
     * 查询所有房屋
     * @return
     */
    List<HouseVo> getAllHouse(String houseName,int start,int limit);

    /**
     * 查询房屋类型
     * @return
     */
    List<DictionaryItem>getHouseType();

    /**
     * 查询房屋状态
     * @return
     */
    List<DictionaryItem>getHouseState();

    /**
     * 添加房屋
     * @return
     */
    int insertHouse(Long buildingId, House house);

    /**
     * 根据主键删除
     * @param houseid
     * @return
     */
    int deleteByPrimaryKey(Long houseid);

    /**
     * 查询房屋总数根据房号
     * @param houseNo
     * @return
     */
    Long getHouseCountByName(Long houseNo);
}
