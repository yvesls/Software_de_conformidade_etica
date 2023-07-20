/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.repository;

import com.gestaoqualidadeprojetos.model.QuestionarioEtapa;
import com.gestaoqualidadeprojetos.model.RespostaPergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Note102
 */
public class RespostaPerguntaRepository {
    private List<RespostaPergunta> respostasPerguntas;

    public RespostaPerguntaRepository() {
    }
    
    public List<RespostaPergunta> getByQuestionarioEtapa(QuestionarioEtapa questionarioEtapa) {
        var listRp = new ArrayList<RespostaPergunta>();
        for(RespostaPergunta rp : respostasPerguntas) {
            if(rp.getPergunta().getQuestionario().getNomeQuestionario() == questionarioEtapa.getNomeQuestionario()) {
                listRp.add(rp);
            }
        }
        return listRp;
    }

    public void save(RespostaPergunta rp) {
        if(respostasPerguntas == null) {
            respostasPerguntas = new ArrayList<RespostaPergunta>();
        }
        respostasPerguntas.add(rp);
    }

    public List<RespostaPergunta> getAll() {
        return respostasPerguntas;
    }
}
