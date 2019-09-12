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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.basicsistemas.controlefinanceiro.MenuPrincipal;
import br.com.basicsistemas.controlefinanceiro.R;
import br.com.basicsistemas.controlefinanceiro.dao.ProdutoDAO;
import br.com.basicsistemas.controlefinanceiro.entidade.ProdutoEntidade;

public class Produtos extends MenuPrincipal {

    // Criando Variáveis para sincronização com os elementos da tela.

    private ListView list;
    private ProdutoDAO p_DAO;
    private List<ProdutoEntidade> listaProdutos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Iniciando os atributos de ligação com a tela.
        list = findViewById(R.id.apresentacao_lista_produtos);
        p_DAO = new ProdutoDAO(this);
        listaProdutos = p_DAO.listar();


        // Convertendo/ adaptando lista para o formato list view.
        ArrayAdapter<ProdutoEntidade> adaptador;

        adaptador = new ArrayAdapter<ProdutoEntidade>(this,  android.R.layout.simple_list_item_1,listaProdutos);

        list.setAdapter(adaptador);

        //Apresentação dos itens da lista.



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Produtos.this, Produto.class);
                startActivity(intent);

            }
        });
    }



}
