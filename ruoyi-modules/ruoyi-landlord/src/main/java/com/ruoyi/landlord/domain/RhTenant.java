package com.ruoyi.landlord.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 租户信息对象 rh_tenant
 * 
 * @author ruoyi
 * @date 2024-06-09
 */
public class RhTenant extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 租户头像 */
    @Excel(name = "租户头像")
    private String tenantAvatar;

    /** 租户姓名 */
    @Excel(name = "租户姓名")
    private String tenantName;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String tenantPhone;

    /** 账户密码 */
    @Excel(name = "账户密码")
    private String tenantPasswd;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String tenantCardNumber;

    /** 微信号码 */
    @Excel(name = "微信号码")
    private String tenantWechatNumber;

    /** 微信openid */
    @Excel(name = "微信openid")
    private String tenantOpenid;

    /** 是否租住（N：否、Y：是） */
    @Excel(name = "是否租住", readConverterExp = "N=：否、Y：是")
    private String tenantStatus;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
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
    public void setTenantPasswd(String tenantPasswd) 
    {
        this.tenantPasswd = tenantPasswd;
    }

    public String getTenantPasswd() 
    {
        return tenantPasswd;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tenantName", getTenantName())
            .append("tenantAvatar", getTenantAvatar())
            .append("tenantPhone", getTenantPhone())
            .append("tenantPasswd", getTenantPasswd())
            .append("tenantCardNumber", getTenantCardNumber())
            .append("tenantWechatNumber", getTenantWechatNumber())
            .append("tenantOpenid", getTenantOpenid())
            .append("tenantStatus", getTenantStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
