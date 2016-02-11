package com.example.fmsurvivor.imagelist;

import java.io.Serializable;
import java.util.Date;


public class PhotoModel implements Serializable{
    private String imageUrl;
    private Date date;
    private String text;

    public PhotoModel(String imageUrl, Date date, String text){
        this.imageUrl = imageUrl;
        this.date = date;
        this.text = text;
    }



    public String getImageUrl(){
        return imageUrl;
    };

    public Date getDate(){
        return date;
    };

    public String getText(){
        return text;
    };

}
