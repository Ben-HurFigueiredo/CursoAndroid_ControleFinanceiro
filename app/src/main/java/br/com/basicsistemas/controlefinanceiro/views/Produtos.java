package br.com.basicsistemas.controlefinanceiro.views;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.basicsistemas.controlefinanceiro.Principal;
import br.com.basicsistemas.controlefinanceiro.R;

public class Produtos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){

        // Ativando Menu principal para a tela inicial do aplicativo.

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override

    public boolean onOptionsItemSelected(@NonNull MenuItem item){


        // verificando qual Item de menu foi clicado

        Intent intent;


        switch (item.getItemId()){

            case R.id.item_menu_principal:

                //Apresentndo um popup na janela
                Toast.makeText(this, "Clicou no Item Principal", Toast.LENGTH_SHORT).show();

                // Realizando o redurecionamento para a tela de destino.
                intent = new Intent(this, Principal.class);
                this.startActivity(intent);

                break;

            case R.id.item_menu_produtos:
                Toast.makeText(this, "Clicou no Item Principal", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, Produtos.class);
                this.startActivity(intent);


                break;

            case R.id.item_menu_clientes:

                Toast.makeText(this, "Clicou no Item Principal", Toast.LENGTH_SHORT).show();
/*
                intent = new Intent(this, Clientes.class);
                this.startActivity(intent);


                break;

            case R.id.item_menu_fornecedores:

                Toast.makeText(this, "Clicou no Item Principal", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, Produtos.class);
                this.startActivity(intent);


                break;
*/

        }


        return super.onOptionsItemSelected(item);
    }



}
