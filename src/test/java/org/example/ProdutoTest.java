package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(120, "Caneca personalizada", "caneca", "Caneca Star Wars", new Personalizacao("redonda", "preta", 2));

        Produto produtoClone = produto.clone();
        produtoClone.setValor(150);
        produtoClone.setDescricao("Caneca Harry Potter");
        produtoClone.getPersonalizacao().setCor("amarela");
        produtoClone.getPersonalizacao().setDesign("quadrada");

        assertEquals("Produto{valor=120, nome='Caneca personalizada', tipo='caneca', descricao='Caneca Star Wars', personalizacao=Personalizacao{design='redonda', cor='preta', tamanho=2}}", produto.toString());
        assertEquals("Produto{valor=150, nome='Caneca personalizada', tipo='caneca', descricao='Caneca Harry Potter', personalizacao=Personalizacao{design='quadrada', cor='amarela', tamanho=2}}", produtoClone.toString());
    }
}