package br.com.basicsistemas.controlefinanceiro.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {


    public Conexao(Context context) {

        // Context , Nome do Banco de Dados, fábricade conexões, versãodo banco do dados
        super(context,"financeiro.db", null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    // Este método é responsável por criar a estrutura do banco de dados na primeira execução.

        sqLiteDatabase.execSQL("CREATE TABLE produto(" +
                "id integer primary key autoincrement," +
                "nome varchar(80)," +
                "fornecedor varchar(80))");


        sqLiteDatabase.execSQL("CREATE TABLE cliente(" +
                "id integer primary key autoincrement," +
                "nome varchar(80)," +
                "cpf integer)");

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }


}
