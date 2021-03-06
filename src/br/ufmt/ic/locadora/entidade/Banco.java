/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.entidade;

import java.util.Objects;


/**
 *
 * @author brunosette
 */
public class Banco  {
    private String nome;
    private String cod;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nomeBanco) {
        this.nome = nomeBanco;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String codBanco) {
        this.cod = codBanco;
    }
    
    public String toString(){
        return getNome();
    }
    
    
}
