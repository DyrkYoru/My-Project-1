// List View Tutorial

package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    String[] countries = {"America", "Myanmar", "England", "Italy", "Sweden", "Iceland"};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ListActivity.this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(arrayAdapter);
    }
}