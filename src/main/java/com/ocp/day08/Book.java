package com.ocp.day08;

public class Book {
    private int pages;
    public Book(int pages){
        this.pages  = pages;
    }
    
    //物件成員(包含屬性、方法，必須要new)
    public int getPages() {
        return pages;
    }
    //類別成員(不是物件不用new，可以直接得到類別裡的東西)
    public  static String getPublish() {
        return "碁峰資訊";
    }
}
