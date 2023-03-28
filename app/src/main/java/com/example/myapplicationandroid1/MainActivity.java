package com.example.myapplicationandroid1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,C,mul,div,plus,minus,equal;
    TextView textView;
    float num1,num2;
    boolean add,sub,multiple,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.Calc);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        C=(Button)findViewById(R.id.C);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        minus=(Button)findViewById(R.id.minus);
        plus=(Button)findViewById(R.id.plus);
        equal=(Button)findViewById(R.id.equal);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"0");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num2=Float.parseFloat(textView.getText()+"");
                if(add==true){
                    textView.setText(num1+num2+"");
                    add=false;
                }
                if(sub==true){
                    textView.setText(num1-num2+"");
                    sub=false;
                }
                if(multiple==true){
                    textView.setText(num1*num2+"");
                    multiple=false;
                }
                if(divide==true){
                    textView.setText(num1/num2+"");
                    divide=false;
                }
                Intent intent=new Intent(getBaseContext(),MainActivity_second.class);
                intent.putExtra("KEY",textView.getText().toString());
                startActivity(intent);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    num1=Float.parseFloat(textView.getText()+"");
                    add=true;
                    textView.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    num1=Float.parseFloat(textView.getText()+"");
                    sub=true;
                    textView.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    num1=Float.parseFloat(textView.getText()+"");
                    multiple=true;
                    textView.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null){
                    textView.setText("");
                }
                else {
                    num1=Float.parseFloat(textView.getText()+"");
                    divide=true;
                    textView.setText(null);
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });


    }
}
