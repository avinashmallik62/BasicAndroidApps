package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean flag = false;
    public void click(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView2);

        if(flag==false){
            imageView.animate().setDuration(2000).alpha(0);
            imageView1.animate().setDuration(2000).alpha(1);
            flag = true;
        }else{
            imageView.animate().setDuration(2000).alpha(1);
            imageView1.animate().setDuration(2000).alpha(0);
            flag = false;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
