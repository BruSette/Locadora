/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.ufmt.ic.locadora.entidade.Filme;

/**
 *
 * @author bruno
 */
public class FilmesTableModel extends AbstractTableModel {
    private List<Filme> filmes;
    private String[] header = new String[]{"Nome", "Genero", "Lançamento","Disponibilidade"};

    public FilmesTableModel(List<Filme> list) {
        filmes = new ArrayList<>(list);
    }

    @Override
    public int getRowCount() {
        return filmes.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valor = null;
        Filme selecionado = filmes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                valor = selecionado.getNomeFilme();
                break;
            case 1:
                valor = selecionado.getGenero();
                break;
            case 2:
                valor = String.valueOf(selecionado.getLancamento());
                break;
            case 3:
                valor = Boolean.toString(selecionado.getDisponibilidade());
                break;
        }
        return valor;
    }

    public void adicionar(Filme filme) {
        filmes.add(filme);
        int ultima = filmes.size() - 1;
        fireTableRowsInserted(ultima, ultima);
    }

    public void alterar(int index, Filme filme) {
        filmes.set(index, filme);
        fireTableRowsUpdated(index, index);
    }

    public Filme getFilmes(int index) {
        return filmes.get(index);
    }

}