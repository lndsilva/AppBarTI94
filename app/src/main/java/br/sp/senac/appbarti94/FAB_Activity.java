package br.sp.senac.appbarti94;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FAB_Activity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_layout);

        fab = findViewById(R.id.idFAB);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // startActivity(new Intent(getApplicationContext(),Principal_Activity.class));

                Toast.makeText(getApplicationContext(),
                        "Cadastrado com sucesso!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}
