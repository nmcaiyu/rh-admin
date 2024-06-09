package com.ruoyi.landlord.mapper;

import java.util.List;
import com.ruoyi.landlord.domain.RhTenant;

/**
 * 租户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-09
 */
public interface RhTenantMapper 
{
    /**
     * 查询租户信息
     * 
     * @param id 租户信息主键
     * @return 租户信息
     */
    public RhTenant selectRhTenantById(Integer id);

    /**
     * 查询租户信息列表
     * 
     * @param rhTenant 租户信息
     * @return 租户信息集合
     */
    public List<RhTenant> selectRhTenantList(RhTenant rhTenant);

    /**
     * 新增租户信息
     * 
     * @param rhTenant 租户信息
     * @return 结果
     */
    public int insertRhTenant(RhTenant rhTenant);

    /**
     * 修改租户信息
     * 
     * @param rhTenant 租户信息
     * @return 结果
     */
    public int updateRhTenant(RhTenant rhTenant);

    /**
     * 删除租户信息
     * 
     * @param id 租户信息主键
     * @return 结果
     */
    public int deleteRhTenantById(Integer id);

    /**
     * 批量删除租户信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRhTenantByIds(Integer[] ids);
}
