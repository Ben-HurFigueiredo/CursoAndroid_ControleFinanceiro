package br.com.basicsistemas.controlefinanceiro.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import br.com.basicsistemas.controlefinanceiro.entidade.ClienteEntidade;

public class ClienteDAO {

    private Conexao conexao;
    private SQLiteDatabase bancoDeDados;


        //Iniciando o banco de Dados com o contexto passado por parâmentro

    public ClienteDAO(Context context){

        conexao = new Conexao(context);
        bancoDeDados = conexao.getWritableDatabase();

    }

    public long gravar(ClienteEntidade c){

        ContentValues valores = new ContentValues();


        valores.put("nome", c.getNome());
        valores.put("cpf", c.getCpf());

        return bancoDeDados.insert("cliente", null, valores);

    }




}
