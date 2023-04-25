package com.ns.scrollingbehaviordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ns.scrollingbehaviordemo.databinding.ActivityScSpaceBinding;

public class ScSpaceActivity extends AppCompatActivity {
private ActivityScSpaceBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityScSpaceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}