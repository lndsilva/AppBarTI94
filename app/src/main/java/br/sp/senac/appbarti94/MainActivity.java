package br.sp.senac.appbarti94;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Foi declarado uma variável global com o tipo do objeto
    Toolbar toolbar;
    //Objetos do xml no java
    EditText txtEmail, txtSenha;
    Button btnEntrar, btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentei o objeto do layout para o Java

        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        toolbar = findViewById(R.id.id_toolBar);

        //Ação da toolbar

        //Criar a toolbar na janela do aplicativo
        setSupportActionBar(toolbar);
        //colocar o ícone default na toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Troca o nome da Activity
        getSupportActionBar().setTitle("Senac Largo Treze");
        //Troca o icone da ToolBar
        //getSupportActionBar().setIcon(R.drawable.ic_voltar);

        //Ação dos botões

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, senha;

                email = txtEmail.getText().toString();
                senha = txtSenha.getText().toString();

                if (email.equals("senac") && senha.equals("senac")) {
                    startActivity(new Intent(getApplicationContext(), Principal_Activity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos",
                            Toast.LENGTH_SHORT).show();

                }


            }
        });


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
