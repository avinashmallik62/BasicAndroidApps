package com.example.multiplefriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        final ArrayList<String>friends = new ArrayList<String>();
        friends.add("Rishabh");
        friends.add("Rajesh");
        friends.add("Kunal");
        friends.add("Nilesh");
        friends.add("Abhishek");
        friends.add("Rajesh");
        friends.add("Rishabh");






        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,friends);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                intent.putExtra("name",friends.get(position));
                startActivity(intent);
            }
        });
    }
}
