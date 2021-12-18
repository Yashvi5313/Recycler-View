package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRecyclerViewInList, btnCustomRecyclerView, btnNestedRecyclerView, btnSpinnerInRecyclerView, btnCustomSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecyclerViewInList = findViewById(R.id.btnRecyclerViewInList);
        btnRecyclerViewInList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewList.class);
                startActivity(intent);
            }
        });

        btnCustomRecyclerView = findViewById(R.id.btnCustomRecyclerView);
        btnCustomRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, exam.class);
                startActivity(intent);
            }
        });

        btnNestedRecyclerView = findViewById(R.id.btnNestedRecyclerView);
        btnNestedRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NestedRecyclerView.class);
                startActivity(intent);
            }
        });

        btnSpinnerInRecyclerView = findViewById(R.id.btnSpinnerInRecyclerView);
        btnSpinnerInRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpinnerInRecyclerView.class);
                startActivity(intent);
            }
        });

        btnCustomSpinner = findViewById(R.id.btnCustomSpinner);
        btnCustomSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomSpinner.class);
                startActivity(intent);
            }
        });
    }
}