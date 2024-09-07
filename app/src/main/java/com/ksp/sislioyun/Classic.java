package com.ksp.sislioyun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Classic extends AppCompatActivity {

    RelativeLayout c1,c2,c3,c4,c5,c6;
    String c1loader,c2loader,c3loader,c4loader,c5loader,c6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic);

        //item declaration
        c1 = (RelativeLayout)findViewById(R.id.c_item1);
        c2 = (RelativeLayout)findViewById(R.id.c_item2);
        c3 = (RelativeLayout)findViewById(R.id.c_item3);
        c4 = (RelativeLayout)findViewById(R.id.c_item4);
        c5 = (RelativeLayout)findViewById(R.id.c_item5);
        c6 = (RelativeLayout)findViewById(R.id.c_item6);


        //loading url
        c1loader = "file:///android_asset/oyunlar/sisfreekick/penaltykicks.html";
        c2loader = "file:///android_asset/oyunlar/basket/index.html";
        c3loader = "";
        c4loader = "";
        c5loader = "";
        c6loader = "";


        //onclick - passing url to Gameloader activity
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c1loader);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c2loader);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c3loader);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c4loader);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c5loader);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Classic.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", c6loader);
                startActivity(intent);
            }
        });
    }
}