package com.example.haryono.wildanfmh_1202150110_modul2;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/***
 * Detail Activity that is launched when a list item is clicked. It shows more info on the sport.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //melakukan inisiasi pada views
        TextView menuTitle = (TextView)findViewById(R.id.item_title_detail);
        TextView menuPrice = (TextView)findViewById(R.id.item_price_detail);
        TextView menuInfo = (TextView)findViewById(R.id.info_detail);
        ImageView menuImage = (ImageView)findViewById(R.id.menuImages_detail);

        //mengisi views dengan data, dari intent
        menuTitle.setText(getIntent().getStringExtra("title"));
        menuPrice.setText(getIntent().getStringExtra("price"));
        menuInfo.setText(getIntent().getStringExtra("info"));

        Glide.with(this).load(getIntent().getIntExtra("image_",0))
                .into(menuImage);
    }
}
