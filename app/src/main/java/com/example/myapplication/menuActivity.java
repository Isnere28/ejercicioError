package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.databinding.ActivityLoginBinding;
import com.example.myapplication.databinding.ActivityMenuBinding;

public class menuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final ImageButton imButton = binding.imageButton;

        imButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar(v);
            }
        });
    }

    public void ingresar(View v){
        startActivity(new Intent(this, ScrollingActivity.class));
    }
}