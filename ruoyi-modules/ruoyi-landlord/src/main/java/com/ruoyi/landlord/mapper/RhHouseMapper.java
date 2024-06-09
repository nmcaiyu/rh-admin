package com.ruoyi.landlord.mapper;

import java.util.List;
import com.ruoyi.landlord.domain.RhHouse;

/**
 * 房屋信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-07
 */
public interface RhHouseMapper 
{
    /**
     * 查询房屋信息
     * 
     * @param id 房屋信息主键
     * @return 房屋信息
     */
    public RhHouse selectRhHouseById(Long id);

    /**
     * 查询房屋信息列表
     * 
     * @param rhHouse 房屋信息
     * @return 房屋信息集合
     */
    public List<RhHouse> selectRhHouseList(RhHouse rhHouse);

    /**
     * 新增房屋信息
     * 
     * @param rhHouse 房屋信息
     * @return 结果
     */
    public int insertRhHouse(RhHouse rhHouse);

    /**
     * 修改房屋信息
     * 
     * @param rhHouse 房屋信息
     * @return 结果
     */
    public int updateRhHouse(RhHouse rhHouse);

    /**
     * 删除房屋信息
     * 
     * @param id 房屋信息主键
     * @return 结果
     */
    public int deleteRhHouseById(Long id);

    /**
     * 批量删除房屋信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRhHouseByIds(Long[] ids);
}
