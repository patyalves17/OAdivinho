package com.example.logonrm.oadivinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText etChuteJogador;
    private TextView tvUltimoChute;
    private int chuteJogador;
    private int numeroAleatorio;
    private Random geradorNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geradorNumero = new Random();
        numeroAleatorio=geradorNumero.nextInt(11);

        etChuteJogador = (EditText) findViewById(R.id.etChuteJogador);
        tvUltimoChute= (TextView) findViewById(R.id.tvUltimoChute);
    }

    public void chutar(View v){ //obrigatorio passar a view
        if(TextUtils.isEmpty(etChuteJogador.getText().toString()) ){
            Toast.makeText(this,"Informa seu chute",Toast.LENGTH_SHORT).show();
        }else{
            chuteJogador=Integer.parseInt(etChuteJogador.getText().toString());
            if(chuteJogador==numeroAleatorio){
                Toast.makeText(this,R.string.right,Toast.LENGTH_SHORT).show();
                tvUltimoChute.setText(String.valueOf(etChuteJogador.getText().toString()));
                etChuteJogador.setText(String.valueOf(""));
            }else if(chuteJogador<=numeroAleatorio){
                Toast.makeText(this,R.string.menor,Toast.LENGTH_SHORT).show();
                tvUltimoChute.setText(String.valueOf(etChuteJogador.getText().toString()));
                etChuteJogador.setText(String.valueOf(""));
            }else {
                Toast.makeText(this,R.string.maior,Toast.LENGTH_SHORT).show();
                tvUltimoChute.setText(String.valueOf(etChuteJogador.getText().toString()));
                etChuteJogador.setText(String.valueOf(""));
            }
        }


    }
}
