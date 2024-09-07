package com.ksp.sislioyun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Mind extends AppCompatActivity {

    RelativeLayout m1,m2,m3,m4,m5,m6;
    String m1loader,m2loader,m3loader,m4loader,m5loader,m6loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind);

        //item declaration
        m1 = (RelativeLayout)findViewById(R.id.m_item1);
        m2 = (RelativeLayout)findViewById(R.id.m_item2);
        m3 = (RelativeLayout)findViewById(R.id.m_item3);
        m4 = (RelativeLayout)findViewById(R.id.m_item4);
        m5 = (RelativeLayout)findViewById(R.id.m_item5);
        m6 = (RelativeLayout)findViewById(R.id.m_item6);


        //loading url
        m1loader = "";
        m2loader = "";
        m3loader = "";
        m4loader = "";
        m5loader = "";
        m6loader = "";


        //onclick - passing url to Gameloader activity
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m1loader);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m2loader);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m3loader);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m4loader);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m5loader);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mind.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", m6loader);
                startActivity(intent);
            }
        });

    }
}