package com.gestaoqualidadeprojetos;

import com.gestaoqualidadeprojetos.service.yves.ResultadoIteracaoService;
import com.gestaoqualidadeprojetos.service.yves.ResultadoMembroEquipeService;
import com.gestaoqualidadeprojetos.service.yves.ResultadoProjetoService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Note102
 */
public class PrincipalDashboard {

    public static void main(String args[]) {
        // chamar service aqui

        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            try {
                System.out.println("==== DASHBOARD ====");
                System.out.println("1 - Visualizar resultado da iteracao vigente");
                System.out.println("2 - Visualizar resultado dos membros de equipe da iteração vigente");
                System.out.println("3 - Visualizar resultado do projeto");
                System.out.println("0 - Sair");
                System.out.println("==============");
                System.out.print("Digite o valor correspondente ao que deseja: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1: Visualizar resultado da iteracao vigente selecionada.");
                        var resultadoIteracaoService = new ResultadoIteracaoService();
                        System.out.println(resultadoIteracaoService.getByIteracao("Iteração 1"));
                        break;
                    case 2:
                        System.out.println("Opção 2 Visualizar resultado dos membros de equipe da iteração vigente selecionada.");
                        var resultadoMembroEquipeService = new ResultadoMembroEquipeService();
                        System.out.println(resultadoMembroEquipeService.getByIteracao("Iteração 1"));
                        break;
                    case 3:
                        System.out.println("Opção 3 Visualizar resultado do projeto");
                        var resultadoProjetoService = new ResultadoProjetoService();
                        System.out.println(resultadoProjetoService.getByProjeto("Projeto 1"));
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception ex) {
                Logger.getLogger(PrincipalDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
