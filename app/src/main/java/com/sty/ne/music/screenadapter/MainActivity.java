package com.sty.ne.music.screenadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sty.ne.music.screenadapter.ui.UIUtils;
import com.sty.ne.music.screenadapter.ui.ViewCalculateUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UIUtils.getInstance(this);
        TextView textView = findViewById(R.id.text);
        ViewCalculateUtils.setViewRelativeLayoutParam(textView, 540, 100,
                0, 0, 0, 0, true);
        ViewCalculateUtils.setTextSize(textView, 50);
    }
}
