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
     * �˻����ʹ���-����00,�̻�01,������11,�̻���10,�����˻�12,����90,����ض��ʻ�91,����Ӷ���˻�92
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
     * �м��˻����룺MD5���ܴ�
     */
    @TableField("PASSWORD")
    private String password;

    @TableField("ERRCOUNT")
    private BigDecimal errcount;

    /**
     * �˻���ʶ:��--����̻�;AGT-XWT--������
     */
    @TableField("ACCOUNT_FLAG")
    private String accountFlag;

    /**
     * �Ƿ��Ƿ��˽��շ�Y:��
     */
    @TableField("FZ_FLAG")
    private String fzFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
