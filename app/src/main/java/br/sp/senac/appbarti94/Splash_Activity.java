package br.sp.senac.appbarti94;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Utilizando a classe Handler para executar uma thread (fila de processo)

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*Abrir outra janela
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);*/
                //Outra forma para abrir um janela
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 2000);

    }
}
