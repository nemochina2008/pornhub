package com.chenayi.pornhub.pornhub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.just.agentweb.AgentWeb;

/**
 * Created by Chenwy on 2018/3/23.
 */

public class WebViewActivity extends AppCompatActivity {
    private LinearLayout llRoot;
    private TextView tvTitle;
    private AgentWeb mAgentWeb;
    private String url;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        llRoot = findViewById(R.id.ll_root);
        tvTitle = findViewById(R.id.tv_title);

        url = getIntent().getStringExtra("url");
        title = getIntent().getStringExtra("title");

        tvTitle.setText(title);

        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(llRoot, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go(url);

        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (!mAgentWeb.back()) {
            finish();
        }
    }
}
