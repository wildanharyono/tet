package com.example.haryono.wildanfmh_1202150110_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Data model for each row of the RecyclerView.
 */
public class Data {

    private String title;
    private int imageUrl;
    private String info;
    private String price;

    public Data(String title,String info, String price,int imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
        this.info = info;
        this.price =price;
    }
    //melaklukan get image
    public int getImageUrl() {
        return imageUrl;
    }
    //melakukan get judulmenu
    public String getTitle() {
        return title;
    }
    //melakukan get hargamenu
    public String getPrice() {
        return price;
    }
    //melakukan get infomenu
    public String getInfo() {
        return info;
    }
}
