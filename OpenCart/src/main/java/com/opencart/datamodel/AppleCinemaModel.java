package com.opencart.datamodel;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AppleCinemaModel {

    private int radio;// 5/6/7
    private int checkbox;// 8/9/10/11
    private String text;
    private int select; // 1/2/3/4
    private String textarea;
    private String file;
    private String date;
    private String time;
    private String dateAndTime;
    private String qty;

}
