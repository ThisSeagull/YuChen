package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_order
 * 
 * @author ruoyi
 * @date 2022-10-13
 */
public class SysOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deliverId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long menuId;

    /** 报告地址 */
    @Excel(name = "报告地址")
    private String pdfpath;

    /** $column.columnComment */
    @Excel(name = "报告地址")
    private String candidatename;

    /** $column.columnComment */
    @Excel(name = "报告地址")
    private String code;

    /** $column.columnComment */
    @Excel(name = "报告地址")
    private Long status;

    /** $column.columnComment */
    private Long id;

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setDeliverId(Long deliverId) 
    {
        this.deliverId = deliverId;
    }

    public Long getDeliverId() 
    {
        return deliverId;
    }
    public void setMenuId(Long menuId) 
    {
        this.menuId = menuId;
    }

    public Long getMenuId() 
    {
        return menuId;
    }
    public void setPdfpath(String pdfpath) 
    {
        this.pdfpath = pdfpath;
    }

    public String getPdfpath() 
    {
        return pdfpath;
    }
    public void setCandidatename(String candidatename) 
    {
        this.candidatename = candidatename;
    }

    public String getCandidatename() 
    {
        return candidatename;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("deliverId", getDeliverId())
            .append("menuId", getMenuId())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("pdfpath", getPdfpath())
            .append("candidatename", getCandidatename())
            .append("code", getCode())
            .append("status", getStatus())
            .append("id", getId())
            .toString();
    }
}
