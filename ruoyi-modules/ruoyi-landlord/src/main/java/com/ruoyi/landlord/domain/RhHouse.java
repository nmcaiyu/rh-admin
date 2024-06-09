package com.ruoyi.landlord.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 房屋信息对象 rh_house
 * 
 * @author ruoyi
 * @date 2024-06-07
 */
public class RhHouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 房屋名称 */
    @Excel(name = "房屋名称")
    private String houseName;

    /** 房屋面积 */
    @Excel(name = "房屋面积")
    private BigDecimal houseArea;

    /** 房屋位置 */
    @Excel(name = "房屋位置")
    private Integer houseLocation;

    /** 房屋定位 */
    @Excel(name = "房屋定位")
    private String housePosition;

    /** 是否出租（N：否、Y：是） */
    @Excel(name = "是否出租", readConverterExp = "N：否、Y：是")
    private String houseLeaseFlag;

    /** 房屋租金 */
    @Excel(name = "房屋租金")
    private BigDecimal houseRent;

    /** 房屋楼层 */
    @Excel(name = "房屋楼层")
    private Integer houseFloor;

    /** 最后电字 */
    @Excel(name = "最后电字")
    private Integer houseMeter;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setHouseName(String houseName) 
    {
        this.houseName = houseName;
    }

    public String getHouseName() 
    {
        return houseName;
    }
    public void setHouseArea(BigDecimal houseArea) 
    {
        this.houseArea = houseArea;
    }

    public BigDecimal getHouseArea() 
    {
        return houseArea;
    }
    public void setHouseLocation(Integer houseLocation)
    {
        this.houseLocation = houseLocation;
    }

    public Integer getHouseLocation()
    {
        return houseLocation;
    }
    public void setHousePosition(String housePosition) 
    {
        this.housePosition = housePosition;
    }

    public String getHousePosition() 
    {
        return housePosition;
    }
    public void setHouseLeaseFlag(String houseLeaseFlag)
    {
        this.houseLeaseFlag = houseLeaseFlag;
    }

    public String getHouseLeaseFlag()
    {
        return houseLeaseFlag;
    }
    public void setHouseRent(BigDecimal houseRent) 
    {
        this.houseRent = houseRent;
    }

    public BigDecimal getHouseRent() 
    {
        return houseRent;
    }
    public void setHouseFloor(Integer houseFloor) 
    {
        this.houseFloor = houseFloor;
    }

    public Integer getHouseFloor() 
    {
        return houseFloor;
    }
    public void setHouseMeter(Integer houseMeter) 
    {
        this.houseMeter = houseMeter;
    }

    public Integer getHouseMeter() 
    {
        return houseMeter;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseName", getHouseName())
            .append("houseArea", getHouseArea())
            .append("houseLocation", getHouseLocation())
            .append("housePosition", getHousePosition())
            .append("houseLeaseFlag", getHouseLeaseFlag())
            .append("houseRent", getHouseRent())
            .append("houseFloor", getHouseFloor())
            .append("houseMeter", getHouseMeter())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
