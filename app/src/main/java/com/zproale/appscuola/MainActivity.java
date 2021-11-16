package com.zproale.appscuola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button evento = (Button) findViewById(R.id.buttonPlay);
        Intent paginaUno = new Intent(MainActivity.this, Pagina2.class);
        startActivity(paginaUno);

    }

    public void secondaActivity(){
    }
}