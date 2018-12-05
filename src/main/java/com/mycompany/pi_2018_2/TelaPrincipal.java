/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi_2018_2;

import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodol
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Banco banco;
    Conta conta;
    Tabela priceSimulado;
    Tabela sacSimulado;
    int i = 0;
    DecimalFormat formato = new DecimalFormat("#,###,###,##0.##");

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    public TelaPrincipal(Banco banco, Conta conta) {
        this.banco = banco;
        this.conta = conta;
        initComponents();
        
        jTextField1.setText(conta.getRenda());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaPrice = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaSac = new javax.swing.JTable();
        botaoPrice = new javax.swing.JButton();
        botaoSac = new javax.swing.JButton();
        botaoSimular = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Renda:");

        jLabel7.setText("Valor do emprestimo:");

        jLabel8.setText("Numero de parcelas:");

        tabelaPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaPrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI", "Juros", "Amortizacao", "PMT", "SF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaPrice);

        tabelaSac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI", "Juros", "Amortizacao", "PMT", "SF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelaSac);

        botaoPrice.setText("Pegar emprestimo PRICE");
        botaoPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPriceActionPerformed(evt);
            }
        });

        botaoSac.setText("Pegar emprestimo SAC");
        botaoSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSacActionPerformed(evt);
            }
        });

        botaoSimular.setText("Simular");
        botaoSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimularActionPerformed(evt);
            }
        });

        jLabel9.setText("PRICE");

        jLabel10.setText("SAC");

        jLabel1.setText("Pagando:");

        jTextField1.setEditable(false);
        jTextField1.setText("\"Valor da renda\"");

        jTextField2.setEditable(false);
        jTextField2.setText("\"Valor sendo pago\"");

        jLabel2.setText("Taxa:");

        jTextField5.setEditable(false);
        jTextField5.setText("5,00 %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(botaoSimular)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(botaoPrice))
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSac))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSimular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoPrice)
                            .addComponent(botaoSac))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simulacao de parcelas", jPanel2);

        tabela2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI", "Juros", "Amortizacao", "PMT", "SF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tabela2);

        tabela1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI", "Juros", "Amortizacao", "PMT", "SF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tabela1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimularActionPerformed
        
        double emprestimo =  Double.parseDouble(jTextField3.getText());
        int parcelas = Integer.parseInt(jTextField4.getText());
        
        Calculo calculo = new Calculo();
        
//        System.out.println(priceSimulado.toString());
        
        priceSimulado = calculo.tabelaPrice(emprestimo, parcelas, 5);
        sacSimulado = calculo.tabelaSac(emprestimo, parcelas, 5);
        
        System.out.println(priceSimulado.toString());
        
        preencherPriceSimulado(priceSimulado);
        preencherSacSimulado(sacSimulado);
        
    }//GEN-LAST:event_botaoSimularActionPerformed

    private void botaoPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPriceActionPerformed
        
        priceSimulado.setConta(conta);
        
        try {
           String sql = "INSERT INTO tabela VALUES (default, "
                   + "'"+priceSimulado.getConta()+"', "
                   + "'"+priceSimulado.getTipo()+"', "
                   + "'"+priceSimulado.getPv()+"', "
                   + "'"+priceSimulado.getN()+"', "
                   + "'"+priceSimulado.getI()+"', "
                   + "'"+priceSimulado.getSi()+"', "
                   + "'"+priceSimulado.getJuros()+"', "
                   + "'"+priceSimulado.getAmort()+"', "
                   + "'"+priceSimulado.getPmt()+"', "
                   + "'"+priceSimulado.getSf()+"')";
           PreparedStatement pstm = banco.getCon().prepareStatement(sql);
           pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        apagarComponentes();
        
    }//GEN-LAST:event_botaoPriceActionPerformed

    private void botaoSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSacActionPerformed
        
        sacSimulado.setConta(conta);
        
        try {
           String sql = "INSERT INTO tabela VALUES (default, "
                   + "'"+sacSimulado.getConta()+"', "
                   + "'"+sacSimulado.getTipo()+"', "
                   + "'"+sacSimulado.getPv()+"', "
                   + "'"+sacSimulado.getN()+"', "
                   + "'"+sacSimulado.getI()+"', "
                   + "'"+sacSimulado.getSi()+"', "
                   + "'"+sacSimulado.getJuros()+"', "
                   + "'"+sacSimulado.getAmort()+"', "
                   + "'"+sacSimulado.getPmt()+"', "
                   + "'"+sacSimulado.getSf()+"')";
           PreparedStatement pstm = banco.getCon().prepareStatement(sql);
           pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        apagarComponentes();
        
    }//GEN-LAST:event_botaoSacActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPrice;
    private javax.swing.JButton botaoSac;
    private javax.swing.JButton botaoSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tabela2;
    private javax.swing.JTable tabelaPrice;
    private javax.swing.JTable tabelaSac;
    // End of variables declaration//GEN-END:variables

    private void preencherPriceSimulado(Tabela priceSimulado) {

        DefaultTableModel modeloTable = (DefaultTableModel) tabelaPrice.getModel();

        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
        i = 0;
        for (Double item : priceSimulado.getSi()) {
            modeloTable.addRow(new Object[]{formato.format(item), 
                formato.format(priceSimulado.getJuros().get(i)), 
                formato.format(priceSimulado.getAmort().get(i)), 
                formato.format(priceSimulado.getPmt().get(i)), 
                formato.format(priceSimulado.getSf().get(i))});
            i++;
        }
        i = 0;
            
    }

    private void preencherSacSimulado(Tabela sacSimulado) {
        
        DefaultTableModel modeloTable = (DefaultTableModel) tabelaSac.getModel();

        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
        i = 0;
        for (Double item : sacSimulado.getSi()) {
            modeloTable.addRow(new Object[]{formato.format(item), 
                formato.format(sacSimulado.getJuros().get(i)), 
                formato.format(sacSimulado.getAmort().get(i)), 
                formato.format(sacSimulado.getPmt().get(i)), 
                formato.format(sacSimulado.getSf().get(i))});
            i++;
        }
        i = 0;
    }

    private void apagarComponentes() {
        
        DefaultTableModel modeloTable;
        
        modeloTable = (DefaultTableModel) tabelaPrice.getModel();

        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
        modeloTable = (DefaultTableModel) tabelaSac.getModel();

        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        
        jTextField3.setText("");
        jTextField4.setText("");
        banco = new Banco();
        conta = new Conta();
        priceSimulado = new Tabela();
        sacSimulado = new Tabela();
        i = 0;
        
        
    }
    
}
