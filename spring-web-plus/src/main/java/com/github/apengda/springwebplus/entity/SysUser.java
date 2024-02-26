package com.github.apengda.springwebplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.apengda.springwebplus.starter.entity.AutoIdWithTimeUserEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@TableName("sys_user")
@Schema(description = "系统用户")
public class SysUser extends AutoIdWithTimeUserEntity {
    @Schema(description = "用户名")
    private String username;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "盐值")
    private String salt;

    @Schema(description = "手机号码")
    private String phone;

    @Schema(description = "电子邮件")
    private String email;

    @Schema(description = "头像")
    private String head;

    @Schema(description = "状态，0：禁用，1：启用")
    private Boolean enabled;

    @Schema(description = "角色id")
    private Long roleId;
}
