/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.dao.vetor;

import br.ufmt.ic.locadora.entidade.Filme;
import locadora.FilmesDAO;
import br.ufmt.ic.locadora.exception.RegistroException;

/**
 *
 * @author bruno
 */
public class FilmesDAOImpl implements FilmesDAO {

    Filme[] filmes = new Filme[10];

    public void inserir(Filme filme) throws RegistroException  {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                if (filmes[i].getNomeFilme().equals(filme.getNomeFilme())) {
                    throw new RegistroException();
                }
            }
        }

        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] == null) {
                if (filme.getNomeFilme().equals("")){
                    throw new RegistroException("Filme invalido");
                }
                filmes[i] = filme;
                System.out.println("Inserido com Sucesso!");
                break;
            }
        }

    }

    public void remover(String nome) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                if (filmes[i].getNomeFilme().equals(nome)) {
                    filmes[i] = null;
                    break;
                }
            }
        }
    }

    public void alterar(Filme filme) {

    }

    public Filme consultar(String nome) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                if (filmes[i].getNomeFilme().equals(nome)) {
                    return filmes[i];
                }
            }
        }
        return null;
    }

    public Filme[] listar() {
        return filmes;
    }

}