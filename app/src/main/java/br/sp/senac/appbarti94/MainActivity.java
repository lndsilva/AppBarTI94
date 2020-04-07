package br.sp.senac.appbarti94;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Foi declarado uma variável global com o tipo do objeto

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentei o objeto do layout para o Java

        toolbar = findViewById(R.id.id_toolBar);
        //Criar a toolbar na janela do aplicativo
        setSupportActionBar(toolbar);

        //colocar o ícone default na toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //Método para criar o menu no Activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflar o menu - instânciar o menu - criar o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mAbrir:
                //Mensagem que aparece e desaparece rapidamente - aviso simples para o usuário
                Toast.makeText(getApplicationContext(), "Cliquei no abrir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlterar:
                //Mensagem que aparece e desaparece rapidamente - aviso simples para o usuário
                Toast.makeText(getApplicationContext(), "Cliquei no alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                //Mensagem que aparece e desaparece rapidamente - aviso simples para o usuário
                Toast.makeText(getApplicationContext(), "Cliquei no excluir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSalvar:
                //Mensagem que aparece e desaparece rapidamente - aviso simples para o usuário
                Toast.makeText(getApplicationContext(), "Cliquei no salvar", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;
    }
}
