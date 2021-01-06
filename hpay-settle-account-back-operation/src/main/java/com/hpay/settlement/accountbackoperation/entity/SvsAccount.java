package com.hpay.settlement.accountbackoperation.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jlyou
 * @since 2021-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("SVS_ACCOUNT")
public class SvsAccount extends Model<SvsAccount> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.INPUT)
    private BigDecimal id;

    @TableField("NAME")
    private String name;

    @TableField("USERID")
    private BigDecimal userid;

    /**
     * 账户类型代码-个人00,商户01,个人外11,商户外10,过渡账户12,银行90,瀚银特定帐户91,银行佣金账户92
     */
    @TableField("ACCOUNTTYPECODE")
    private String accounttypecode;

    @TableField("CREATETIME")
    private String createtime;

    @TableField("STATUS")
    private String status;

    @TableField("FREEZEEXPIRETIME")
    private String freezeexpiretime;

    @TableField("PARENTID")
    private BigDecimal parentid;

    @TableField("PATH")
    private String path;

    @TableField("AUTHSTATUS")
    private String authstatus;

    @TableField("PAYTYPE")
    private String paytype;

    /**
     * 中间账户密码：MD5加密串
     */
    @TableField("PASSWORD")
    private String password;

    @TableField("ERRCOUNT")
    private BigDecimal errcount;

    /**
     * 账户标识:空--瀚银商户;AGT-XWT--代理商
     */
    @TableField("ACCOUNT_FLAG")
    private String accountFlag;

    /**
     * 是否是分账接收方Y:是
     */
    @TableField("FZ_FLAG")
    private String fzFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
