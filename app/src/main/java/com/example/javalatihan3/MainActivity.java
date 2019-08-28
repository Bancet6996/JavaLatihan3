package com.example.javalatihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText celcius, kelvin, fahrenheit, reamur;
    private Button konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celcius = (EditText) findViewById(R.id.etxCelcius);
        kelvin = (EditText) findViewById(R.id.etxKelvin);
        fahrenheit = (EditText) findViewById(R.id.etxFahrenheit);
        reamur = (EditText) findViewById(R.id.etxReamur);
        konversi = (Button) findViewById(R.id.btnKonversi);

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numberCelcius = Double.parseDouble(String.valueOf(celcius.getText()));

                double hasilKelvin = numberCelcius + 273.15;
                double hasilFahrenheit = numberCelcius*1.8+32;
                double hasilReamur = numberCelcius*0.8;

                kelvin.setText("" +hasilKelvin);
                fahrenheit.setText("" +hasilFahrenheit);
                reamur.setText("" +hasilReamur);
            }
        });
    }
}
