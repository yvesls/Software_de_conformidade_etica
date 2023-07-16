/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.business;

import com.gestaoqualidadeprojetos.model.Classificacao;
import com.gestaoqualidadeprojetos.model.Resultado;
import com.gestaoqualidadeprojetos.model.Iteracao;
import com.gestaoqualidadeprojetos.model.ResultadoIteracao;
import com.gestaoqualidadeprojetos.model.enums.ClassificacaoEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Note102
 */
public class ProcessaResultadoIteracao implements ProcessaResultadoStrategy {
    
    @Override
    public Resultado processar(Iteracao iteracao) {
        return null;
    }
}
