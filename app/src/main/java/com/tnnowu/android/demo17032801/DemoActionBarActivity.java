package com.tnnowu.android.demo17032801;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by tnnowu on 2017/03/28.
 */

public class DemoActionBarActivity extends AppCompatActivity {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_actionbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);

        }

        initView();
    }

    private void initView() {
        mBtn = (Button) findViewById(R.id.goBack);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
