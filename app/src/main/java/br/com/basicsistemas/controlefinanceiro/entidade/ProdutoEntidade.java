package br.com.basicsistemas.controlefinanceiro.entidade;

public class ProdutoEntidade {

    private int id;
    private String nome;
    private String fornecedor;

    public ProdutoEntidade() {

    }

    public ProdutoEntidade(int id, String nome, String fornecedor) {

        this.id = id;
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }


    @Override
    public String toString(){

        return nome;
    }



}
