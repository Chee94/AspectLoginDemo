package com.z.aspectlogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.z.aspectlogindemo.annotation.LoginCheck;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Aspect >>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @LoginCheck
    public void jumpOrder(View view) {
        Log.e(TAG, "打开订单成功");
    }

}