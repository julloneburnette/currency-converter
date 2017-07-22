package com.julboy.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText display1 = (EditText)findViewById(R.id.editText);

        double dollar1 = Double.parseDouble(display1.getText().toString());

        double poundAmount = dollar1 * 0.77;

        String pound = "\u00a3";

        Toast.makeText(MainActivity.this,pound+ " "+String.valueOf(poundAmount),Toast.LENGTH_SHORT).show();
        Log.i("Info", String.valueOf(poundAmount));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
