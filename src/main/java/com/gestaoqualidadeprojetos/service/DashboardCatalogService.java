/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.CreateEtapaIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.CreateEtapaMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.CreateIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.CreateMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.NotifiesMembersNotResponded;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.SaveEtapaIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.SaveEtapaMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.SaveIteracaoResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.SaveMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.ValidatesDateCurrentIteracao;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.ValidatesIfAllMembersAnswered;
import com.gestaoqualidadeprojetos.business.steps.iteracaoprocess.ValidatesIteracaoResultExists;
import com.gestaoqualidadeprojetos.business.steps.projetoprocess.CreateProjetoResult;
import com.gestaoqualidadeprojetos.business.steps.projetoprocess.SaveProjetoResult;
import com.gestaoqualidadeprojetos.business.steps.projetoprocess.ValidatesAllCompletedIterations;
import com.gestaoqualidadeprojetos.business.steps.projetoprocess.ValidatesDataCurrentProject;
import com.gestaoqualidadeprojetos.business.steps.projetoprocess.ValidatesProjectResultExists;



/**
 *
 * @author Note102
 */
public class DashboardCatalogService {

    public static ProcessStep createIterationResultProcess = buildChain(
            new ValidatesDateCurrentIteracao(),
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

    public static ProcessStep createProjectResultProcess = buildChain(
            new ValidatesDataCurrentProject(),
            new ValidatesProjectResultExists(),
            new ValidatesAllCompletedIterations(),
            new CreateProjetoResult(),
            new SaveProjetoResult());

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            ProcessStep currentProcess = steps[index];
            currentProcess.setNextStep(steps[index + 1]);
        }
        return steps[0];
    }
}
