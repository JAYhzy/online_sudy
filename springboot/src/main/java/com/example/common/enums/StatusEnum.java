package com.example.common.enums;

public enum StatusEnum {
    YES("审核通过"),
    N0("审核不通过"),
        ;
    public String status;
    StatusEnum(String status){
        this.status = status;
    }
}
