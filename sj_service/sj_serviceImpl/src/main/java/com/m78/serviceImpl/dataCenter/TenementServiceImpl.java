package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DictionaryItem;
import com.m78.entity.HouseTentment;
import com.m78.entity.Tenement;
import com.m78.form.TenementForm;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.mapper.HouseTentmentMapper;
import com.m78.mapper.TenementMapper;
import com.m78.service.dataCenter.TenementService;
import com.m78.vo.TenementVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 住户实现类
 */
@Service(version="1.0.0")
public class TenementServiceImpl implements TenementService {

    @Autowired
    private TenementMapper tenementMapper;

    @Autowired
    private HouseTentmentMapper houseTentmentMapper;

    @Autowired
    private DictionaryItemMapper dictionaryItemMapper;

    /**
     * 获取所有住户
     * @return
     */
    @Override
    public List<TenementVo> getAllTenement(String name,int page, int limit) {
        int start=(page-1)*limit;
        return tenementMapper.getAllTenement(name,start,limit);
    }

    @Override
    public Tenement getTenementByPrimaryKeyId(Long id) {
        return  tenementMapper.getTenementByPrimaryKeyId(id);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tenementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer getTenementCount(String name) {
        return tenementMapper.getTenementCount(name);
    }

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    @Override
    public List<Tenement> getDetailAddressByName(String tenementName, int page, int limit) {
        int start=(page-1)*limit;
        return tenementMapper.getDetailAddressByName(tenementName,start,limit);
    }

    @Override
    public Integer updateByPrimaryKeySelective(Tenement tenement) {
        return tenementMapper.updateByPrimaryKeySelective(tenement);
    }

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    @Override
    public int getTenementCountByName(String tenementName) {
        return tenementMapper.getTenementCountByName(tenementName);
    }

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    @Override
    public Long getCarportIdByTenementPhone(String phone) {
        return tenementMapper.getCarportIdByTenementPhone(phone);
    }

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    @Override
    public Long getHouseIdByTenementPhone(String phone) {
        return tenementMapper.getHouseIdByTenementPhone(phone);
    }

    @Override
    public Tenement getDetailTenementById(Long tenementId) {
        return tenementMapper.getDetailTenementById(tenementId);
    }

    /**
     * 查询小区下的所有手机号根据小区id
     * @return
     */
    @Override
    public List<String> getPhoneByCommunityId(Long communityId) {
        return tenementMapper.getPhoneByCommunityId(communityId);
    }

    /**
     * 查询住户相关房屋信息
     * @param tenementId
     * @return
     */
    @Override
    public List<TenementVo> getDetailHouseByTenementId(Long tenementId) {
        return tenementMapper.getDetailHouseByTenementId(tenementId);
    }

    /**
     * 查询住户相关车位信息
     * @param tenementId
     * @return
     */
    @Override
    public List<TenementVo> getDetailCarportByTenementId(Long tenementId) {
        return tenementMapper.getDetailCarportByTenementId(tenementId);
    }

    /**
     * 查询住户相关车辆信息
     * @param tenementId
     * @return
     */
    @Override
    public List<TenementVo> getDetailCarByTenementId(Long tenementId) {
        return tenementMapper.getDetailCarByTenementId(tenementId);
    }
    /**
     * 查询相关住户信息
     * @param tenementId
     * @return
     */
    @Override
    public List<TenementVo> getDetailRelationByTenementId(Long tenementId) {
        return tenementMapper.getDetailRelationByTenementId(tenementId);
    }

    @Override
    public List<Tenement> getTenementByCommunity(Long communityId) {
        return tenementMapper.getTenementByCommunity(communityId);
    }

    /**
     * 获取所有住户身份
     * @return
     */
    @Override
    public List<DictionaryItem> getRelation() {
        return dictionaryItemMapper.getRelation();
    }

    @Override
    public int getOpenidCount(String openid) {
        return tenementMapper.getOpenidCount(openid);
    }

    @Override
    public int updatePhoneByOpenId(String phone, String openId) {
        return tenementMapper.updatePhoneByOpenId(phone,openId);
    }

    @Override
    public int updateInfoByPhone(String phone, String nickname, String sex, String photo, String address, String openId) {
        return tenementMapper.updateInfoByPhone(phone,nickname,sex,photo,address,openId);
    }

    @Override
    public int addOpenId(String openId) {
        return tenementMapper.addOpenId(openId);
    }

    @Override
    public Tenement getDetailTenementByOpenId(String openId) {
        return tenementMapper.getDetailTenementByOpenId(openId);
    }

    @Override
    public Tenement getDetailTenementByPhone(String phone) {
        return tenementMapper.getDetailTenementByPhone(phone);
    }

    @Override
    public int insertSelective(TenementForm record) {
        int num=0;
        Tenement tenement=new Tenement(record.getName(),record.getPhone(),record.getRelation(),record.getQqnumber(),record.getWxnumber(),record.getUrgencyman(),record.getUrgencymanphone(),record.getSex(),record.getNation(),record.getRemark(),record.getCommunity(),record.getIdcard(),record.getBirthday(),record.getOwnernumber());
        int tenementResult=tenementMapper.insertSelective(tenement);
        Long id=tenement.getId();
        HouseTentment houseTentment=new HouseTentment();
        houseTentment.setTentmentid(id);
        houseTentment.setRelationid(record.getRelation());
        houseTentment.setHouseid(record.getHousenumber());
        int houseResult=houseTentmentMapper.insertSelective(houseTentment);
        if (tenementResult==1&&houseResult==1){
            num=1;
        }
        return num;
    }

    @Override
    public int getHouseCountByOpenid(String openId) {
        return tenementMapper.getHouseCountByOpenid(openId);
    }

    @Override
    public int getCarCountByOpenid(String openId) {
        return tenementMapper.getCarCountByOpenid(openId);
    }

    @Override
    public int getCarportCountByOpenid(String openId) {
        return tenementMapper.getCarportCountByOpenid(openId);
    }
}


