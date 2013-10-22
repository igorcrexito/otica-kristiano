/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorCliente;
import javax.swing.JOptionPane;
import utils.Cliente;

/**
 *
 * @author Igor
 */
public class PainelGerenciarClientes extends javax.swing.JPanel {

    ControladorCliente controladorCliente = new ControladorCliente();

    /**
     * Creates new form PainelGerenciarClientes
     */
    public PainelGerenciarClientes() {
        initComponents();
        this.abasUsuario.setEnabledAt(0, true);
        this.abasUsuario.setEnabledAt(1, false);
        this.abasUsuario.setEnabledAt(2, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraCliente = new javax.swing.JToolBar();
        adicionarUsuario = new javax.swing.JButton();
        editarUsuario = new javax.swing.JButton();
        removerUsuario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        abasUsuario = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNomeAddCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCPFAddCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoEnderecoAddCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoTelefoneAddCliente = new javax.swing.JTextField();
        botaoConfirmarUsuario = new javax.swing.JButton();
        cancelarBotao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBuscaCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoBuscaNome = new javax.swing.JTextField();
        nomeClienteBuscado = new javax.swing.JLabel();
        cpfDoClienteBuscado = new javax.swing.JLabel();
        enderecoDoClienteBuscado = new javax.swing.JLabel();
        telefoneDoClienteBuscado = new javax.swing.JLabel();
        buscarCliente = new javax.swing.JButton();
        atualizaCliente = new javax.swing.JButton();
        novoNome = new javax.swing.JTextField();
        novoCPF = new javax.swing.JTextField();
        novoEndereco = new javax.swing.JTextField();
        novoTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        barraCliente.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraCliente.setRollover(true);

        adicionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        adicionarUsuario.setText("Adicionar");
        adicionarUsuario.setFocusable(false);
        adicionarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adicionarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        adicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarUsuarioActionPerformed(evt);
            }
        });
        barraCliente.add(adicionarUsuario);

        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editClient.png"))); // NOI18N
        editarUsuario.setText("Editar");
        editarUsuario.setFocusable(false);
        editarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        barraCliente.add(editarUsuario);

        removerUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/removeClient.png"))); // NOI18N
        removerUsuario.setText("Remover");
        removerUsuario.setFocusable(false);
        removerUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removerUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerUsuarioActionPerformed(evt);
            }
        });
        barraCliente.add(removerUsuario);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Adição de Clientes");

        jLabel2.setText("Nome completo:");

        jLabel3.setText("CPF/CNPJ:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        botaoConfirmarUsuario.setText("Confirmar");
        botaoConfirmarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarUsuarioActionPerformed(evt);
            }
        });

        cancelarBotao.setText("Cancelar");
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefoneAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCPFAddCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(campoEnderecoAddCliente)
                            .addComponent(campoNomeAddCliente)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(botaoConfirmarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarBotao)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCPFAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEnderecoAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefoneAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmarUsuario)
                    .addComponent(cancelarBotao))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        abasUsuario.addTab("Adicionar", jPanel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Edição de Clientes");

        jLabel7.setText("Busque o cliente por CPF/CNPJ");

        jLabel8.setText("Busque o cliente pelo nome");

        nomeClienteBuscado.setText("Nome:");

        cpfDoClienteBuscado.setText("CPF/CNPJ:");

        enderecoDoClienteBuscado.setText("Endereço:");

        telefoneDoClienteBuscado.setText("Telefone:");

        buscarCliente.setText("Buscar");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        atualizaCliente.setText("Editar");
        atualizaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite os novos campos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(campoBuscaCPF)
                                .addComponent(campoBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enderecoDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(novoNome)
                                    .addComponent(novoCPF)
                                    .addComponent(novoEndereco)
                                    .addComponent(novoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizaCliente)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buscarCliente)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel9)))))
                .addGap(20, 78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarCliente)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enderecoDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneDoClienteBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(atualizaCliente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        abasUsuario.addTab("Editar", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        abasUsuario.addTab("Remover", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abasUsuario))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abasUsuario)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarUsuarioActionPerformed
        abasUsuario.setSelectedIndex(0);
        this.abasUsuario.setEnabledAt(0, true);
        this.abasUsuario.setEnabledAt(1, false);
        this.abasUsuario.setEnabledAt(2, false);
    }//GEN-LAST:event_adicionarUsuarioActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        abasUsuario.setSelectedIndex(1);
        this.abasUsuario.setEnabledAt(0, false);
        this.abasUsuario.setEnabledAt(1, true);
        this.abasUsuario.setEnabledAt(2, false);
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void removerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioActionPerformed
        abasUsuario.setSelectedIndex(2);
        this.abasUsuario.setEnabledAt(0, false);
        this.abasUsuario.setEnabledAt(1, false);
        this.abasUsuario.setEnabledAt(2, true);
    }//GEN-LAST:event_removerUsuarioActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        this.campoCPFAddCliente.setText("");
        this.campoEnderecoAddCliente.setText("");
        this.campoNomeAddCliente.setText("");
        this.campoTelefoneAddCliente.setText("");
    }//GEN-LAST:event_cancelarBotaoActionPerformed

    private void botaoConfirmarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarUsuarioActionPerformed
        if (!campoCPFAddCliente.getText().equals("") && !campoEnderecoAddCliente.equals("") && !campoNomeAddCliente.equals("") && !campoTelefoneAddCliente.equals("")) {
            controladorCliente.insereCliente(campoNomeAddCliente.getText(), campoCPFAddCliente.getText(), campoEnderecoAddCliente.getText(), campoTelefoneAddCliente.getText());
            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos");
        }

        this.campoCPFAddCliente.setText("");
        this.campoEnderecoAddCliente.setText("");
        this.campoNomeAddCliente.setText("");
        this.campoTelefoneAddCliente.setText("");
    }//GEN-LAST:event_botaoConfirmarUsuarioActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        Cliente cliente = controladorCliente.buscaClientePorCPFouNome(campoBuscaNome.getText(), campoBuscaCPF.getText());

        nomeClienteBuscado.setText("Nome:");
        cpfDoClienteBuscado.setText("CPF/CNPJ:");
        telefoneDoClienteBuscado.setText("Telefone:");
        enderecoDoClienteBuscado.setText("Endereço:");

        if (cliente != null) {
            nomeClienteBuscado.setText(nomeClienteBuscado.getText() + " " + cliente.getNome());
            cpfDoClienteBuscado.setText(cpfDoClienteBuscado.getText() + " " + cliente.getCpf_cnpj());
            telefoneDoClienteBuscado.setText(telefoneDoClienteBuscado.getText() + " " + cliente.getTelefone());
            enderecoDoClienteBuscado.setText(enderecoDoClienteBuscado.getText() + " " + cliente.getEndereco());

            novoNome.setText(cliente.getNome());
            novoCPF.setText(cliente.getCpf_cnpj());
            novoEndereco.setText(cliente.getEndereco());
            novoTelefone.setText(cliente.getTelefone());
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buscarClienteActionPerformed

    private void atualizaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaClienteActionPerformed
        Cliente cliente = controladorCliente.buscaClientePorCPFouNome(campoBuscaNome.getText(), campoBuscaCPF.getText());

        if (!novoEndereco.getText().equals("") && !novoTelefone.getText().equals("") && !novoNome.getText().equals("") && !novoCPF.equals("")) {
            controladorCliente.atualizaCliente(novoNome.getText(), novoCPF.getText(), novoEndereco.getText(), novoTelefone.getText(), cliente.getCpf_cnpj());
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Campos precisam ser preenchidos", null, JOptionPane.OK_OPTION);
            
        }
    }//GEN-LAST:event_atualizaClienteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasUsuario;
    private javax.swing.JButton adicionarUsuario;
    private javax.swing.JButton atualizaCliente;
    private javax.swing.JToolBar barraCliente;
    private javax.swing.JButton botaoConfirmarUsuario;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JTextField campoBuscaCPF;
    private javax.swing.JTextField campoBuscaNome;
    private javax.swing.JTextField campoCPFAddCliente;
    private javax.swing.JTextField campoEnderecoAddCliente;
    private javax.swing.JTextField campoNomeAddCliente;
    private javax.swing.JTextField campoTelefoneAddCliente;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JLabel cpfDoClienteBuscado;
    private javax.swing.JButton editarUsuario;
    private javax.swing.JLabel enderecoDoClienteBuscado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nomeClienteBuscado;
    private javax.swing.JTextField novoCPF;
    private javax.swing.JTextField novoEndereco;
    private javax.swing.JTextField novoNome;
    private javax.swing.JTextField novoTelefone;
    private javax.swing.JButton removerUsuario;
    private javax.swing.JLabel telefoneDoClienteBuscado;
    // End of variables declaration//GEN-END:variables
}
