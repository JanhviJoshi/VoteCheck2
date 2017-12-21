package com.example.user.votecheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tt;
    Button b;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button)findViewById(R.id.button);
        tt= (TextView)findViewById(R.id.textview);
        e2=(EditText)findViewById(R.id.editText2) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age= e2.getText().toString();
                int age1= Integer.parseInt(age);

                if(age1<18 && age1>1)

                Toast.makeText(MainActivity.this, "You are not eligible to vote.", Toast.LENGTH_SHORT).show();
                else if(age1>=18 && age1<99)
                    Toast.makeText(MainActivity.this, "You are eligible to vote.",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            }
        });

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked me", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
