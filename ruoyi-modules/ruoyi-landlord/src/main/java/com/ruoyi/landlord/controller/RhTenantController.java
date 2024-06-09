package com.ruoyi.landlord.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.landlord.domain.RhTenant;
import com.ruoyi.landlord.service.IRhTenantService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 租户信息Controller
 * 
 * @author ruoyi
 * @date 2024-06-09
 */
@RestController
@RequestMapping("/tenant")
public class RhTenantController extends BaseController
{
    @Autowired
    private IRhTenantService rhTenantService;

    /**
     * 查询租户信息列表
     */
    @RequiresPermissions("landlord:tenant:list")
    @GetMapping("/list")
    public TableDataInfo list(RhTenant rhTenant)
    {
        startPage();
        List<RhTenant> list = rhTenantService.selectRhTenantList(rhTenant);
        return getDataTable(list);
    }

    /**
     * 导出租户信息列表
     */
    @RequiresPermissions("landlord:tenant:export")
    @Log(title = "租户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RhTenant rhTenant)
    {
        List<RhTenant> list = rhTenantService.selectRhTenantList(rhTenant);
        ExcelUtil<RhTenant> util = new ExcelUtil<RhTenant>(RhTenant.class);
        util.exportExcel(response, list, "租户信息数据");
    }

    /**
     * 获取租户信息详细信息
     */
    @RequiresPermissions("landlord:tenant:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(rhTenantService.selectRhTenantById(id));
    }

    /**
     * 新增租户信息
     */
    @RequiresPermissions("landlord:tenant:add")
    @Log(title = "租户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RhTenant rhTenant)
    {
        return toAjax(rhTenantService.insertRhTenant(rhTenant));
    }

    /**
     * 修改租户信息
     */
    @RequiresPermissions("landlord:tenant:edit")
    @Log(title = "租户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RhTenant rhTenant)
    {
        return toAjax(rhTenantService.updateRhTenant(rhTenant));
    }

    /**
     * 删除租户信息
     */
    @RequiresPermissions("landlord:tenant:remove")
    @Log(title = "租户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(rhTenantService.deleteRhTenantByIds(ids));
    }
}
