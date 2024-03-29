/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controle.ConfiguracaoInicial;
import javax.swing.JOptionPane;
import controle.IA;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author IcTxD
 */
public class SelecaoArma extends javax.swing.JFrame {
    ConfiguracaoInicial dadosFileIni;
    IA jogo;
    int i;

    private int j;
    /**
     * Creates new form SelecaoRobo
     * @param dadosFileIni
     */
    public SelecaoArma(ConfiguracaoInicial dadosFileIni) {
        initComponents();
        this.dadosFileIni = dadosFileIni;
        NameLabel.setText(dadosFileIni.getJogador().get(0).getNome());
        armasToTextArea();
        rad1.setSelected(true);
        i=0;
        
    }

    public void armasToTextArea(){
        robo1Text.setText(dadosFileIni.getArmas().get(0).toString());
        robo2Text.setText(dadosFileIni.getArmas().get(1).toString());
        robo3Text.setText(dadosFileIni.getArmas().get(2).toString());
        robo4Text.setText(dadosFileIni.getArmas().get(3).toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        robo1Text = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        robo2Text = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        robo4Text = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        robo3Text = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rad1 = new javax.swing.JRadioButton();
        rad2 = new javax.swing.JRadioButton();
        rad3 = new javax.swing.JRadioButton();
        rad4 = new javax.swing.JRadioButton();
        NameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        robo1Text.setColumns(20);
        robo1Text.setRows(5);
        jScrollPane1.setViewportView(robo1Text);

        robo2Text.setColumns(20);
        robo2Text.setRows(5);
        jScrollPane3.setViewportView(robo2Text);

        robo4Text.setColumns(20);
        robo4Text.setRows(5);
        jScrollPane4.setViewportView(robo4Text);

        robo3Text.setColumns(20);
        robo3Text.setRows(5);
        jScrollPane5.setViewportView(robo3Text);

        jLabel2.setText("Seleção de Arma");

        jLabel3.setText("Jogador:");

        buttonGroup1.add(rad1);
        rad1.setText("Escolher");

        buttonGroup1.add(rad2);
        rad2.setText("Escolher");

        buttonGroup1.add(rad3);
        rad3.setText("Escolher");

        buttonGroup1.add(rad4);
        rad4.setText("Escolher");

        jButton1.setText("Pronto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rad1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(rad2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rad3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rad4)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NameLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rad4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rad1)
                        .addComponent(rad2)
                        .addComponent(rad3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(i==0){
            if(rad1.isSelected()){ 
                dadosFileIni.getJogador().get(0).getRobo().setArma(dadosFileIni.getArmas().get(0));
  
            }
            else if(rad2.isSelected()) {
                dadosFileIni.getJogador().get(0).getRobo().setArma(dadosFileIni.getArmas().get(1));

            }
            else if(rad3.isSelected()){ 
                dadosFileIni.getJogador().get(0).getRobo().setArma(dadosFileIni.getArmas().get(2));

            }
            else{ 
                dadosFileIni.getJogador().get(0).getRobo().setArma(dadosFileIni.getArmas().get(3));
            }
            JOptionPane.showMessageDialog(this, "Selecionado");
            rad1.setSelected(true);
            rad2.setSelected(false);
            rad3.setSelected(false);
            rad4.setSelected(false);
            i = 1;
            NameLabel.setText(dadosFileIni.getJogador().get(1).getNome());
        }else{
            if(rad1.isSelected()){
                dadosFileIni.getJogador().get(1).getRobo().setArma(dadosFileIni.getArmas().get(0));

            }
            else if(rad2.isSelected()){
                dadosFileIni.getJogador().get(1).getRobo().setArma(dadosFileIni.getArmas().get(1));


            }
            else if(rad3.isSelected()){
                dadosFileIni.getJogador().get(1).getRobo().setArma(dadosFileIni.getArmas().get(2));

            }
            else{ 
                dadosFileIni.getJogador().get(1).getRobo().setArma(dadosFileIni.getArmas().get(3));

            }
            this.setVisible(false);
            try {
                IA jogo = new IA();
                new Campo(dadosFileIni, jogo).setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(SelecaoArma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(SelecaoArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecaoArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecaoArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecaoArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            ConfiguracaoInicial dadosFileIni = new ConfiguracaoInicial();
            public void run() {
                new SelecaoArma(dadosFileIni).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rad1;
    private javax.swing.JRadioButton rad2;
    private javax.swing.JRadioButton rad3;
    private javax.swing.JRadioButton rad4;
    private javax.swing.JTextArea robo1Text;
    private javax.swing.JTextArea robo2Text;
    private javax.swing.JTextArea robo3Text;
    private javax.swing.JTextArea robo4Text;
    // End of variables declaration//GEN-END:variables

 
}
