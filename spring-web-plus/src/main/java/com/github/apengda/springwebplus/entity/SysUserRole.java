package com.github.apengda.springwebplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.apengda.springwebplus.starter.entity.SnowIdWithTimeUserEntity;
import lombok.Data;

@Data
@TableName("sys_user_role")
public class SysUserRole extends SnowIdWithTimeUserEntity {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色id
     */
    private String roleId;
}
