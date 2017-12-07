package com.example.administrator.fragmentlifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * @author: baiyang.
 * Created on 2017/12/7.
 */

public class ResultActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = new Intent();
        intent.putExtra("Result",100);
        setResult(0,intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
