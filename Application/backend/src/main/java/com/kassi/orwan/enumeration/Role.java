package com.kassi.orwan.enumeration;

public enum Role {
    SYSTEM_ADMIN("SYSTEM_ADMIN"),
    WORKER("WORKER"),
    ENGINEER("ENGINEER");


    private final String role;

    Role(String role){
        this.role = role;
    }

    public String getRole(){
        return  this.role;
    }
}
