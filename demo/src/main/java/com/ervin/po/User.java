package com.ervin.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel(value="user entity class")
public class User implements Serializable {
    @ApiModelProperty(value="user id",example="0")
    private Integer userId;

    @ApiModelProperty(value="user name")
    @NotBlank(message="cannot blank name")
    @Length(min=4,max=10,message="length 4-10")
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}