package com.ruoyi.landlord.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 租户详细信息
 *
 * @author ruoyi
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RhTenantVo
{
    /** 租户头像 */
    private String tenantAvatar;

    /** 租户姓名 */
    private String tenantName;

    /** 联系方式 */
    private String tenantPhone;

    /** 证件号码 */
    private String tenantCardNumber;

    /** 微信号码 */
    private String tenantWechatNumber;

    /** 微信openid */
    private String tenantOpenid;

    /** 是否租住（N：否、Y：是） */
    private String tenantStatus;

    /** 房屋名称 */
    private String houseName;

    public void setTenantName(String tenantName)
    {
        this.tenantName = tenantName;
    }

    public String getTenantName() 
    {
        return tenantName;
    }
    public void setTenantAvatar(String tenantAvatar)
    {
        this.tenantAvatar = tenantAvatar;
    }

    public String getTenantAvatar()
    {
        return tenantAvatar;
    }
    public void setTenantPhone(String tenantPhone) 
    {
        this.tenantPhone = tenantPhone;
    }

    public String getTenantPhone() 
    {
        return tenantPhone;
    }

    public void setTenantCardNumber(String tenantCardNumber)
    {
        this.tenantCardNumber = tenantCardNumber;
    }

    public String getTenantCardNumber() 
    {
        return tenantCardNumber;
    }
    public void setTenantWechatNumber(String tenantWechatNumber) 
    {
        this.tenantWechatNumber = tenantWechatNumber;
    }

    public String getTenantWechatNumber() 
    {
        return tenantWechatNumber;
    }
    public void setTenantOpenid(String tenantOpenid)
    {
        this.tenantOpenid = tenantOpenid;
    }

    public String getTenantOpenid()
    {
        return tenantOpenid;
    }
    public void setTenantStatus(String tenantStatus) 
    {
        this.tenantStatus = tenantStatus;
    }

    public String getTenantStatus() 
    {
        return tenantStatus;
    }
    public void setHouseName(String houseName)
    {
        this.houseName = houseName;
    }

    public String getHouseName()
    {
        return houseName;
    }

}
