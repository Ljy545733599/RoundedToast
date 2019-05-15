package com.linjunyi.csdn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mShowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowBtn = findViewById(R.id.btn_toast);

        mShowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_toast:
//                RoundedToast.show(this,"这是一条Toast");
                Toast.makeText(this, "这是一条Toast", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
