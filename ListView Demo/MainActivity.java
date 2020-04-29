package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        final ArrayList<String>myFriends = new ArrayList<String>();
        myFriends.add("Rishabh");
        myFriends.add("Rajesh");
        myFriends.add("Kunal");
        myFriends.add("Nilesh");
        myFriends.add("Abhishek Sahai");
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriends);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, myFriends.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
