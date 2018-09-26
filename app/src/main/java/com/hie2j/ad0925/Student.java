package com.hie2j.ad0925;

public class Student {
    private int imgId;
    private String name;
    private int age;
    public Student(int imgId,String name,int age){
        this.imgId = imgId;
        this.name = name;
        this.age = age;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
