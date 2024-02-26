package com.github.apengda.springwebplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.apengda.springwebplus.starter.entity.AutoIdWithTimeEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 角色菜单关系表
 */
@Data
@TableName("sys_role_menu")
@Schema(description = "角色菜单关系表")
public class SysRoleMenu extends AutoIdWithTimeEntity {
    @Schema(description = "角色id")
    private Long roleId;

    @Schema(description = "菜单id")
    private Long menuId;

    @Schema(description = "是否用户选中 0：否，1：是")
    private boolean isChoice;
}