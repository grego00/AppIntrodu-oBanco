package com.example.aluno.appgenerico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button c;
    Button s;
    EditText user, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(Button) findViewById(R.id.c);
        s=(Button) findViewById(R.id.s);
        senha=(EditText) findViewById(R.id.senha) ;
        user=(EditText) findViewById(R.id.user);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( 
                        MainActivity.this,
                        sobre.class
                ) );
            }
        });
    }
}
