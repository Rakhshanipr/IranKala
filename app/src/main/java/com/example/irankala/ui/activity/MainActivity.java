package com.example.irankala.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.irankala.R;
import com.example.irankala.databinding.ActivityMainBinding;
import com.example.irankala.ui.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance())
                .commit();

        setContentView(mBinding.getRoot());

    }
}