package com.m78.service.dataCenter;

import com.m78.vo.CarportVo;

import java.util.List;

public interface CarportService {
    /**
     * 查询所有车位
     * @param carportNo
     * @param page
     * @param limit
     * @return
     */
    List<CarportVo> getAllCarport(Long carportNo, int page, int limit);

    /**
     * 查询车位数量
     * @param carportNo
     * @return
     */
    Long getCountCarport(Long carportNo);
}
