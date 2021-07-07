package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel("用户模型")
@Table(name = "user")
public class User implements Serializable {

    @Id
    @ApiModelProperty("用户id")
    private int id;

    @ApiModelProperty("用户账号")
    private String name;

    @ApiModelProperty("用户密码")
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
