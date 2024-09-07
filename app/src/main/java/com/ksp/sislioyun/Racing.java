package com.ksp.sislioyun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Racing extends AppCompatActivity {

    RelativeLayout r1,r2,r3,r4,r5,r6;
    String r1loader,r2loader,r3loader,r4loader,r5loader,r6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racing);

        //item declaration
        r1 = (RelativeLayout)findViewById(R.id.r_item1);
        r2 = (RelativeLayout)findViewById(R.id.r_item2);
        r3 = (RelativeLayout)findViewById(R.id.r_item3);
        r4 = (RelativeLayout)findViewById(R.id.r_item4);
        r5 = (RelativeLayout)findViewById(R.id.r_item5);
        r6 = (RelativeLayout)findViewById(R.id.r_item6);


        //loading url
        r1loader = "";
        r2loader = "";
        r3loader = "";
        r4loader = "";
        r5loader = "";
        r6loader = ""; //


        //onclick - passing url to Gameloader activity
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r1loader);
                startActivity(intent);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r2loader);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r3loader);
                startActivity(intent);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r4loader);
                startActivity(intent);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r5loader);
                startActivity(intent);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Racing.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", r6loader);
                startActivity(intent);
            }
        });

    }
}