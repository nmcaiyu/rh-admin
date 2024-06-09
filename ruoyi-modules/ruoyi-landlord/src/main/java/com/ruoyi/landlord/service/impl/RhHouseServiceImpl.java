package com.ruoyi.landlord.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.landlord.mapper.RhHouseMapper;
import com.ruoyi.landlord.domain.RhHouse;
import com.ruoyi.landlord.service.IRhHouseService;

/**
 * 房屋信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-07
 */
@Service
public class RhHouseServiceImpl implements IRhHouseService 
{
    @Autowired
    private RhHouseMapper rhHouseMapper;

    /**
     * 查询房屋信息
     * 
     * @param id 房屋信息主键
     * @return 房屋信息
     */
    @Override
    public RhHouse selectRhHouseById(Long id)
    {
        return rhHouseMapper.selectRhHouseById(id);
    }

    /**
     * 查询房屋信息列表
     * 
     * @param rhHouse 房屋信息
     * @return 房屋信息
     */
    @Override
    public List<RhHouse> selectRhHouseList(RhHouse rhHouse)
    {
        return rhHouseMapper.selectRhHouseList(rhHouse);
    }

    /**
     * 新增房屋信息
     * 
     * @param rhHouse 房屋信息
     * @return 结果
     */
    @Override
    public int insertRhHouse(RhHouse rhHouse)
    {
        rhHouse.setCreateTime(DateUtils.getNowDate());
        return rhHouseMapper.insertRhHouse(rhHouse);
    }

    /**
     * 修改房屋信息
     * 
     * @param rhHouse 房屋信息
     * @return 结果
     */
    @Override
    public int updateRhHouse(RhHouse rhHouse)
    {
        rhHouse.setUpdateTime(DateUtils.getNowDate());
        return rhHouseMapper.updateRhHouse(rhHouse);
    }

    /**
     * 批量删除房屋信息
     * 
     * @param ids 需要删除的房屋信息主键
     * @return 结果
     */
    @Override
    public int deleteRhHouseByIds(Long[] ids)
    {
        return rhHouseMapper.deleteRhHouseByIds(ids);
    }

    /**
     * 删除房屋信息信息
     * 
     * @param id 房屋信息主键
     * @return 结果
     */
    @Override
    public int deleteRhHouseById(Long id)
    {
        return rhHouseMapper.deleteRhHouseById(id);
    }
}
