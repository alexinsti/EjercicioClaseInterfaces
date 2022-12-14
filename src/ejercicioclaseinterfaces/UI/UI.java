/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicioclaseinterfaces.UI;

import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author damm
 */



public class UI extends javax.swing.JFrame {
    public Color colorActual=new Color(255,0,0);
    

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        jLabelColor.setOpaque(true);
        actualizaColor();
        habilitaComponentesColor(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxColores = new javax.swing.JComboBox<>();
        jPanelMuestra = new javax.swing.JPanel();
        jLabelColor = new javax.swing.JLabel();
        jPanelComponentes = new javax.swing.JPanel();
        jLabelSpinnerRojo = new javax.swing.JLabel();
        jSpinnerRojo = new javax.swing.JSpinner();
        jSpinnerVerde = new javax.swing.JSpinner();
        jLabelSpinnerVerde = new javax.swing.JLabel();
        jLabelSpinnerAzul = new javax.swing.JLabel();
        jSpinnerAzul = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Verde", "Azul", "Personalizado" }));
        jComboBoxColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxColoresActionPerformed(evt);
            }
        });

        jPanelMuestra.setBorder(javax.swing.BorderFactory.createTitledBorder("Muestra color"));
        jPanelMuestra.setLayout(new java.awt.BorderLayout());
        jPanelMuestra.add(jLabelColor, java.awt.BorderLayout.CENTER);

        jPanelComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Componentes"));

        jLabelSpinnerRojo.setText("Rojo");

        jSpinnerRojo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerRojoStateChanged(evt);
            }
        });

        jSpinnerVerde.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerVerdeStateChanged(evt);
            }
        });

        jLabelSpinnerVerde.setText("Verde");

        jLabelSpinnerAzul.setText("Azul");

        jSpinnerAzul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelComponentesLayout = new javax.swing.GroupLayout(jPanelComponentes);
        jPanelComponentes.setLayout(jPanelComponentesLayout);
        jPanelComponentesLayout.setHorizontalGroup(
            jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComponentesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSpinnerVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSpinnerRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSpinnerAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanelComponentesLayout.setVerticalGroup(
            jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComponentesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSpinnerRojo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSpinnerVerde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSpinnerAzul)
                    .addComponent(jSpinnerAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBoxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanelMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxColoresActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Color: "+ jComboBoxColores.getSelectedItem().toString());
        jLabelColor.setOpaque(true);
        switch(jComboBoxColores.getSelectedItem().toString()){
            case "Rojo":
                colorActual=Color.red;
                habilitaComponentesColor(false);
                jSpinnerRojo.setValue(Integer.valueOf("255"));
                jSpinnerVerde.setValue(Integer.valueOf("0"));
                jSpinnerAzul.setValue(Integer.valueOf("0"));
                //Settear rojo a 255
                break;
            
            case "Verde":
                colorActual=Color.green;
                habilitaComponentesColor(false);
                jSpinnerRojo.setValue(Integer.valueOf("0"));
                jSpinnerVerde.setValue(Integer.valueOf("255"));
                jSpinnerAzul.setValue(Integer.valueOf("0"));
                //Settear rojo a 255
                break;
            
            case"Azul":
                colorActual=Color.blue;
                habilitaComponentesColor(false);
                jSpinnerRojo.setValue(Integer.valueOf("0"));
                jSpinnerVerde.setValue(Integer.valueOf("0"));
                jSpinnerAzul.setValue(Integer.valueOf("255"));
                //Settear rojo a 255
                break;
            case "Personalizado":
                habilitaComponentesColor(true);
                break;
        }
        
        actualizaColor();
        
    }//GEN-LAST:event_jComboBoxColoresActionPerformed

    private void jSpinnerRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerRojoStateChanged
        // TODO add your handling code here:
        personalizaColor();
    }//GEN-LAST:event_jSpinnerRojoStateChanged

    private void jSpinnerVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerVerdeStateChanged
        // TODO add your handling code here:
        personalizaColor();
    }//GEN-LAST:event_jSpinnerVerdeStateChanged

    private void jSpinnerAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAzulStateChanged
        // TODO add your handling code here:
        personalizaColor();
    }//GEN-LAST:event_jSpinnerAzulStateChanged

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    public void actualizaColor(){
        jLabelColor.setBackground(colorActual);
    }
    
    public void personalizaColor(){
        int r=(int)jSpinnerRojo.getValue();
        int g=(int)jSpinnerVerde.getValue();
        int b=(int)jSpinnerAzul.getValue();
        
        colorActual= new Color(r,g,b);
        actualizaColor();
    }
    
    public void habilitaComponentesColor(Boolean b){
        for(Component c : jPanelComponentes.getComponents()){
            c.setEnabled(b);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxColores;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelSpinnerAzul;
    private javax.swing.JLabel jLabelSpinnerRojo;
    private javax.swing.JLabel jLabelSpinnerVerde;
    private javax.swing.JPanel jPanelComponentes;
    private javax.swing.JPanel jPanelMuestra;
    private javax.swing.JSpinner jSpinnerAzul;
    private javax.swing.JSpinner jSpinnerRojo;
    private javax.swing.JSpinner jSpinnerVerde;
    // End of variables declaration//GEN-END:variables
}
