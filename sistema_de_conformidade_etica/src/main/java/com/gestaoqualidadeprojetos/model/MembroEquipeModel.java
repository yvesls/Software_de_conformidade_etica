
package com.gestaoqualidadeprojetos.model;

/**
 *
 * @author lucas
 */
public class MembroEquipeModel {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String representante;

    public MembroEquipeModel(String nome, String sobrenome, String email, String representante) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.representante = representante;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getRepresentante() {
        return representante;
    }

  /* @Override
    public String toString() {
        return "\nMembroEquipeTeste{" + 
                    "\nnome: " + nome + " " + sobrenome + 
                    "\nemail: " + email + 
                    "\nrepresentante: " + representante + '}';
    } */

    
}
