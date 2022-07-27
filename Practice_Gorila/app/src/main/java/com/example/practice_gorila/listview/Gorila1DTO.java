package com.example.practice_gorila.listview;

public class Gorila1DTO {

    private int img_1, img_2, back;
    private String text_1, text_2;

    public Gorila1DTO(int back,int img_1, int img_2, String text_1, String text_2) {
        this.back = back;
        this.img_1 = img_1;
        this.img_2 = img_2;
        this.text_1 = text_1;
        this.text_2 = text_2;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public int getImg_1() {
        return img_1;
    }

    public void setImg_1(int img_1) {
        this.img_1 = img_1;
    }

    public int getImg_2() {
        return img_2;
    }

    public void setImg_2(int img_2) {
        this.img_2 = img_2;
    }

    public String getText_1() {
        return text_1;
    }

    public void setText_1(String text_1) {
        this.text_1 = text_1;
    }

    public String getText_2() {
        return text_2;
    }

    public void setText_2(String text_2) {
        this.text_2 = text_2;
    }
}
