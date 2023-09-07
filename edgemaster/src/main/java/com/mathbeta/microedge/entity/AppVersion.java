package com.mathbeta.microedge.entity;

import com.mathbeta.alphaboot.annotation.KeyConfig;
import com.mathbeta.alphaboot.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;
/**
* 应用版本
*
* Created by xiuyou.xu on 2023/09/07.
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "AppVersion", description = "应用版本")
@XmlAccessorType(XmlAccessType.FIELD)
@KeyConfig(type = 1)
public class AppVersion extends BaseEntity {

    
    @ApiModelProperty(name = "appId", value = "应用id")
    private String appId;

    
    @ApiModelProperty(name = "versionNum", value = "版本号")
    private String versionNum;

    
    @ApiModelProperty(name = "image", value = "镜像名称")
    private String image;

    
    @ApiModelProperty(name = "runningConfig", value = "json格式容器运行配置，用于启动docker容器。\r\nenv，环境变量，格式[\"a=1\", \"b=2\"]\r\nportmappings，端口映射，格式[\"8080:80\", \"6443:443\"]\r\nvolumemappings，卷映射，格式[\"/path/on/host:/path/on/container\"]")
    private String runningConfig;

    
    @ApiModelProperty(name = "description", value = "描述")
    private String description;


}