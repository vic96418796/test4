package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final String[] lunch = { "台北","新北","桃園","新竹","苗栗","台中","彰化","雲林","嘉義","台南","高雄","屏東","台東","花蓮","宜蘭" };
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(Main4Activity.this,
                android.R.layout.simple_spinner_dropdown_item,lunch);
        spinner.setAdapter(lunchList);
    }
}
