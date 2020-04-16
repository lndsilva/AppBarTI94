package br.sp.senac.appbarti94;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Card_Activity extends AppCompatActivity {

    private Button btnAcao1, btnAcao2;
    private ImageView imgFavoritos, imgCompartilhamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_layout);

        btnAcao1 = findViewById(R.id.btnAcao1);
        btnAcao2 = findViewById(R.id.btnAcao2);
        imgCompartilhamento = findViewById(R.id.imgCompartilhamento);
        imgFavoritos = findViewById(R.id.imgFavoritos);

        btnAcao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Clique na ação 1",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnAcao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Clique na ação 2",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imgFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Favoritos",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imgCompartilhamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Compartilhamento",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
