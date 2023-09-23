package com.rolex.microservices.account.dao.entity;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * @author rolex
 * @since 2023/9/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_account")
public class Account extends Model<Account> {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    @TableField("email")
    private String email;
    private boolean confirmedAndActive;
    private Instant memberSince;
    private boolean support;
    private String phoneNumber;
    private String photoUrl;
}
