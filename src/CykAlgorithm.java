
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keerati
 */
public class CykAlgorithm extends javax.swing.JFrame {

    /**
     * Creates new form CykAlgorithm
     */
    public CykAlgorithm() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wordTextFiled = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        grammaTextField = new javax.swing.JTextField();
        addRuleButton = new javax.swing.JButton();
        clearRuleButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ruleTextArea = new javax.swing.JTextArea();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CYK ALGORITHM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CYK Algorithm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Word");

        wordTextFiled.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        wordTextFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTextFiledActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Gramma");

        grammaTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        grammaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grammaTextFieldActionPerformed(evt);
            }
        });

        addRuleButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addRuleButton.setText("ADD RULE");
        addRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRuleButtonActionPerformed(evt);
            }
        });

        clearRuleButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clearRuleButton.setText("CLEAR");
        clearRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRuleButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Rule");

        ruleTextArea.setColumns(20);
        ruleTextArea.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        ruleTextArea.setRows(5);
        ruleTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(ruleTextArea);
        ruleTextArea.setEditable(false);

        calculateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        calculateButton.setText("CALCULATE");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addRuleButton)
                                    .addComponent(grammaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearRuleButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(wordTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculateButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(calculateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wordTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(grammaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(addRuleButton)
                                .addGap(162, 162, 162))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearRuleButton)
                                .addGap(58, 58, 58)))
                        .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(filler12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        CNF cnf = new CNF(cfg);
        String w = wordTextFiled.getText();
        String rules = ruleTextArea.getText();
        if (w.length() == 0) {
            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            optionPane.setMessage("Please enter word text field");

            JDialog dialog = optionPane.createDialog(null, "CYK Algorithm");
            dialog.setVisible(true);
            return;
        }
        if (rules.length() == 0) {
            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            optionPane.setMessage("Please enter rules");

            JDialog dialog = optionPane.createDialog(null, "CYK Algorithm");
            dialog.setVisible(true);
            return;
        }
        if (!cnf.checkCNF()) {
            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            optionPane.setMessage("It isn't a CNF");

            JDialog dialog = optionPane.createDialog(null, "CYK Algorithm");
            dialog.setVisible(true);
            ruleTextArea.setText("");
            grammaTextField.setText("");
            cfg.clearData();
            return;
        } else {
            CYK cyk = new CYK(cfg, w);
            String calCyk[][] = cyk.calculateCYK();
            String cykTable[][] = new String[w.length()][w.length()];
            for (int i = 0; i < w.length(); i++) {
                for (int j = 0; j < w.length(); j++) {
                    cykTable[i][j] = calCyk[i][j];
                }
            }

            String col[] = new String[w.length()];
            for (int i = 0; i < w.length(); i++) {
                col[i] = Character.toString(w.charAt(i));
            }
            new ShowTable(cykTable,col).setVisible(true);
            for (int i = 0; i < calCyk.length - 1; i++) {
                for (int j = 0; j < calCyk.length - 1; j++) {
                    System.out.print(calCyk[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void clearRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRuleButtonActionPerformed
        cfg.clearData();
        cfgAll = "";
        ruleTextArea.setText(cfgAll);
        grammaTextField.setText("");
    }//GEN-LAST:event_clearRuleButtonActionPerformed

    private void addRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRuleButtonActionPerformed

        String cfg = grammaTextField.getText();
        if (cfg.length() == 0) {
            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            optionPane.setMessage("Please enter gramma text field");

            JDialog dialog = optionPane.createDialog(null, "CYK Algorithm");
            dialog.setVisible(true);
            return;
        }
        cfgAll += "\n" + cfg;

        this.cfg.addRule(cfg);
        ruleTextArea.setText(cfgAll);
        grammaTextField.setText("");
    }//GEN-LAST:event_addRuleButtonActionPerformed

    private void grammaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grammaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grammaTextFieldActionPerformed

    private void wordTextFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTextFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordTextFiledActionPerformed

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
            java.util.logging.Logger.getLogger(CykAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CykAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CykAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CykAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CykAlgorithm().setVisible(true);
            }
        });
    }
    CFG cfg = new CFG();
    private String cfgAll = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRuleButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearRuleButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler14;
    private javax.swing.JTextField grammaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ruleTextArea;
    private javax.swing.JTextField wordTextFiled;
    // End of variables declaration//GEN-END:variables
}
