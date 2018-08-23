package com.m78.serviceImpl.dataCenter;

import com.m78.entity.Tenement;
import com.m78.mapper.TenementMapper;
import lombok.experimental.var;
import org.apache.commons.codec.language.bm.Lang;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TenementServiceImplTest {

    @Autowired
    private TenementMapper tenementMapper;

    @Test
    public void getTenementByCommunity() {
        System.out.println(tenementMapper.getTenementByCommunity(Long.valueOf(1)));
    }

    @Test
    public void addOpenId() {
        System.out.println(tenementMapper.addOpenId("123123"));
    }

    @Test
    public void getDetailTenementByOpenId() {
        System.out.println(tenementMapper.getDetailTenementByOpenId("odqam1GgSludRyl7msRVUZs4cSaE"));
    }

    @Test
    public void updateInfoByPhone() {
        System.out.println(tenementMapper.updateInfoByPhone("15290573037","laji","女","11","111","111"));
    }

    @Test
    @Transactional
    public void getOpenidCount() {
        System.out.println(tenementMapper.getOpenidCount("odqam1GgSludRyl7msRVUZs4cSaE"));
    }

    @Transactional
    @Test
    public void insertSelective() {
        Tenement tenement=new Tenement();
        tenement.setCommunityid(Long.valueOf(1));
        tenement.setName("垃圾");
        tenement.setPhone("电话");
        tenement.setState(Long.valueOf(2));
        tenement.setQqnumber(Long.valueOf(3123));
        tenement.setWxnumber("123");
        tenement.setSex("nan");
        tenement.setNation("汉");
        tenement.setIdcard("213123");
        tenement.setRegistrationdate(new Date());
        tenement.setOwnernumber(Long.valueOf(123));
        System.out.println(tenement);
    }

    @Test
    public void getDetailTenementByPhone() {
        System.out.println(tenementMapper.getDetailTenementByPhone("15290573037"));
    }

    @Test
    public void getHouseCountByOpenid() {
        System.out.println(tenementMapper.getHouseCountByOpenid("odqam1GgSludRyl7msRVUZs4cSaE"));
    }

    @Test
    public void getCarCountByOpenid() {
        System.out.println(tenementMapper.getCarCountByOpenid("odqam1GgSludRyl7msRVUZs4cSaE"));
    }

    @Test
    public void getCarportCountByOpenid() {
        System.out.println(tenementMapper.getCarportCountByOpenid("odqam1GgSludRyl7msRVUZs4cSaE"));
    }
}