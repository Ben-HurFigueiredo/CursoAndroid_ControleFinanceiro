package br.com.basicsistemas.controlefinanceiro.views;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.basicsistemas.controlefinanceiro.MenuPrincipal;
import br.com.basicsistemas.controlefinanceiro.R;
import br.com.basicsistemas.controlefinanceiro.dao.ProdutoDAO;
import br.com.basicsistemas.controlefinanceiro.entidade.ProdutoEntidade;



public class Produto extends MenuPrincipal {

    // Atributos do activity

    private EditText nome;
    private EditText fornecedor;
    private ProdutoDAO p_DAO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        p_DAO =new ProdutoDAO(this);
        nome = findViewById(R.id.txt_produto_nome);
        fornecedor =findViewById(R.id.txt_produto_fornecedor);


    }

    public void gravar(View view){

        ProdutoEntidade p = new ProdutoEntidade();


        // Inserindo valores do formulário
        p.setNome(nome.getText().toString());
        p.setFornecedor(fornecedor.getText().toString());


        // Enviando os dados do formulário para serem gravados na classe DAO e retirnando id que
        // foi enviado.

        long id = p_DAO.gravar(p);

        Toast.makeText(this, "Produto " + id + " Gravado com sucesso.", Toast.LENGTH_LONG).show();
    }

}


