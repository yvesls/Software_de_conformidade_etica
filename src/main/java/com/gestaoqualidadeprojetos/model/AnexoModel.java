
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class AnexoModel {
    private String nome;
    private String tipo; //link ou arquivo

    public AnexoModel(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
