/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.dao.impl;


import br.ufmt.ic.locadora.dao.BancoDAO;
import br.ufmt.ic.locadora.entidade.Banco;
import br.ufmt.ic.locadora.exception.RegistroException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brunosette
 */
public class BancoDAOImpl implements BancoDAO {

    private Map<String, Banco> bancos = new HashMap<String, Banco>();

    public void inserir(Banco banco) throws RegistroException {
        
        if (bancos.containsKey(banco.getNome())) {
            System.out.println("Registro já cadastrado!");
            throw new RegistroException();
        }
        
        if (banco.getNome().equals("")){
            throw new RegistroException("Banco inválido!");
        }
        
        bancos.put(banco.getNome(), banco);
        
    }

    public void remover(String nome) {
        bancos.remove(nome);
    }

    public void alterar(Banco banco, Banco chave) throws RegistroException {
       bancos.remove(chave.getNome());
       try{
           this.inserir(banco);
       }catch (RegistroException erro){
           this.inserir(chave);
           throw new RegistroException();
       }
       
    }

    public Banco consultar(String nome) {
        return bancos.get(nome);
    }

    public Map<String, Banco> listar() {
        return bancos;
    }

}
