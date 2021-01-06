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
@TableName("SVS_BALANCE_UPDATE_LOG")
public class SvsBalanceUpdateLog extends Model<SvsBalanceUpdateLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.INPUT)
    private BigDecimal id;

    /**
     * 账户交易流水号
     */
    @TableField("ACCOUNT_TRANS_SEQ")
    private BigDecimal accountTransSeq;

    /**
     * 入账时间
     */
    @TableField("ACCOUNT_DATE")
    private String accountDate;

    /**
     * 创建时间
     */
    @TableField("INSERT_TIME")
    private String insertTime;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 账户ID
     */
    @TableField("ACCOUNT_ID")
    private BigDecimal accountId;

    /**
     * 涉及金额
     */
    @TableField("BALANCEAMOUNT")
    private BigDecimal balanceamount;

    /**
     * 涉及金额-可用可提现
     */
    @TableField("BALANCEAMOUNT00")
    private BigDecimal balanceamount00;

    /**
     * 涉及金额-不可用不可提现
     */
    @TableField("BALANCEAMOUNT11")
    private BigDecimal balanceamount11;

    /**
     * 冻结金额
     */
    @TableField("PREDEDUCTBALANCE")
    private BigDecimal predeductbalance;

    /**
     * 更新记录标志位:0其它;1商户结算;2商户提现申请;3提现处理结果;4,冻结;5,解冻;6.转账;7.指定交易挖款;8.指定交易金额挖款;9.交易返还
     */
    @TableField("FLAG")
    private String flag;

    /**
     * 中间账户支付时间
     */
    @TableField("ACCOUNT_TRANS_DATE")
    private String accountTransDate;

    /**
     * 风控冻结金额（不参与结算的金额）
     */
    @TableField("FREEZE_AMOUNT")
    private BigDecimal freezeAmount;

    /**
     * 网关流水号
     */
    @TableField("PAYMENT_TRANS_SEQ")
    private BigDecimal paymentTransSeq;

    /**
     * 网关支付时间
     */
    @TableField("PAYMENT_TRANS_DATE")
    private String paymentTransDate;

    /**
     * 涉及金额-可用不可提现
     */
    @TableField("BALANCEAMOUNT01")
    private BigDecimal balanceamount01;

    /**
     * 涉及金额-不可用可提现
     */
    @TableField("BALANCEAMOUNT10")
    private BigDecimal balanceamount10;

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
     * 分润账户,单位分
     */
    @TableField("FR_BALANCE")
    private Long frBalance;

    /**
     * 两线手续费账户,单位分
     */
    @TableField("FEE_BALANCE")
    private Long feeBalance;

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

    /**
     * 交易流水号
     */
    @TableField("TRANS_SEQ")
    private String transSeq;

    /**
     * 已分账待结算账户，单位分
     */
    @TableField("FZ_SETTLE_NEED")
    private Long fzSettleNeed;

    /**
     * 待分账账户
     */
    @TableField("FZ_NEED")
    private Long fzNeed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
