package com.chenayi.pornhub.pornhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;

public class MainActivity extends AppCompatActivity {
    private LinearLayout llRoot;
    private AgentWeb mAgentWeb;
    private final String URL = "https://www.pornhub.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llRoot = findViewById(R.id.ll_root);
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(llRoot, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go(URL);
    }

    @Override
    public void onBackPressed() {
        if (!mAgentWeb.back()){
           finish();
        }
    }
}
