package com.example.common.enums;

public enum RecommendEnum {
    YES("是"),
    N0("否"),
    ;
    public String status;
    RecommendEnum(String status){
        this.status = status;
    }
}
