package br.com.basicsistemas.controlefinanceiro.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.com.basicsistemas.controlefinanceiro.entidade.ProdutoEntidade;

public class ProdutoDAO {

    private Conexao conexao;
    private SQLiteDatabase bancoDeDados;


    public ProdutoDAO(Context context){

        // Criando objeto para adicionar valores na tabela de produto

        ContentValues valores = new ContentValues();

        valores.put("nome", produto.getNome());
        valores.put("fornecedor", produto.getFornecedor());


        return bancoDeDados.insert("produto", null, valores);


    }

    // Metodo para retornar todos os produtos cadastrados no banco de dados

    /*

    public List<ProdutoEntidade> listar{

        //Criando a lista para armazenar os dados retornados do banco de dados
        List<ProdutoEntidade> produtos = new ArrayList<>();

        //Retornando os valores da tabela de produtos das colunas id, nome, fornecedor. Não realizado nenhum filtro

        Cursor cursor = bancoDeDados.query("produto", new String[]{"id","nome","fornecedor"},
                null, null, null, null, null);

        //Irá realizar a repetiçãode acordo com a quantidade de linhas no objeto cursor

    while (cursor.moveToNext()){

        ProdutoEntidade produto = new ProdutoEntidade();
        produto.setId(Cursor.getInt(0));
        produto.setNome(Cursor.getString(1));
        produto.setFornecedor(cursor.getString(2));

        // adicionado o objeto produto na lista
        produtos.add(produto);

    }
    // retornando a lista com os produtos cadastrados
       return produtos;
    }
*/



}
