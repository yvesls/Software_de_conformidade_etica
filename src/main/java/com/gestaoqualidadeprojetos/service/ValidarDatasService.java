package com.gestaoqualidadeprojetos.service;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class ValidarDatasService {
    
    public boolean validarDatas(LocalDateTime dataInicial, LocalDateTime dataFinal) {
        if (dataInicial.compareTo(dataFinal) < 0) {
            return true;
        }
        System.out.println("A previsão de conclusão deve ser maior que a data inicial.");
        return false;
    }
    
}
