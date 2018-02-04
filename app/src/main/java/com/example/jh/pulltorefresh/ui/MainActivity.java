package com.example.jh.pulltorefresh.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.jh.pulltorefresh.R;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        Button listBrn = (Button) findViewById(R.id.list_view_btn);
        listBrn.setOnClickListener(this);

        Button scrollBrn = (Button) findViewById(R.id.scroll_view_btn);
        scrollBrn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.list_view_btn:
                XListViewActivity.launch(this);
                break;

            case R.id.scroll_view_btn:
                XScrollViewActivity.launch(this);
                break;
        }
    }
}
