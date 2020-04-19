package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
    public void click(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        int  userNumber = Integer.parseInt(editText.getText().toString());
        String message;
        if(userNumber<randomNumber){
            message = "Higher";
        }else if(userNumber>randomNumber){
            message = "Lower";
        }else{
            message = "You got it! Try Again";
            generateRandomNumber();

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
