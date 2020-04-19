package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click(View view) {
        EditText money = (EditText) findViewById(R.id.editText2);
        double amountInRupees = Double.parseDouble(money.getText().toString());
        double amountInDollars = (amountInRupees * 70);
        Toast.makeText(this, "$"+ amountInRupees + " = " + "Rs." + amountInDollars , Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
