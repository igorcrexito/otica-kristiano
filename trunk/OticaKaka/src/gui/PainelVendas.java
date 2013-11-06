/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorCliente;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Cliente;

/**
 *
 * @author Igor
 */
public class PainelVendas extends javax.swing.JPanel {

    /**
     * Creates new form PainelVendas
     */
    private ArrayList<Cliente> clientes;
    DefaultTableModel modelClientes;
    ControladorCliente controladorCliente = new ControladorCliente();
    Cliente clienteSelecionado;
    
    public PainelVendas() {
        initComponents();
        
        campoBuscaClienteCPF.setEnabled(false);
        campoBuscaClienteNome.setEnabled(false);
        abasVendas.setEnabledAt(1, false);
        abasVendas.setEnabledAt(2, false);
        
        modelClientes = (DefaultTableModel) tabelaClientes.getModel();
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
        selecionarCliente = new javax.swing.JButton();
        selecionarProduto = new javax.swing.JButton();
        realizarVenda = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        abasVendas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBuscaClienteCPF = new javax.swing.JTextField();
        checkCPF = new javax.swing.JCheckBox();
        checkNome = new javax.swing.JCheckBox();
        campoBuscaClienteNome = new javax.swing.JTextField();
        buscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        selecionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        barraCliente.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraCliente.setRollover(true);

        selecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        selecionarCliente.setText("Selecione o cliente");
        selecionarCliente.setFocusable(false);
        selecionarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selecionarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        selecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarClienteActionPerformed(evt);
            }
        });
        barraCliente.add(selecionarCliente);

        selecionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/glasses.png"))); // NOI18N
        selecionarProduto.setText("Selecione o produto");
        selecionarProduto.setFocusable(false);
        selecionarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selecionarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        selecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarProdutoActionPerformed(evt);
            }
        });
        barraCliente.add(selecionarProduto);

        realizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transacoes2.png"))); // NOI18N
        realizarVenda.setText("Realize a venda");
        realizarVenda.setFocusable(false);
        realizarVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        realizarVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVendaActionPerformed(evt);
            }
        });
        barraCliente.add(realizarVenda);

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
        jLabel1.setText("Selecione o cliente");

        jLabel7.setText("Busque o cliente por CPF/CNPJ");

        checkCPF.setText("Busque por CPF/CNPJ");
        checkCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCPFActionPerformed(evt);
            }
        });

        checkNome.setText("Busque por nome");
        checkNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNomeActionPerformed(evt);
            }
        });

        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscarCliente.setText("Buscar");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF/CNPJ", "Nome", "Endereço", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaClientes);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/select.png"))); // NOI18N
        selecionar.setText("Selecionar");
        selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(campoBuscaClienteCPF)
                                    .addComponent(campoBuscaClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkCPF)
                                    .addComponent(checkNome))
                                .addGap(0, 16, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscaClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCPF))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscaClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarCliente)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecionar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        abasVendas.addTab("Selecione o cliente", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Selecione o produto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        abasVendas.addTab("Selecione o produto", jPanel3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Realize a venda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        abasVendas.addTab("Realize a venda", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abasVendas))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abasVendas)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarClienteActionPerformed
        abasVendas.setSelectedIndex(0);
        
        abasVendas.setEnabledAt(0, true);
        abasVendas.setEnabledAt(1, false);
        abasVendas.setEnabledAt(2, false);
    }//GEN-LAST:event_selecionarClienteActionPerformed

    private void selecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarProdutoActionPerformed
         abasVendas.setSelectedIndex(1);
        
        abasVendas.setEnabledAt(0, false);
        abasVendas.setEnabledAt(1, true);
        abasVendas.setEnabledAt(2, false);
    }//GEN-LAST:event_selecionarProdutoActionPerformed

    private void realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVendaActionPerformed
        abasVendas.setSelectedIndex(2);
        
        abasVendas.setEnabledAt(0, false);
        abasVendas.setEnabledAt(1, false);
        abasVendas.setEnabledAt(2, true);
    }//GEN-LAST:event_realizarVendaActionPerformed

    private void checkCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCPFActionPerformed
        if (checkCPF.isSelected()) {
            campoBuscaClienteCPF.setEnabled(true);
            checkNome.setSelected(false);
            campoBuscaClienteNome.setEnabled(false);
        } else {
            campoBuscaClienteCPF.setEnabled(false);
        }
    }//GEN-LAST:event_checkCPFActionPerformed

    private void checkNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNomeActionPerformed
        if (checkNome.isSelected()) {
            campoBuscaClienteNome.setEnabled(true);
            campoBuscaClienteCPF.setEnabled(false);
            checkCPF.setSelected(false);
        } else {
            campoBuscaClienteNome.setEnabled(false);
        }
    }//GEN-LAST:event_checkNomeActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed

        if (campoBuscaClienteNome.getText() != null && !campoBuscaClienteNome.getText().equals("") && campoBuscaClienteNome.isEnabled()) {
            clientes = controladorCliente.buscaClientesPorNome(campoBuscaClienteNome.getText());
        } else if (campoBuscaClienteCPF.getText() != null && !campoBuscaClienteCPF.getText().equals("") && campoBuscaClienteCPF.isEnabled()) {
            clientes = controladorCliente.buscaClientesPorCPFCNPJ(campoBuscaClienteCPF.getText());
        } else {
            clientes = controladorCliente.buscaTodosOsClientes();
        }

        modelClientes.setNumRows(0);

        for (int i = 0; i < clientes.size(); i++) {
            Vector vec = new Vector();
            vec.add(0, clientes.get(i).getCpf_cnpj());
            vec.add(1, clientes.get(i).getNome());
            vec.add(2, clientes.get(i).getEndereco());
            vec.add(3, clientes.get(i).getTelefone());
            modelClientes.addRow(vec);
        }

        this.repaint();
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        campoBuscaClienteCPF.setEnabled(false);
        campoBuscaClienteNome.setEnabled(false);
        checkCPF.setSelected(false);
        checkNome.setSelected(false);
        
        modelClientes.setNumRows(0);
    }//GEN-LAST:event_cancelarActionPerformed

    private void selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarActionPerformed
         try {
            int selecionado = tabelaClientes.getSelectedRow();
            clienteSelecionado = clientes.get(selecionado);
            JOptionPane.showMessageDialog(this, "Cliente selecionado com sucesso", "Warning", JOptionPane.WARNING_MESSAGE);
            abasVendas.setSelectedIndex(1);
            abasVendas.setEnabledAt(0, false);
            abasVendas.setEnabledAt(2, false);
            abasVendas.setEnabledAt(1, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Um cliente deve ser selecionado na tabela", null, JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_selecionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasVendas;
    private javax.swing.JToolBar barraCliente;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JTextField campoBuscaClienteCPF;
    private javax.swing.JTextField campoBuscaClienteNome;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkCPF;
    private javax.swing.JCheckBox checkNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton realizarVenda;
    private javax.swing.JButton selecionar;
    private javax.swing.JButton selecionarCliente;
    private javax.swing.JButton selecionarProduto;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
