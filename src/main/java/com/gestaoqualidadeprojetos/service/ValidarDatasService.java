package com.gestaoqualidadeprojetos.service;
import java.time.LocalDate;

public class ValidarDatasService {
    private static ValidarDatasService instance;

    private ValidarDatasService() {
        
    }

    public static ValidarDatasService getInstance() {
        if (instance == null) {
            instance = new ValidarDatasService();
        }
        return instance;
    }

    public boolean validarDatas(LocalDate dataInicial, LocalDate dataFinal) {
        if (dataInicial.compareTo(dataFinal) < 0) {
            return true;
        }
        System.out.println("A previsão de conclusão deve ser maior que a data inicial.");
        return false;
    }
}
