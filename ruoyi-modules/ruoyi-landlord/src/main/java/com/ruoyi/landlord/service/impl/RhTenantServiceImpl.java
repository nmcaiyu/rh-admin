package com.ruoyi.landlord.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.landlord.mapper.RhTenantMapper;
import com.ruoyi.landlord.domain.RhTenant;
import com.ruoyi.landlord.service.IRhTenantService;

/**
 * 租户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-09
 */
@Service
public class RhTenantServiceImpl implements IRhTenantService 
{
    @Autowired
    private RhTenantMapper rhTenantMapper;

    /**
     * 查询租户信息
     * 
     * @param id 租户信息主键
     * @return 租户信息
     */
    @Override
    public RhTenant selectRhTenantById(Integer id)
    {
        return rhTenantMapper.selectRhTenantById(id);
    }

    /**
     * 查询租户信息列表
     * 
     * @param rhTenant 租户信息
     * @return 租户信息
     */
    @Override
    public List<RhTenant> selectRhTenantList(RhTenant rhTenant)
    {
        return rhTenantMapper.selectRhTenantList(rhTenant);
    }

    /**
     * 新增租户信息
     * 
     * @param rhTenant 租户信息
     * @return 结果
     */
    @Override
    public int insertRhTenant(RhTenant rhTenant)
    {
        rhTenant.setCreateTime(DateUtils.getNowDate());
        return rhTenantMapper.insertRhTenant(rhTenant);
    }

    /**
     * 修改租户信息
     * 
     * @param rhTenant 租户信息
     * @return 结果
     */
    @Override
    public int updateRhTenant(RhTenant rhTenant)
    {
        rhTenant.setUpdateTime(DateUtils.getNowDate());
        return rhTenantMapper.updateRhTenant(rhTenant);
    }

    /**
     * 批量删除租户信息
     * 
     * @param ids 需要删除的租户信息主键
     * @return 结果
     */
    @Override
    public int deleteRhTenantByIds(Integer[] ids)
    {
        return rhTenantMapper.deleteRhTenantByIds(ids);
    }

    /**
     * 删除租户信息信息
     * 
     * @param id 租户信息主键
     * @return 结果
     */
    @Override
    public int deleteRhTenantById(Integer id)
    {
        return rhTenantMapper.deleteRhTenantById(id);
    }
}
