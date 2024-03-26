package org.example;

public class Personalizacao implements Cloneable{
    private String design;
    private String cor;
    private int tamanho;

    public Personalizacao(String design, String cor, int tamanho) {
        super();
        this.design = design;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getDesign() {
        return design;
    }

    public Personalizacao setDesign(String design) {
        this.design = design;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Personalizacao setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Personalizacao setTamanho(int tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Personalizacao{" +
                "design='" + design + '\'' +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
