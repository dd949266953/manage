package com.m78.service.dataCenter;

import com.m78.entity.Tenement;
import com.m78.vo.TenementVo;

import java.util.List;

/**
 * 住户接口
 */
public interface TenementService {

    /**
     * 获取所有住户 分页
     * @return
     */
    List<TenementVo> getAllTenement(String name,int page,int limit);


    /**
     * 根据主键id查询住户详情
     * @param id
     * @return
     */
    Tenement getTenementByPrimaryKeyId(Long id);

    /**
     * 根据主键id删除 住户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 获取总记录数
     * @return
     */
    Integer getTenementCount(String name);
    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    List<Tenement> getDetailAddressByName(String tenementName,int page,int limit);

    /**
     * 更新
     * @param tenement
     * @return
     */
    Integer updateByPrimaryKeySelective(Tenement tenement);
    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    int getTenementCountByName(String tenementName);

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    Long getCarportIdByTenementPhone(String phone);

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    Long getHouseIdByTenementPhone(String phone);

    /**
     * 根据住户手机号查询房屋主键
     * @return
     */
    Tenement getDetailTenementById(Long tenementId);

    /**
     * 查询小区下的所有手机号根据小区id
     * @return
     */
    List<String> getPhoneByCommunityId(Long communityId);
}
