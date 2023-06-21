
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class EvidenciaModel {
    private String conteudo;
    private AnexoModel anexo;

    //sem anexo
    public EvidenciaModel(String conteudo) {
        this.conteudo = conteudo;
    }

    //com anexo
    public EvidenciaModel(String conteudo, AnexoModel anexo) {
        this.conteudo = conteudo;
        this.anexo = anexo;
    }
    
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public AnexoModel getAnexo() {
        return anexo;
    }

    public void setAnexo(AnexoModel anexo) {
        this.anexo = anexo;
    }

}
