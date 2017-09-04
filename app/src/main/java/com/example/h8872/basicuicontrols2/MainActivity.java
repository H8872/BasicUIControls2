package com.example.h8872.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AutoCompleteTextView
        AutoCompleteTextView atcv = (AutoCompleteTextView) findViewById(R.id.loginAutoCompleteTextView);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, new String[]{"Pentti","Jussi","Tuomas","Esa","Ankka"});
        atcv.setAdapter(aa);
    }

    public void onButtonClick(View view) {
        AutoCompleteTextView login = (AutoCompleteTextView) findViewById(R.id.loginAutoCompleteTextView);
        TextView pass = (TextView) findViewById((R.id.passEditText));
        String txt = (String) login.getText().toString()+" "+pass.getText();
        Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_SHORT).show();
    }
}
