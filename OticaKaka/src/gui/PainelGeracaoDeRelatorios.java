/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import geracaopdf.ClienteListaPDF;
import controlador.ControladorCliente;
import geracaopdf.ClienteIndividualPDF;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Cliente;

/**
 *
 * @author Igor
 */
public class PainelGeracaoDeRelatorios extends javax.swing.JPanel {

    /**
     * Creates new form PainelGeracaoDeRelatorios
     */
    ArrayList<Cliente> clientes;
    ControladorCliente controladorCliente = new ControladorCliente();
    DefaultTableModel modelTabelaClientes;
    
    public PainelGeracaoDeRelatorios() {
        initComponents();
        abasRelatorio.setSelectedIndex(0);
        this.abasRelatorio.setEnabledAt(0, true);
        this.abasRelatorio.setEnabledAt(1, false);
        this.abasRelatorio.setEnabledAt(2, false);
        this.abasRelatorio.setEnabledAt(3, false);
        campoListaPorNome.setEnabled(false);
        campoListaPorCPFCNPJ.setEnabled(false);
        modelTabelaClientes = (DefaultTableModel) tabelaRelatorioClientes.getModel();
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
        clientesRelatorio = new javax.swing.JButton();
        transacoesRelatorio = new javax.swing.JButton();
        produtosRelatorio = new javax.swing.JButton();
        notasDeVendaRelatório = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        abasRelatorio = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoListaPorNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoListaPorCPFCNPJ = new javax.swing.JTextField();
        checkPeloNome = new javax.swing.JCheckBox();
        checkPeloCPFCNPJ = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorioClientes = new javax.swing.JTable();
        gerarListaPDF = new javax.swing.JButton();
        clienteIndividualPDF = new javax.swing.JButton();
        buscarClientes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        barraCliente.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraCliente.setRollover(true);

        clientesRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        clientesRelatorio.setText("Clientes");
        clientesRelatorio.setFocusable(false);
        clientesRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clientesRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clientesRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesRelatorioActionPerformed(evt);
            }
        });
        barraCliente.add(clientesRelatorio);

        transacoesRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transacoes2.png"))); // NOI18N
        transacoesRelatorio.setText("Transações");
        transacoesRelatorio.setFocusable(false);
        transacoesRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transacoesRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        transacoesRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacoesRelatorioActionPerformed(evt);
            }
        });
        barraCliente.add(transacoesRelatorio);

        produtosRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/glasses.png"))); // NOI18N
        produtosRelatorio.setText("Produtos");
        produtosRelatorio.setFocusable(false);
        produtosRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtosRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        produtosRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosRelatorioActionPerformed(evt);
            }
        });
        barraCliente.add(produtosRelatorio);

        notasDeVendaRelatório.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nota.png"))); // NOI18N
        notasDeVendaRelatório.setText("Nota de Venda");
        notasDeVendaRelatório.setFocusable(false);
        notasDeVendaRelatório.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        notasDeVendaRelatório.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        notasDeVendaRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasDeVendaRelatórioActionPerformed(evt);
            }
        });
        barraCliente.add(notasDeVendaRelatório);

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

        jLabel6.setText("Gere lista de clientes pelo nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Relatórios sobre clientes");

        jLabel8.setText("Gere a lista de clientes pelo CPF/CNPJ:");

        checkPeloNome.setText("Gere lista pelo nome");
        checkPeloNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPeloNomeActionPerformed(evt);
            }
        });

        checkPeloCPFCNPJ.setText("Gere lista CPF/CNPJ");
        checkPeloCPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPeloCPFCNPJActionPerformed(evt);
            }
        });

        tabelaRelatorioClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF/CNPJ", "Nome", "Endereço", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaRelatorioClientes);

        gerarListaPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaClientes.png"))); // NOI18N
        gerarListaPDF.setText("Lista Inteira");
        gerarListaPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarListaPDFActionPerformed(evt);
            }
        });

        clienteIndividualPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clienteDaLista.png"))); // NOI18N
        clienteIndividualPDF.setText("Cliente Individual");
        clienteIndividualPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteIndividualPDFActionPerformed(evt);
            }
        });

        buscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscarClientes.setText("Buscar Clientes");
        buscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientesActionPerformed(evt);
            }
        });

        jLabel9.setText("Gere um arquivo PDF da (e):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(gerarListaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clienteIndividualPDF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addGap(95, 95, 95))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(campoListaPorNome)
                                    .addComponent(jLabel8)
                                    .addComponent(campoListaPorCPFCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkPeloNome)
                                    .addComponent(checkPeloCPFCNPJ))))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoListaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPeloNome))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoListaPorCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPeloCPFCNPJ))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gerarListaPDF)
                        .addComponent(clienteIndividualPDF))
                    .addComponent(buscarClientes))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        abasRelatorio.addTab("Clientes", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        abasRelatorio.addTab("Transações", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        abasRelatorio.addTab("Produtos", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        abasRelatorio.addTab("Nota de Venda", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abasRelatorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abasRelatorio)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clientesRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesRelatorioActionPerformed
        abasRelatorio.setSelectedIndex(0);
        this.abasRelatorio.setEnabledAt(0, true);
        this.abasRelatorio.setEnabledAt(1, false);
        this.abasRelatorio.setEnabledAt(2, false);
        this.abasRelatorio.setEnabledAt(3, false);
    }//GEN-LAST:event_clientesRelatorioActionPerformed

    private void transacoesRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacoesRelatorioActionPerformed
        abasRelatorio.setSelectedIndex(1);
        this.abasRelatorio.setEnabledAt(0, false);
        this.abasRelatorio.setEnabledAt(1, true);
        this.abasRelatorio.setEnabledAt(2, false);
        this.abasRelatorio.setEnabledAt(3, false);
    }//GEN-LAST:event_transacoesRelatorioActionPerformed

    private void produtosRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosRelatorioActionPerformed
        abasRelatorio.setSelectedIndex(2);
        this.abasRelatorio.setEnabledAt(2, true);
        this.abasRelatorio.setEnabledAt(1, false);
        this.abasRelatorio.setEnabledAt(0, false);
        this.abasRelatorio.setEnabledAt(3, false);
    }//GEN-LAST:event_produtosRelatorioActionPerformed

    private void notasDeVendaRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasDeVendaRelatórioActionPerformed
        abasRelatorio.setSelectedIndex(3);
        this.abasRelatorio.setEnabledAt(3, true);
        this.abasRelatorio.setEnabledAt(1, false);
        this.abasRelatorio.setEnabledAt(0, false);
        this.abasRelatorio.setEnabledAt(2, false);
    }//GEN-LAST:event_notasDeVendaRelatórioActionPerformed

    private void checkPeloNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPeloNomeActionPerformed
        if (checkPeloNome.isSelected()) {
            checkPeloCPFCNPJ.setSelected(false);
            campoListaPorNome.setEnabled(true);
            campoListaPorCPFCNPJ.setEnabled(false);
        }
    }//GEN-LAST:event_checkPeloNomeActionPerformed

    private void checkPeloCPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPeloCPFCNPJActionPerformed
        if (checkPeloCPFCNPJ.isSelected()) {
            checkPeloNome.setSelected(false);
            campoListaPorCPFCNPJ.setEnabled(true);
            campoListaPorNome.setEnabled(false);
        }
    }//GEN-LAST:event_checkPeloCPFCNPJActionPerformed

    private void buscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientesActionPerformed
         if (campoListaPorNome.getText() != null && !campoListaPorNome.getText().equals("") && campoListaPorNome.isEnabled()) {
            clientes = controladorCliente.buscaClientesPorNome(campoListaPorNome.getText());
        } else if (campoListaPorCPFCNPJ.getText() != null && !campoListaPorCPFCNPJ.getText().equals("") && campoListaPorCPFCNPJ.isEnabled()) {
            clientes = controladorCliente.buscaClientesPorCPFCNPJ(campoListaPorCPFCNPJ.getText());
        } else {
            clientes = controladorCliente.buscaTodosOsClientes();
        }

        modelTabelaClientes.setNumRows(0);


        for (int i = 0; i < clientes.size(); i++) {
            Vector vec = new Vector();
            vec.add(0, clientes.get(i).getCpf_cnpj());
            vec.add(1, clientes.get(i).getNome());
            vec.add(2, clientes.get(i).getEndereco());
            vec.add(3, clientes.get(i).getTelefone());
            modelTabelaClientes.addRow(vec);
        }

        this.repaint();
    }//GEN-LAST:event_buscarClientesActionPerformed

    private void clienteIndividualPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteIndividualPDFActionPerformed
        if (tabelaRelatorioClientes.getSelectedRow()!=-1) {
            Cliente clienteEscolhido = clientes.get(tabelaRelatorioClientes.getSelectedRow());
            ClienteIndividualPDF clientePDF = new ClienteIndividualPDF(clienteEscolhido);
            JOptionPane.showMessageDialog(this, "Relatório de cliente gerado com sucesso. Cheque-o em C:ArquivosPDF/Clientes/", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Um cliente precisa ser selecionado na Tabela", null, JOptionPane.OK_OPTION);
        }
            
    }//GEN-LAST:event_clienteIndividualPDFActionPerformed

    private void gerarListaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarListaPDFActionPerformed
         if (clientes != null && clientes.size()>0)   {
            ClienteListaPDF clienteListaPDF = new ClienteListaPDF(clientes);
            JOptionPane.showMessageDialog(this, "Relatório de lista de clientes gerado com sucesso. Cheque-o em C:ArquivosPDF/Clientes/", "Warning", JOptionPane.WARNING_MESSAGE);
         } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para esta opção de busca", null, JOptionPane.OK_OPTION);
         }
    }//GEN-LAST:event_gerarListaPDFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasRelatorio;
    private javax.swing.JToolBar barraCliente;
    private javax.swing.JButton buscarClientes;
    private javax.swing.JTextField campoListaPorCPFCNPJ;
    private javax.swing.JTextField campoListaPorNome;
    private javax.swing.JCheckBox checkPeloCPFCNPJ;
    private javax.swing.JCheckBox checkPeloNome;
    private javax.swing.JButton clienteIndividualPDF;
    private javax.swing.JButton clientesRelatorio;
    private javax.swing.JButton gerarListaPDF;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton notasDeVendaRelatório;
    private javax.swing.JButton produtosRelatorio;
    private javax.swing.JTable tabelaRelatorioClientes;
    private javax.swing.JButton transacoesRelatorio;
    // End of variables declaration//GEN-END:variables
}
