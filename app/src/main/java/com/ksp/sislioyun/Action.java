package com.ksp.sislioyun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.view.View;

import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;
import java.io.InputStream;

public class Action extends AppCompatActivity {

    private NanoHTTPD localServer;
    private static final int SERVER_PORT = 8080; // Sunucu port numarası

    RelativeLayout a1, a2, a3, a4, a5, a6, a7, a8;
    String[] gamePaths = {
            "AlienInvasion/alieninvasion.html",
            "super8race/HTML5/super8race.html",
            "oyun3/index.html",
            "oyun4/index.html",
            "oyun5/index.html",
            "oyun6/index.html",
            "oyun7/index.html",
            "oyun8/index.html"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        // Oyun item'larının referanslarını al
        a1 = findViewById(R.id.a_item1);
        a2 = findViewById(R.id.a_item2);
        a3 = findViewById(R.id.a_item3);
        a4 = findViewById(R.id.a_item4);
        a5 = findViewById(R.id.a_item5);
        a6 = findViewById(R.id.a_item6);
        a7 = findViewById(R.id.a_item7);
        a8 = findViewById(R.id.a_item8);

        // Oyun item'ları için tıklama olaylarını ayarla
        setupButton(a1, 0);
        setupButton(a2, 1);
        setupButton(a3, 2);
        setupButton(a4, 3);
        setupButton(a5, 4);
        setupButton(a6, 5);
        setupButton(a7, 6);
        setupButton(a8, 7);

        // Lokal sunucuyu başlat
        startLocalServer();
    }

    private void setupButton(RelativeLayout button, final int index) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gameUrl = "http://localhost:" + SERVER_PORT + "/" + gamePaths[index];

                Intent intent = new Intent(Action.this, GameLoader.class);
                intent.putExtra("WEB_PASSING", gameUrl);
                startActivity(intent);
            }
        });
    }

    private void startLocalServer() {
        localServer = new NanoHTTPD(SERVER_PORT) {
            @Override
            public Response serve(IHTTPSession session) {
                String uri = session.getUri();
                try {
                    InputStream inputStream = getAssets().open(uri.substring(1)); // İlk '/' karakterini kaldırıyoruz
                    return newFixedLengthResponse(Response.Status.OK, "text/html", inputStream, inputStream.available());
                } catch (IOException e) {
                    e.printStackTrace();
                    return newFixedLengthResponse(Response.Status.NOT_FOUND, "text/plain", "File not found");
                }
            }
        };

        try {
            localServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (localServer != null) {
            localServer.stop();
        }
    }
}
