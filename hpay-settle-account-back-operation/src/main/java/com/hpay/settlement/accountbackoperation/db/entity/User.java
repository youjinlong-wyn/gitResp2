package com.hpay.settlement.accountbackoperation.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jlyou
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ����ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private Integer age;

    /**
     * ����
     */
    private String email;

    /**
     * �ֹ����汾
     */
    private Integer version;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * ����ʱ��
     */
    private Date updateTime;

    private Integer deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
