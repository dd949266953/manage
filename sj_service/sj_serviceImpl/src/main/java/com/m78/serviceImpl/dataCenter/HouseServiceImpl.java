package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DictionaryItem;
import com.m78.entity.House;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.mapper.HouseBulidingMapper;
import com.m78.mapper.HouseMapper;
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
    public Long getHouseCountByName(Long houseNo) {
        return houseMapper.getHouseCountByName(houseNo);
    }
}
