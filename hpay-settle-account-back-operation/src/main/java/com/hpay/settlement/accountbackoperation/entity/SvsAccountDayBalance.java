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
@TableName("SVS_ACCOUNT_DAY_BALANCE")
public class SvsAccountDayBalance extends Model<SvsAccountDayBalance> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.INPUT)
    private BigDecimal id;

    @TableField("ACCOUNTID")
    private BigDecimal accountid;

    @TableField("BALANCEAMOUNT")
    private BigDecimal balanceamount;

    @TableField("STATUS")
    private String status;

    @TableField("CURRENCYCODE")
    private String currencycode;

    @TableField("CURRENCYNAME")
    private String currencyname;

    @TableField("CREDITAMOUNT")
    private BigDecimal creditamount;

    @TableField("TYPE")
    private String type;

    @TableField("BALANCEAMOUNT00")
    private BigDecimal balanceamount00;

    @TableField("BALANCEAMOUNT01")
    private BigDecimal balanceamount01;

    @TableField("BALANCEAMOUNT10")
    private BigDecimal balanceamount10;

    @TableField("BALANCEAMOUNT11")
    private BigDecimal balanceamount11;

    @TableField("PREDEDUCTBALANCE")
    private BigDecimal predeductbalance;

    @TableField("WORKDAY")
    private String workday;

    @TableField("DAYBALANCE")
    private BigDecimal daybalance;

    @TableField("SETTLEDAY")
    private String settleday;

    /**
     * 风控冻结金额（不参与结算的金额）
     */
    @TableField("FREEZEBALANCE")
    private BigDecimal freezebalance;

    /**
     * T0待回拨:经过结算处理的，已经T0出款的金额
     */
    @TableField("T0_DEBIT")
    private Long t0Debit;

    /**
     * T0交易金额
     */
    @TableField("T0_TRANS")
    private Long t0Trans;

    /**
     * 已出款:已生成银行划款记录的金额
     */
    @TableField("WITHDRAW_DONE")
    private Long withdrawDone;

    /**
     * 已冻结:已经冻结的金额
     */
    @TableField("FROZEN")
    private Long frozen;

    /**
     * 待冻结:需要冻结的金额
     */
    @TableField("FROZEN_NEED")
    private Long frozenNeed;

    /**
     * 已解冻:已经解冻的金额
     */
    @TableField("UNFREEZE")
    private Long unfreeze;

    /**
     * 其它待扣收
     */
    @TableField("DEDUCT_NEED")
    private Long deductNeed;

    /**
     * 其它已扣收
     */
    @TableField("DEDUCTED")
    private Long deducted;

    /**
     * 新增提现冻结
     */
    @TableField("WITHDARW_FROZEN")
    private Long withdarwFrozen;

    /**
     * 待退款账户，单位分
     */
    @TableField("REFUND_NEED")
    private Long refundNeed;

    /**
     * 已退款账户，单位分
     */
    @TableField("REFUNDED")
    private Long refunded;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
