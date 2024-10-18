package com.SpringPractise;

public class Alien {

    private String userName;
    private  Computer comp;

//    public Alien(Computer comp) {
//        this.comp = comp;
//    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


    public void code(){
        System.out.println(this.userName + "Coding..");
        comp.compile();
    }
}
