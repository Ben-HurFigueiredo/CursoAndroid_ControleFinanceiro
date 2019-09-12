package br.com.basicsistemas.controlefinanceiro.views;

import android.os.Bundle;


import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.basicsistemas.controlefinanceiro.MenuPrincipal;
import br.com.basicsistemas.controlefinanceiro.R;
import br.com.basicsistemas.controlefinanceiro.dao.ClienteDAO;
import br.com.basicsistemas.controlefinanceiro.entidade.ClienteEntidade;

public class Cliente extends MenuPrincipal {



    private EditText nome;
    private EditText cpf;
    private ClienteDAO c_DAO;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        c_DAO = new ClienteDAO(this);
        nome = findViewById(R.id.txt_cliente_nome);
        cpf = findViewById(R.id.tx_cliente_cpf);
    }

    public void gravar(View view){

        ClienteEntidade c = new ClienteEntidade();

        c.setNome(nome.getText().toString());
        c.setCpf(cpf.getText().toString());


        long id = c_DAO.gravar(c);

        Toast.makeText(this, "Cliente " + id + " gravado com sucesso.", Toast.LENGTH_SHORT ).show();

    }


}
