package com.example.myapplicationandroid1;

import static android.provider.Contacts.SettingsColumns.KEY;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.security.Key;

public class MainActivity_second extends AppCompatActivity {
    final String KEY ="MainActivity";
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        textView=(TextView) findViewById(R.id.textView4);
        button=(Button)findViewById(R.id.button);
        Intent intent=getIntent();
        Float result=Float.parseFloat(intent.getStringExtra("KEY"));
        textView.setText(textView.getText().toString()+result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result < 40)
                    textView.setText("1");
                else
                    textView.setText("0");
            }
        });
    }}