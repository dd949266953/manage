package com.m78.service.dataCenter;

import com.m78.entity.DictionaryItem;
import com.m78.vo.CarportVo;

import java.util.List;

public interface CarportService {
    /**
     * 查询所有车位
     * @param
     * @param limit
     * @return
     */
    List<CarportVo> getAllCarport(String carportName,int page, int limit);

    /**
     * 查询车位数量
     * @return
     */
    Long getCountCarport(String carportName);

    /**
     * 查询车位类型
     * @return
     */
    List<DictionaryItem>getCarportType();

    /**
     * 查询车位状态
     * @return
     */
    List<DictionaryItem>getCarportState();
}
