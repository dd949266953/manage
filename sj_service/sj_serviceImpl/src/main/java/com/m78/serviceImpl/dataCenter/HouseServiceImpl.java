package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DictionaryItem;
import com.m78.entity.House;
import com.m78.entity.HouseCharitem;
import com.m78.entity.HouseTentment;
import com.m78.mapper.*;
import com.m78.service.dataCenter.HouseService;
import com.m78.vo.HouseVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Autowired
    private DictionaryItemMapper dictionaryItemMapper;
    @Autowired
    private HouseBulidingMapper houseBulidingMapper;
    @Autowired
    private HouseCharitemMapper houseCharitemMapper;
    @Autowired
    private HouseTentmentMapper houseTentmentMapper;
    @Override
    public List<HouseVo> getAllHouse(String houseName, int page, int limit) {
        int start=(page-1)*limit;
        return houseMapper.getAllHouse(houseName,start,limit);
    }

    /**
     * 查询房屋类型
     * @return
     */
    @Override
    public List<DictionaryItem> getHouseType() {
        return dictionaryItemMapper.getHouseType();
    }

    /**
     * 查询房屋状态
     * @return
     */
    @Override
    public List<DictionaryItem> getHouseState() {
        return dictionaryItemMapper.getHouseState();
    }

    @Override
    public int insertHouse(Long buildingId, House house) {
        int houseResult=houseMapper.insertSelective(house);
        Long houseId=house.getHouseid();
        int num=houseBulidingMapper.insert(buildingId,houseId);
        int result=0;
        if (houseResult==1&&num==1){
            result=1;
        }
        return result;
    }

    /**
     * 根据主键删除
     * @param houseid
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long houseid) {
        return houseMapper.deleteByPrimaryKey(houseid);
    }

    @Override
    public Long getHouseCountByName(String houseName) {
        return houseMapper.getHouseCountByName(houseName);
    }

    @Override
    public int insertChargeByHouseId(HouseCharitem record) {
        return houseCharitemMapper.insertChargeByHouseId(record);
    }

    @Override
    public int bindHouseRelationTenement(HouseTentment houseTentment) {
        int count=houseTentmentMapper.getTenementAndHouseCount(houseTentment.getHouseid(),houseTentment.getTentmentid());
        int result=0;
        //说明当前住户和当前房屋存在关系  直接修改
        if (count!=0){
            result=houseTentmentMapper.updateRelationByTenementIdAndHouseId(houseTentment);
        }else {
            //不存在关系  添加
            result=houseTentmentMapper.insertSelective(houseTentment);
        }
        return result;
    }

    @Override
    public List<House> getHouseByUnit(Long unitNumber) {
        return houseMapper.getHouseByUnit(unitNumber);
    }
}
