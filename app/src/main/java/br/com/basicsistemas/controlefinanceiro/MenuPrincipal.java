package br.com.basicsistemas.controlefinanceiro;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import br.com.basicsistemas.controlefinanceiro.views.Clientes;
import br.com.basicsistemas.controlefinanceiro.views.Produtos;



public class MenuPrincipal extends AppCompatActivity {

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

                //Apresentando um popup na janela
                Toast.makeText(this, "Clicou no Item Principal", Toast.LENGTH_SHORT).show();

                // Realizando o redirecionamento para a tela de destino.
                intent = new Intent(this,Principal.class);
                this.startActivity(intent);

                break;

            case R.id.item_menu_produtos:
                Toast.makeText(this, "Clicou no Item Produtos", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, Produtos.class);
                this.startActivity(intent);


                break;

            case R.id.item_menu_clientes:

                Toast.makeText(this, "Clicou no Item Clientes", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, Clientes.class);
                this.startActivity(intent);


                break;
/*
            case R.id.item_menu_fornecedores:

                Toast.makeText(this, "Clicou no Item Fornecedores", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, Produtos.class);
                this.startActivity(intent);


                break;
*/

        }


        return super.onOptionsItemSelected(item);
    }

}
