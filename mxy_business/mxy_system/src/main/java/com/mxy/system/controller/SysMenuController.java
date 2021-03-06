package com.mxy.system.controller;


import com.mxy.common.log.annotation.SysLog;
import com.mxy.common.log.enums.OperType;
import com.mxy.system.entity.vo.SysMenuVO;
import com.mxy.system.service.SysMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单权限 前端控制器
 * </p>
 *
 * @author 孟小耀
 * @since 2021-07-25
 */
@Api(value = "菜单权限", tags = "菜单权限")
@RestController
@RequestMapping("/system/sysMenu")
public class SysMenuController {

    @Autowired
    public SysMenuService sysMenuService;

    /**
     * @Description 获取菜单权限列表
     * @author 孟小耀
     * @date 2021-07-25
     */
    @SysLog(module = "获取菜单权限列表",operType = OperType.SELECT)
    @ApiOperation(value = "获取菜单权限列表")
    @PostMapping("/getList")
    public String getList(@RequestBody SysMenuVO sysMenuVO) {
        return sysMenuService.getList(sysMenuVO);
    }

    /**
     * @Description 新增菜单权限
     * @author 孟小耀
     * @date 2021-07-25
     */
    @SysLog(module = "新增菜单权限",operType = OperType.ADD)
    @ApiOperation(value = "新增菜单权限")
    @PostMapping("/add")
    public String add(@RequestBody SysMenuVO sysMenuVO) {
        return sysMenuService.add(sysMenuVO);
    }

    /**
     * @Description 编辑菜单权限
     * @author 孟小耀
     * @date 2021-07-25
     */
    @SysLog(module = "编辑菜单权限",operType = OperType.UPDATE)
    @ApiOperation(value = "编辑菜单权限")
    @PostMapping("/edit")
    public String edit(@RequestBody SysMenuVO sysMenuVO) {
        return sysMenuService.edit(sysMenuVO);
    }

    /**
     * @Description 删除菜单权限
     * @author 孟小耀
     * @date 2021-07-25
     */
    @SysLog(module = "删除菜单权限",operType = OperType.DELETE)
    @ApiOperation(value = "删除菜单权限")
    @PostMapping("/delete")
    public String delete(@RequestBody SysMenuVO sysMenuVO) {
        return sysMenuService.delete(sysMenuVO);
    }

    /**
     * @Description: 获取菜单树数据
     * @Author: 孟耀
     * @Date: 2021/7/29 0029
     */
    @SysLog(module = "获取菜单树数据")
    @ApiOperation(value = "获取菜单树数据")
    @PostMapping("/treeData")
    public String treeData() {
        return sysMenuService.treeData();
    }
}

