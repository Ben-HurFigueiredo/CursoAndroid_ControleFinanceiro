package br.com.basicsistemas.controlefinanceiro.dao;

import android.database.sqlite.SQLiteDatabase;

public class ClienteDAO {

    private Conexao conexao;
    private SQLliteDatabase bancoDeDados;


        //Iniciando o banco de Dados com o contexto passando por parâmentro

    public ClienteDAO(Context context){
        conexao = new Conexao(content);
        bancoDeDados = conexao.getWritableDatabase();




    }

}
