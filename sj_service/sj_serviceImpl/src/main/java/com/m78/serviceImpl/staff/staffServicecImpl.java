package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Staff;
import com.m78.mapper.StaffMapper;
import com.m78.service.staff.staffService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class staffServicecImpl implements staffService {

    @Autowired
    private StaffMapper staffMapper;

    /**
     * 员工信息
     * @return
     */
    @Override
    public List<Staff> getStaff() {
        return staffMapper.getStaff();
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return staffMapper.deleteByPrimaryKey(id);
    }
}
