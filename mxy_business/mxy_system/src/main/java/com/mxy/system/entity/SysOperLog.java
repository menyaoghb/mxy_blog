package com.mxy.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 操作日志记录
 * </p>
 *
 * @author 孟小耀
 * @since 2021-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysOperLog对象", description="操作日志记录")
public class SysOperLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志主键")
    @TableId(value = "oper_id", type = IdType.ID_WORKER_STR)
    private String operId;

    @ApiModelProperty(value = "模块标题")
    private String title;

    @ApiModelProperty(value = "业务类型（0其它 1新增 2修改 3删除）")
    private Integer businessType;

    @ApiModelProperty(value = "方法名称")
    private String method;

    @ApiModelProperty(value = "请求方式")
    private String requestMethod;

    @ApiModelProperty(value = "操作类别（0其它 1后台用户 2手机端用户）")
    private Integer operatorType;

    @ApiModelProperty(value = "操作人员")
    private String operName;

    @ApiModelProperty(value = "请求URL")
    private String operUrl;

    @ApiModelProperty(value = "主机地址")
    private String operIp;

    @ApiModelProperty(value = "操作地点")
    private String operLocation;

    @ApiModelProperty(value = "请求参数")
    private String operParam;

    @ApiModelProperty(value = "返回参数")
    private String jsonResult;

    @ApiModelProperty(value = "操作状态（0正常 1异常）")
    private Integer status;

    @ApiModelProperty(value = "错误消息")
    private String errorMsg;

    @ApiModelProperty(value = "操作时间")
    private Date operTime;


}
