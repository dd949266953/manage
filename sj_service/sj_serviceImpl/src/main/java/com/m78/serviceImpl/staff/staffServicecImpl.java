package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Staff;
import com.m78.mapper.StaffMapper;
import com.m78.service.staff.staffService;
import com.sun.org.apache.regexp.internal.RE;
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
    public List<Staff> getStaff(int page, int pageSize, String name) {
        int start=(page-1)*pageSize;
        return staffMapper.getStaff(start,pageSize,name);
    }

    /**
     * 查询员工数量
     * @return
     */
    @Override
    public Long getStaffNumber() {
        return staffMapper.getStaffNumber();
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

    /**
     * 添加员工信息
     * @param record
     * @return
     */
    @Override
    public int insert(Staff record) {
     return staffMapper.insert(record);
    }

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    @Override
    public Staff getStaffId(int id) {
        return staffMapper.getStaffId(id);
    }
}
