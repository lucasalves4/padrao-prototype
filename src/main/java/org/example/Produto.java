package org.example;

public class Produto implements Cloneable{
    private float valor;
    private String nome;
    private String tipo;
    private String descricao;
    private Personalizacao personalizacao;

    public Produto(float valor, String nome, String tipo, String descricao, Personalizacao personalizacao) {
        this.valor = valor;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.personalizacao = personalizacao;
    }

    public float getValor() {
        return valor;
    }

    public Produto setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Produto setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Personalizacao getPersonalizacao() {
        return personalizacao;
    }

    public Produto setPersonalizacao(Personalizacao personalizacao) {
        this.personalizacao = personalizacao;
        return this;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.personalizacao = (Personalizacao) produtoClone.personalizacao.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", personalizacao=" + personalizacao +
                '}';
    }
}
