package com.example.common.enums;

public enum MemberEnum {
    YES("会员"),
    N0("非会员"),
        ;
    public String info;
    MemberEnum(String info){
        this.info = info;
    }
}
