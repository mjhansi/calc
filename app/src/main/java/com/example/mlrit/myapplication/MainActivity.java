package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Integer a=Integer.parseInt(et1.getText().toString());
                Integer b=Integer.parseInt(et2.getText().toString());

                int c=a+b;
                et3.setText(Integer.toString(c));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a=Integer.parseInt(et1.getText().toString());
                Integer b=Integer.parseInt(et2.getText().toString());

                int d=a-b;
                et3.setText(Integer.toString(d));
                          }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a=Integer.parseInt(et1.getText().toString());
                Integer b=Integer.parseInt(et2.getText().toString());

                int e=a*b;
                et3.setText(Integer.toString(e));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a=Integer.parseInt(et1.getText().toString());
                Integer b=Integer.parseInt(et2.getText().toString());

                int f=a/b;
                et3.setText(Integer.toString(f));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a=Integer.parseInt(et1.getText().toString());
                Integer b=Integer.parseInt(et2.getText().toString());

                int g=a%b;
                et3.setText(Integer.toString(g));

            }
        });
    }
}
