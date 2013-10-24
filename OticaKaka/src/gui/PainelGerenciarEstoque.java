/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorProduto;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import utils.Produto;

/**
 *
 * @author Igor
 */
public class PainelGerenciarEstoque extends javax.swing.JPanel {

    /**
     * Creates new form PainelGerenciarEstoque
     */
    DefaultTableModel modelProdutos;
    ControladorProduto controladorProduto = new ControladorProduto();
    ArrayList<Produto> produtos;

    public PainelGerenciarEstoque() {
        initComponents();
        modelProdutos = (DefaultTableModel) tabelaEstoque.getModel();


        this.campoCodigo.setEnabled(false);
        this.campoQuantidade.setEnabled(false);
        this.campoPreco.setEnabled(false);
        this.campoNome.setEnabled(false);

        this.comboMaiorQuantidade.setEnabled(false);
        this.comboMenorPreco.setEnabled(false);

        this.tipoBFRadio.setEnabled(false);
        this.tipoEPRadio.setEnabled(false);
        this.tipoMTRadio.setEnabled(false);
        this.tipoVSRadio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkCodigo = new javax.swing.JCheckBox();
        checkNome = new javax.swing.JCheckBox();
        checkQuantidade = new javax.swing.JCheckBox();
        checkPreco = new javax.swing.JCheckBox();
        checkTipo = new javax.swing.JCheckBox();
        campoCodigo = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoQuantidade = new javax.swing.JTextField();
        campoPreco = new javax.swing.JTextField();
        comboMaiorQuantidade = new javax.swing.JComboBox();
        comboMenorPreco = new javax.swing.JComboBox();
        buscarProdutoEstoque = new javax.swing.JButton();
        cancelarBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        tipoBFRadio = new javax.swing.JRadioButton();
        tipoVSRadio = new javax.swing.JRadioButton();
        tipoMTRadio = new javax.swing.JRadioButton();
        tipoEPRadio = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de Estoque");

        jLabel2.setText("Selecione o tipo de filtro:");

        checkCodigo.setText("Busque pelo código");
        checkCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCodigoActionPerformed(evt);
            }
        });

        checkNome.setText("Busque pelo nome");
        checkNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNomeActionPerformed(evt);
            }
        });

        checkQuantidade.setText("Busque pela quantidade");
        checkQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuantidadeActionPerformed(evt);
            }
        });

        checkPreco.setText("Busque pelo preço");
        checkPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPrecoActionPerformed(evt);
            }
        });

        checkTipo.setText("Busque pelo tipo");
        checkTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTipoActionPerformed(evt);
            }
        });

        comboMaiorQuantidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acima de:", "Abaixo de:" }));

        comboMenorPreco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acima de:", "Abaixo de:" }));

        buscarProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscarProdutoEstoque.setText("Buscar");
        buscarProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdutoEstoqueActionPerformed(evt);
            }
        });

        cancelarBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        cancelarBusca.setText("Cancelar");
        cancelarBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBuscaActionPerformed(evt);
            }
        });

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tabelaEstoque);

        tipoBFRadio.setText("BF");
        tipoBFRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoBFRadioActionPerformed(evt);
            }
        });

        tipoVSRadio.setText("VS");
        tipoVSRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVSRadioActionPerformed(evt);
            }
        });

        tipoMTRadio.setText("MT");
        tipoMTRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMTRadioActionPerformed(evt);
            }
        });

        tipoEPRadio.setText("EP");
        tipoEPRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEPRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodigo)
                                    .addComponent(campoNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboMaiorQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoPreco)
                                            .addComponent(campoQuantidade)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipoBFRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoVSRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoMTRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoEPRadio)
                                        .addGap(0, 41, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkQuantidade)
                                    .addComponent(checkNome)
                                    .addComponent(checkCodigo)
                                    .addComponent(checkPreco)
                                    .addComponent(checkTipo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(buscarProdutoEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarBusca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkCodigo)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkQuantidade)
                                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboMaiorQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkPreco)
                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkTipo)
                            .addComponent(tipoBFRadio)
                            .addComponent(tipoVSRadio)
                            .addComponent(tipoMTRadio)
                            .addComponent(tipoEPRadio))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarProdutoEstoque)
                            .addComponent(cancelarBusca)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBuscaActionPerformed

    private void checkCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCodigoActionPerformed
        if (checkCodigo.isSelected()) {
            this.campoCodigo.setEnabled(true);
            this.campoQuantidade.setEnabled(false);
            this.campoPreco.setEnabled(false);
            this.campoNome.setEnabled(false);

            this.comboMaiorQuantidade.setEnabled(false);
            this.comboMenorPreco.setEnabled(false);

            this.tipoBFRadio.setEnabled(false);
            this.tipoEPRadio.setEnabled(false);
            this.tipoMTRadio.setEnabled(false);
            this.tipoVSRadio.setEnabled(false);

            checkPreco.setSelected(false);
            checkNome.setSelected(false);
            checkQuantidade.setSelected(false);
            checkTipo.setSelected(false);
        }
    }//GEN-LAST:event_checkCodigoActionPerformed

    private void checkNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNomeActionPerformed
        if (checkNome.isSelected()) {
            this.campoCodigo.setEnabled(false);
            this.campoQuantidade.setEnabled(false);
            this.campoPreco.setEnabled(false);
            this.campoNome.setEnabled(true);

            this.comboMaiorQuantidade.setEnabled(false);
            this.comboMenorPreco.setEnabled(false);

            this.tipoBFRadio.setEnabled(false);
            this.tipoEPRadio.setEnabled(false);
            this.tipoMTRadio.setEnabled(false);
            this.tipoVSRadio.setEnabled(false);

            checkTipo.setSelected(false);
            checkCodigo.setSelected(false);
            checkQuantidade.setSelected(false);
            checkPreco.setSelected(false);
        }
    }//GEN-LAST:event_checkNomeActionPerformed

    private void checkQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQuantidadeActionPerformed
        if (checkQuantidade.isSelected()) {
            this.campoCodigo.setEnabled(false);
            this.campoQuantidade.setEnabled(true);
            this.campoPreco.setEnabled(false);
            this.campoNome.setEnabled(false);

            this.comboMaiorQuantidade.setEnabled(true);
            this.comboMenorPreco.setEnabled(false);

            this.tipoBFRadio.setEnabled(false);
            this.tipoEPRadio.setEnabled(false);
            this.tipoMTRadio.setEnabled(false);
            this.tipoVSRadio.setEnabled(false);

            checkTipo.setSelected(false);
            checkNome.setSelected(false);
            checkCodigo.setSelected(false);
            checkPreco.setSelected(false);
        }
    }//GEN-LAST:event_checkQuantidadeActionPerformed

    private void checkPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPrecoActionPerformed
        if (checkPreco.isSelected()) {
            this.campoCodigo.setEnabled(false);
            this.campoQuantidade.setEnabled(false);
            this.campoPreco.setEnabled(true);
            this.campoNome.setEnabled(false);

            this.comboMaiorQuantidade.setEnabled(false);
            this.comboMenorPreco.setEnabled(true);

            this.tipoBFRadio.setEnabled(false);
            this.tipoEPRadio.setEnabled(false);
            this.tipoMTRadio.setEnabled(false);
            this.tipoVSRadio.setEnabled(false);

            checkCodigo.setSelected(false);
            checkNome.setSelected(false);
            checkQuantidade.setSelected(false);
            checkTipo.setSelected(false);
        }
    }//GEN-LAST:event_checkPrecoActionPerformed

    private void checkTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTipoActionPerformed
        if (this.checkTipo.isSelected()) {
            this.campoCodigo.setEnabled(false);
            this.campoQuantidade.setEnabled(false);
            this.campoPreco.setEnabled(false);
            this.campoNome.setEnabled(false);

            this.comboMaiorQuantidade.setEnabled(false);
            this.comboMenorPreco.setEnabled(false);

            this.tipoBFRadio.setEnabled(true);
            this.tipoEPRadio.setEnabled(true);
            this.tipoMTRadio.setEnabled(true);
            this.tipoVSRadio.setEnabled(true);

            checkCodigo.setSelected(false);
            checkNome.setSelected(false);
            checkQuantidade.setSelected(false);
            checkPreco.setSelected(false);
        }
    }//GEN-LAST:event_checkTipoActionPerformed

    private void tipoBFRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoBFRadioActionPerformed
        if (this.tipoBFRadio.isSelected()) {
            this.tipoEPRadio.setSelected(false);
            this.tipoMTRadio.setSelected(false);
            this.tipoVSRadio.setSelected(false);
        }
    }//GEN-LAST:event_tipoBFRadioActionPerformed

    private void tipoVSRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVSRadioActionPerformed
        if (this.tipoVSRadio.isSelected()) {
            this.tipoEPRadio.setSelected(false);
            this.tipoMTRadio.setSelected(false);
            this.tipoBFRadio.setSelected(false);
        }
    }//GEN-LAST:event_tipoVSRadioActionPerformed

    private void tipoMTRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoMTRadioActionPerformed
        if (this.tipoMTRadio.isSelected()) {
            this.tipoEPRadio.setSelected(false);
            this.tipoBFRadio.setSelected(false);
            this.tipoVSRadio.setSelected(false);
        }
    }//GEN-LAST:event_tipoMTRadioActionPerformed

    private void tipoEPRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEPRadioActionPerformed
        if (this.tipoEPRadio.isSelected()) {
            this.tipoMTRadio.setSelected(false);
            this.tipoBFRadio.setSelected(false);
            this.tipoVSRadio.setSelected(false);
        }
    }//GEN-LAST:event_tipoEPRadioActionPerformed

    private void buscarProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdutoEstoqueActionPerformed
        modelProdutos.setNumRows(0);           
        if (!checkCodigo.isSelected() && !checkNome.isSelected() && !checkPreco.isSelected() && !checkQuantidade.isSelected() && !checkTipo.isSelected()) {
        } else if (checkCodigo.isSelected() && !checkNome.isSelected() && !checkPreco.isSelected() && !checkQuantidade.isSelected() && !checkTipo.isSelected()) {
            //código
            produtos = controladorProduto.buscaClientesPorCodigo(campoCodigo.getSelectedText());
            for (int i = 0; i < produtos.size(); i++) {
                Vector vec = new Vector();
                vec.add(0, produtos.get(i).getCodigo());
                vec.add(1, produtos.get(i).getNome());
                vec.add(2, produtos.get(i).getPrecoPorUnidade());
                vec.add(3, produtos.get(i).getQuantidadeEstoque());
                vec.add(4, produtos.get(i).getTipoProduto());
                modelProdutos.addRow(vec);
            }
        } else if (!checkCodigo.isSelected() && checkNome.isSelected() && !checkPreco.isSelected() && !checkQuantidade.isSelected() && !checkTipo.isSelected()) {
            //nome
        } else if (!checkCodigo.isSelected() && !checkNome.isSelected() && checkPreco.isSelected() && !checkQuantidade.isSelected() && !checkTipo.isSelected()) {
            //preço
        } else if (!checkCodigo.isSelected() && !checkNome.isSelected() && !checkPreco.isSelected() && checkQuantidade.isSelected() && !checkTipo.isSelected()) {
            //quantidade
        } else if (!checkCodigo.isSelected() && !checkNome.isSelected() && !checkPreco.isSelected() && !checkQuantidade.isSelected() && checkTipo.isSelected()) {
            //tipo
        }
        this.repaint();
    }//GEN-LAST:event_buscarProdutoEstoqueActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProdutoEstoque;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JButton cancelarBusca;
    private javax.swing.JCheckBox checkCodigo;
    private javax.swing.JCheckBox checkNome;
    private javax.swing.JCheckBox checkPreco;
    private javax.swing.JCheckBox checkQuantidade;
    private javax.swing.JCheckBox checkTipo;
    private javax.swing.JComboBox comboMaiorQuantidade;
    private javax.swing.JComboBox comboMenorPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JRadioButton tipoBFRadio;
    private javax.swing.JRadioButton tipoEPRadio;
    private javax.swing.JRadioButton tipoMTRadio;
    private javax.swing.JRadioButton tipoVSRadio;
    // End of variables declaration//GEN-END:variables
}
