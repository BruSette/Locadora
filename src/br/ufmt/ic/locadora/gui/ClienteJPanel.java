/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.gui;

import br.ufmt.ic.locadora.util.FabricaDAO;
import br.ufmt.ic.locadora.exception.CPFException;
import br.ufmt.ic.locadora.entidade.Endereco;
import br.ufmt.ic.locadora.entidade.Cliente;
import br.ufmt.ic.locadora.dao.ClienteDAO;
import br.ufmt.ic.locadora.tablemodel.ClienteTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author brunosette
 */
public class ClienteJPanel extends javax.swing.JPanel {

    ClienteDAO dao = FabricaDAO.CriarClienteDAO();
    private ClienteTableModel tableModel;
    private boolean editar = false;
    private int linhaSelecionada;
    private Cliente chave;

    /**
     * Creates new form clienteJPanel
     */
    public ClienteJPanel() {
        tableModel = new ClienteTableModel(dao.listar());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        celularjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        ruajTextField = new javax.swing.JTextField();
        ruajLabel = new javax.swing.JLabel();
        complementojTextField = new javax.swing.JTextField();
        complementojLabel = new javax.swing.JLabel();
        bairrojTextField = new javax.swing.JTextField();
        bairrojLabel = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        cidadejLabel = new javax.swing.JLabel();
        estadojLabel = new javax.swing.JLabel();
        estadojTextField = new javax.swing.JTextField();
        rgjLabel = new javax.swing.JLabel();
        rgjTextField = new javax.swing.JTextField();
        nacionalidadejTextField = new javax.swing.JTextField();
        nacionalidadejLabel = new javax.swing.JLabel();
        numerojTextField = new javax.swing.JTextField();
        estadojLabel1 = new javax.swing.JLabel();
        telefonejFormattedTextField = new javax.swing.JFormattedTextField();
        nomejLabel2 = new javax.swing.JLabel();
        cpfjFormattedTextField = new javax.swing.JFormattedTextField();
        cpfjLabel = new javax.swing.JLabel();
        nascimentojFormattedTextField = new javax.swing.JFormattedTextField();
        nascimentojLabel = new javax.swing.JLabel();
        cepjFormattedTextField = new javax.swing.JFormattedTextField();
        cepjLabel = new javax.swing.JLabel();
        celularjFormattedTextField = new javax.swing.JFormattedTextField();
        nacionalidadejLabel1 = new javax.swing.JLabel();
        sexojComboBox = new javax.swing.JComboBox<>();
        estadojLabel2 = new javax.swing.JLabel();
        limitefilmesjFormattedTextField = new javax.swing.JFormattedTextField();
        editarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientejTable = new javax.swing.JTable();
        excluirjButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18)))); // NOI18N

        cadastrarjButton.setText("Salvar");
        cadastrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarjButtonActionPerformed(evt);
            }
        });

        limparjButton.setText("Limpar");
        limparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButtonActionPerformed(evt);
            }
        });

        nomejLabel.setText("Nome:");

        celularjLabel.setText("Celular:");

        emailjLabel.setText("Email:");

        ruajLabel.setText("Rua:");

        complementojLabel.setText("Complemento:");

        bairrojLabel.setText("Bairro:");

        cidadejLabel.setText("Cidade:");

        estadojLabel.setText("Estado");

        rgjLabel.setText("Rg:");

        rgjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgjTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadejTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejLabel.setText("Nacionalidade");

        estadojLabel1.setText("Numero:");

        try {
            telefonejFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonejFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonejFormattedTextFieldActionPerformed(evt);
            }
        });

        nomejLabel2.setText("Telefone:");

        try {
            cpfjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cpfjLabel.setText("CPF:");

        try {
            nascimentojFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nascimentojLabel.setText("Nascimento:");

        try {
            cepjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cepjLabel.setText("CEP:");

        try {
            celularjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularjFormattedTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejLabel1.setText("Sexo:");

        sexojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        estadojLabel2.setText("Limite:");

        limitefilmesjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        limitefilmesjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitefilmesjFormattedTextFieldActionPerformed(evt);
            }
        });

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        clientejTable.setModel(tableModel);
        jScrollPane1.setViewportView(clientejTable);

        excluirjButton.setText("Excluir");
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nacionalidadejLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sexojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(emailjLabel)
                                                    .addComponent(rgjLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(nomejLabel2)
                                                        .addGap(17, 17, 17)
                                                        .addComponent(telefonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(celularjLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(celularjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(1, 1, 1)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nomejLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addComponent(nascimentojLabel))
                                                    .addComponent(cpfjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(estadojLabel2)
                                                .addGap(23, 23, 23)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(limitefilmesjFormattedTextField)
                                            .addComponent(cpfjFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(nascimentojFormattedTextField))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bairrojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ruajLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(complementojLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cidadejLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estadojLabel)
                                .addGap(18, 18, 18)
                                .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cepjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estadojLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nacionalidadejLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nacionalidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(limparjButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cadastrarjButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(excluirjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(565, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruajLabel)
                            .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementojLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairrojLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepjLabel)
                            .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadojLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadojLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidadejLabel))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrarjButton)
                            .addComponent(limparjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomejLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celularjLabel)
                            .addComponent(celularjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjLabel)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nascimentojLabel)
                            .addComponent(nascimentojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limitefilmesjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadojLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidadejLabel1)
                            .addComponent(sexojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirjButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rgjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgjTextFieldActionPerformed

    private void nacionalidadejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadejTextFieldActionPerformed

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:

        nomejTextField.setText("");
        telefonejFormattedTextField.setText("");
        celularjFormattedTextField.setText("");
        emailjTextField.setText("");
        rgjTextField.setText("");
        cpfjFormattedTextField.setText("");
        nascimentojFormattedTextField.setText("");
        nacionalidadejTextField.setText("");
        ruajTextField.setText("");
        complementojTextField.setText("");
        bairrojTextField.setText("");
        cepjFormattedTextField.setText("");
        cidadejTextField.setText("");
        estadojTextField.setText("");
        numerojTextField.setText("");
        limitefilmesjFormattedTextField.setText("");
        editar = false;
    }//GEN-LAST:event_limparjButtonActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setLimiteFilmes(5);
        cliente.setBloqueado(false);
        cliente.setCelular(celularjFormattedTextField.getText());
        cliente.setCpf(cpfjFormattedTextField.getText());
        cliente.setEmail(emailjTextField.getText());
        cliente.setNacionalidade(nacionalidadejTextField.getText());

        if (nomejTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nome de Cliente inválido");
            nomejTextField.grabFocus();
            return;
        }
        cliente.setNome(nomejTextField.getText());

        cliente.setRg(rgjTextField.getText());
        cliente.setTelefone(telefonejFormattedTextField.getText());
        cliente.setSexo(sexojComboBox.getSelectedItem().toString());

        Integer limite;
        try {
            limite = Integer.parseInt(limitefilmesjFormattedTextField.getText());
            cliente.setLimiteFilmes(limite);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "Limite Inválido!");
            limitefilmesjFormattedTextField.grabFocus();
            return;
        }

        String sData = (String) nascimentojFormattedTextField.getText();

        if (sData != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                cliente.setDataNascimento(sdf.parse(sData));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Data Inválida!");
                nascimentojFormattedTextField.grabFocus();
                return;
            }
        }

        Endereco end = new Endereco();
        end.setBairro(bairrojTextField.getText());
        end.setCep(cepjFormattedTextField.getText());
        end.setCidade(cidadejTextField.getText());
        end.setComplemento(complementojTextField.getText());
        end.setEstado(estadojTextField.getText());
        end.setNumero(numerojTextField.getText());
        end.setRua(ruajTextField.getText());
        cliente.setEndereco(end);

        try {
            if (editar) {
                dao.alterar(cliente, chave);
                JOptionPane.showMessageDialog(this, "Alterado com Sucesso!");
                tableModel.alterar(linhaSelecionada, cliente);
            } else {
                dao.inserir(cliente);
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
                tableModel.adicionar(cliente);
            }
            limparjButtonActionPerformed(null);
        } catch (CPFException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
            cpfjFormattedTextField.grabFocus();
        }


    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void telefonejFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonejFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonejFormattedTextFieldActionPerformed

    private void celularjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularjFormattedTextFieldActionPerformed

    private void limitefilmesjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitefilmesjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limitefilmesjFormattedTextFieldActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:

        if (clientejTable.getSelectedRowCount() == 1) {
            linhaSelecionada = clientejTable.getSelectedRow();
            Cliente selecionado = tableModel.getCliente(linhaSelecionada);

            nomejTextField.setText(selecionado.getNome());
            telefonejFormattedTextField.setText(selecionado.getTelefone());
            celularjFormattedTextField.setText(selecionado.getCelular());
            emailjTextField.setText(selecionado.getEmail());
            rgjTextField.setText(selecionado.getRg());
            cpfjFormattedTextField.setText(selecionado.getCpf());

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                nascimentojFormattedTextField.setText(sdf.format(selecionado.getDataNascimento()));
            } catch (NullPointerException erro) {

            }

            limitefilmesjFormattedTextField.setText(String.valueOf(selecionado.getLimiteFilmes()));
            nacionalidadejTextField.setText(selecionado.getNacionalidade());
            cepjFormattedTextField.setText(selecionado.getEndereco().getCep());
            ruajTextField.setText(selecionado.getEndereco().getRua());
            bairrojTextField.setText(selecionado.getEndereco().getBairro());
            estadojTextField.setText(selecionado.getEndereco().getEstado());
            cidadejTextField.setText(selecionado.getEndereco().getCidade());
            numerojTextField.setText(selecionado.getEndereco().getNumero());
            complementojTextField.setText(selecionado.getEndereco().getComplemento());
            sexojComboBox.setSelectedItem(selecionado.getSexo());
            chave = selecionado;
            editar = true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:
        if (clientejTable.getSelectedRowCount() > 0) {
            int confirmacao = JOptionPane.showConfirmDialog(clientejTable, "Confirma a exclusão?");
            if (confirmacao == JOptionPane.YES_OPTION) {
                linhaSelecionada = clientejTable.getSelectedRow();
                Cliente selecionado = tableModel.getCliente(linhaSelecionada);
                dao.remover(selecionado.getCpf());
                tableModel.remover(linhaSelecionada, selecionado);
                JOptionPane.showMessageDialog(this, "Excluido com Sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos 1 linha!");
        }


    }//GEN-LAST:event_excluirjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairrojLabel;
    private javax.swing.JTextField bairrojTextField;
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JFormattedTextField celularjFormattedTextField;
    private javax.swing.JLabel celularjLabel;
    private javax.swing.JFormattedTextField cepjFormattedTextField;
    private javax.swing.JLabel cepjLabel;
    private javax.swing.JLabel cidadejLabel;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JTable clientejTable;
    private javax.swing.JLabel complementojLabel;
    private javax.swing.JTextField complementojTextField;
    private javax.swing.JFormattedTextField cpfjFormattedTextField;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JButton editarjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel estadojLabel;
    private javax.swing.JLabel estadojLabel1;
    private javax.swing.JLabel estadojLabel2;
    private javax.swing.JTextField estadojTextField;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField limitefilmesjFormattedTextField;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel nacionalidadejLabel;
    private javax.swing.JLabel nacionalidadejLabel1;
    private javax.swing.JTextField nacionalidadejTextField;
    private javax.swing.JFormattedTextField nascimentojFormattedTextField;
    private javax.swing.JLabel nascimentojLabel;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JLabel nomejLabel2;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JTextField numerojTextField;
    private javax.swing.JLabel rgjLabel;
    private javax.swing.JTextField rgjTextField;
    private javax.swing.JLabel ruajLabel;
    private javax.swing.JTextField ruajTextField;
    private javax.swing.JComboBox<String> sexojComboBox;
    private javax.swing.JFormattedTextField telefonejFormattedTextField;
    // End of variables declaration//GEN-END:variables
}
