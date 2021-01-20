package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner;
        spinner = findViewById(R.id.spinner);
        String[] items = {"Item 1", "Item 2", "Item 3" };
        ArrayAdapter<String> groups = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(groups);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("Item", String.valueOf(spinner.getSelectedItem()));
                startActivity(intent);
            }
        });
    }



}