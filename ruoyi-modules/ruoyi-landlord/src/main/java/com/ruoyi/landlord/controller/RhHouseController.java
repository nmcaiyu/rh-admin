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
import com.ruoyi.landlord.domain.RhHouse;
import com.ruoyi.landlord.service.IRhHouseService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 房屋信息Controller
 * 
 * @author ruoyi
 * @date 2024-06-07
 */
@RestController
@RequestMapping("/house")
public class RhHouseController extends BaseController
{
    @Autowired
    private IRhHouseService rhHouseService;

    /**
     * 查询房屋信息列表
     */
    @RequiresPermissions("landlord:house:list")
    @GetMapping("/list")
    public TableDataInfo list(RhHouse rhHouse)
    {
        startPage();
        List<RhHouse> list = rhHouseService.selectRhHouseList(rhHouse);
        return getDataTable(list);
    }

    /**
     * 导出房屋信息列表
     */
    @RequiresPermissions("landlord:house:export")
    @Log(title = "房屋信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RhHouse rhHouse)
    {
        List<RhHouse> list = rhHouseService.selectRhHouseList(rhHouse);
        ExcelUtil<RhHouse> util = new ExcelUtil<RhHouse>(RhHouse.class);
        util.exportExcel(response, list, "房屋信息数据");
    }

    /**
     * 获取房屋信息详细信息
     */
    @RequiresPermissions("landlord:house:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rhHouseService.selectRhHouseById(id));
    }

    /**
     * 新增房屋信息
     */
    @RequiresPermissions("landlord:house:add")
    @Log(title = "房屋信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RhHouse rhHouse)
    {
        return toAjax(rhHouseService.insertRhHouse(rhHouse));
    }

    /**
     * 修改房屋信息
     */
    @RequiresPermissions("landlord:house:edit")
    @Log(title = "房屋信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RhHouse rhHouse)
    {
        return toAjax(rhHouseService.updateRhHouse(rhHouse));
    }

    /**
     * 删除房屋信息
     */
    @RequiresPermissions("landlord:house:remove")
    @Log(title = "房屋信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rhHouseService.deleteRhHouseByIds(ids));
    }
}
