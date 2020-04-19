package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);
        Log.i("Username : ",username.getText().toString());
        Log.i("Password : ",password.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
