package com.example.creditokiosco;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date d=new Date();

        //obtener la fecha
        fecha = (TextView)findViewById(R.id.txvFecha);
        SimpleDateFormat fecc = new SimpleDateFormat("d,MMMM,YYYY");
        String fechaComString = fecc.format(d);
        fecha.setText(fechaComString);
    }
}