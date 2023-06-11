package com.example.foodappmvvmandroid.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;

import com.example.foodappmvvmandroid.R;
import com.example.foodappmvvmandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
      ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
//        setContentView(activityMainBinding.getRootView());
    }
}