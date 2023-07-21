
package com.gestaoqualidadeprojetos.model;

import com.gestaoqualidadeprojetos.model.Classificacao;

/**
 *
 * @author Note102
 */
public abstract class Resultado {
    protected Classificacao classificacao;
    
    public Resultado(){
    }

    public Resultado(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
    
    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Resultado{" + "classificacao=" + classificacao + '}';
    }
}
