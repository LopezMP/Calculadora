package com.example.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bc;
    Button bd;
    Button bm;
    Button br;
    Button bs;
    Button bres;
    Button bsin;
    Button bcos;
    Button btan;
    Button bp;
    TextView pantalla, respant;
    String operacion;
    Double res;


    public void init(){

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bd = findViewById(R.id.bd);
        bm = findViewById(R.id.bm);
        br = findViewById(R.id.br);
        bs = findViewById(R.id.bs);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bres = findViewById(R.id.bres);
        bp = findViewById(R.id.bp);
        bc = findViewById(R.id.bc);
        pantalla = findViewById(R.id.text);
        respant = findViewById(R.id.restext);


    }

    public void teclear(){
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"0");
                respant.setText(respant.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"1");
                respant.setText(respant.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"2");
                respant.setText(respant.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"3");
                respant.setText(respant.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"4");
                respant.setText(respant.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"5");
                respant.setText(respant.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"6");
                respant.setText(respant.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"7");
                respant.setText(respant.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"8");
                respant.setText(respant.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"9");
                respant.setText(respant.getText().toString()+"9");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "/";
                res = res / Double.parseDouble(respant.getText().toString());
                respant.setText("");

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"*");
                res = res * Double.parseDouble(respant.getText().toString());
                respant.setText("");
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"-");
                res = res - Double.parseDouble(respant.getText().toString());
                respant.setText("");
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+"+");
                res = res + Double.parseDouble(respant.getText().toString());
                respant.setText("");
            }
        });
        bres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString());
                respant.setText(String.valueOf(res));
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
                res = 0.0;
                respant.setText("");
            }
        });
        bp. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString()+".");
                respant.setText(respant.getText().toString()+".");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        while (1){
            teclear();
        }

    }
}
