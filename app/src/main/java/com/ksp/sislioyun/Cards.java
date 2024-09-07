package com.ksp.sislioyun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Cards extends AppCompatActivity {

    RelativeLayout crd1,crd2,crd3,crd4;
    String crd1loader,crd2loader,crd3loader,crd4loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        //item declaration
        crd1 = (RelativeLayout)findViewById(R.id.crd_item1);
        crd2 = (RelativeLayout)findViewById(R.id.crd_item2);
        crd3 = (RelativeLayout)findViewById(R.id.crd_item3);
        crd4 = (RelativeLayout)findViewById(R.id.crd_item4);


        //loading url
        crd1loader = "";
        crd2loader = "";
        crd3loader = "";
        crd4loader = "";


        //onclick - passing url to Gameloader activity
        crd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", crd1loader);
                startActivity(intent);
            }
        });
        crd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", crd2loader);
                startActivity(intent);
            }
        });
        crd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", crd3loader);
                startActivity(intent);
            }
        });
        crd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cards.this,GameLoader.class);
                intent.putExtra("WEB_PASSING", crd4loader);
                startActivity(intent);
            }
        });

    }
}