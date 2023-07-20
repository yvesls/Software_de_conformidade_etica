/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.business.steps.CreateEtapaIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.CreateEtapaMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.CreateIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.CreateMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.NotifiesMembersNotResponded;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.business.steps.SaveEtapaIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.SaveEtapaMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.SaveIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.SaveMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.ValidatesDateCurrent;
import com.gestaoqualidadeprojetos.business.steps.ValidatesIfAllMembersAnswered;
import com.gestaoqualidadeprojetos.business.steps.ValidatesIteracaoResultExists;

/**
 *
 * @author Note102
 */
public class DashboardCatalogService {

    public static ProcessStep createIterationResultProcess = buildChain(
            new ValidatesDateCurrent(),
            new ValidatesIteracaoResultExists(),
            new ValidatesIfAllMembersAnswered(),
            new NotifiesMembersNotResponded(),
            new CreateEtapaMembroEquipeResult(),
            new SaveEtapaMembroEquipeResult(),
            new CreateMembroEquipeResult(),
            new SaveMembroEquipeResult(),
            new CreateEtapaIteracaoResult(),
            new SaveEtapaIteracaoResult(),
            new CreateIteracaoResult(),
            new SaveIteracaoResult());

    /*public static ProcessStep createProjectResultProcess = buildChain();*/

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            ProcessStep currentProcess = steps[index];
            currentProcess.setNextStep(steps[index + 1]);
        }
        return steps[0];
    }
}
