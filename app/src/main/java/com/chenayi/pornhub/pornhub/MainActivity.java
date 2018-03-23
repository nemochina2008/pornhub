package com.chenayi.pornhub.pornhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.pornhub)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                        intent.putExtra("url", C.PORNHUB_URL);
                        intent.putExtra("title", "Pornhub");
                        startActivity(intent);
                    }
                });

        findViewById(R.id.xvideos)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                        intent.putExtra("url", C.XVIDEOS_URL);
                        intent.putExtra("title", "Xvideos");
                        startActivity(intent);
                    }
                });

        findViewById(R.id.erovideo)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                        intent.putExtra("url", C.EROVIDE_URL);
                        intent.putExtra("title", "Erovideo");
                        startActivity(intent);
                    }
                });
    }
}
