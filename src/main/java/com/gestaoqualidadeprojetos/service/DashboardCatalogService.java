/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import com.gestaoqualidadeprojetos.business.steps.CreateEtapaMembroEquipeResult;
import com.gestaoqualidadeprojetos.business.steps.CreateMap;
import com.gestaoqualidadeprojetos.business.steps.NotifiesMembersNotResponded;
import com.gestaoqualidadeprojetos.business.steps.ProcessStep;
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
            new CreateEtapaMembroEquipeResult());

    /*public static ProcessStep createProjectResultProcess = buildChain();

    public static ProcessStep createTeamMemberResultProcess = buildChain();*/

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            ProcessStep currentProcess = steps[index];
            currentProcess.setNextStep(steps[index + 1]);
        }
        return steps[0];
    }
}
