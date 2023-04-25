package com.ns.scrollingbehaviordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ns.scrollingbehaviordemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

       mainBinding.btnScToolbar.setOnClickListener(v -> {
           startActivity(new Intent(this,ScToolbarActivity.class));
       });
       mainBinding.btnScToolbarwithTab.setOnClickListener(v -> {
           startActivity(new Intent(this,ScToolbarTabActivity2.class));
       });
       mainBinding.btnScSpace.setOnClickListener(v -> {
           startActivity(new Intent(this,ScSpaceActivity.class));
       });
       mainBinding.btnScSpace2.setOnClickListener(v -> {
           startActivity(new Intent(this,ScSpace2Activity.class));
       });
        mainBinding.btnScImage.setOnClickListener(v -> {
            startActivity(new Intent(this,ScImageActivity.class));
        });
        mainBinding.btnScOverContent.setOnClickListener(v -> {
            startActivity(new Intent(this,ScOverContentActivity.class));
        });




    }
}