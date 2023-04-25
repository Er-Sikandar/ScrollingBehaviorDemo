package com.ns.scrollingbehaviordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.ns.scrollingbehaviordemo.databinding.ActivityScToolbarTab2Binding;

public class ScToolbarTabActivity2 extends AppCompatActivity {
    private ActivityScToolbarTab2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityScToolbarTab2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        TabLayout.Tab firstTab = binding.tbLayout.newTab();
        firstTab.setText("First Tab");
        firstTab.setIcon(R.mipmap.ic_launcher);
        binding.tbLayout.addTab(firstTab,true);
        TabLayout.Tab secondTab = binding.tbLayout.newTab();
        secondTab.setText("Second Tab");
        secondTab.setIcon(R.mipmap.ic_launcher);
        binding.tbLayout.addTab(secondTab,false);
    }
}