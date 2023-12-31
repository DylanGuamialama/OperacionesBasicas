
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author guami
 */
public class ComprobacionNumerica extends javax.swing.JFrame {

    /**
     * Creates new form ComprobacionNumerica
     */
    public ComprobacionNumerica() {
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

        txtNumero = new javax.swing.JTextField();
        lblTitutlo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        btnComprobar = new javax.swing.JButton();
        btnComprobar2 = new javax.swing.JButton();
        btnComprobar3 = new javax.swing.JButton();
        btnComprobar4 = new javax.swing.JButton();
        btnComprobar5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitutlo.setText("COMPROBACION");

        lblTexto.setText("Ingrese un numero");

        btnComprobar.setText("COMPROBAR NUMERO PERFECTO");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        btnComprobar2.setText("COMPROBAR NUMERO PRIMO");
        btnComprobar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobar2ActionPerformed(evt);
            }
        });

        btnComprobar3.setText("IMPRIMIR LOS PRIMOS MENORES");
        btnComprobar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobar3ActionPerformed(evt);
            }
        });

        btnComprobar4.setText("SUMATORIA DE LOS PRIMOS MENORES");
        btnComprobar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobar4ActionPerformed(evt);
            }
        });

        btnComprobar5.setText("RAIZ DE LA SUMATORIA DE LOS PRIMOS ANTERIORES");
        btnComprobar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblTitutlo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComprobar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComprobar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComprobar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComprobar5))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComprobar)
                .addGap(18, 18, 18)
                .addComponent(btnComprobar2)
                .addGap(18, 18, 18)
                .addComponent(btnComprobar3)
                .addGap(18, 18, 18)
                .addComponent(btnComprobar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnComprobar5)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        // TODO add your handling code here:
        int numero=Integer.parseInt(txtNumero.getText());
        int i;
        int suma=0;
       for (i = 1; i < numero; i++) {                             
            if (numero % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == numero) {                          
            JOptionPane.showMessageDialog(rootPane, "El numero es perfecto");
        } else {
            JOptionPane.showMessageDialog(rootPane, "El numero no es perfecto");

        }
        
    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnComprobar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobar2ActionPerformed
        // TODO add your handling code here:
        int numero=Integer.parseInt(txtNumero.getText());
        int a=0;
        int i;
        for(i=1;i<(numero+1);i++){
         if(numero%i==0){
             a++;
            }
         }
         if(a!=2){
              JOptionPane.showMessageDialog(rootPane, "El numero no es primo");
            }else{
                JOptionPane.showMessageDialog(rootPane, "El numero es primo");
         }
    }//GEN-LAST:event_btnComprobar2ActionPerformed

    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    private void btnComprobar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobar3ActionPerformed
        // TODO add your handling code here:
        int numero=Integer.parseInt(txtNumero.getText());
         for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                JOptionPane.showMessageDialog(rootPane, i+ " ");
            }
        }
        
        
  
         
         
    }//GEN-LAST:event_btnComprobar3ActionPerformed

    private void btnComprobar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobar4ActionPerformed
        // TODO add your handling code here:
        int numero=Integer.parseInt(txtNumero.getText());
        int sumaPrimos=0;
         for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                sumaPrimos +=i;
            }
        }
         JOptionPane.showMessageDialog(rootPane, "La suma de los numeros primos anteriores es: "+sumaPrimos);
    }//GEN-LAST:event_btnComprobar4ActionPerformed

    private void btnComprobar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobar5ActionPerformed
        // TODO add your handling code here:
        int numero=Integer.parseInt(txtNumero.getText());
        int sumaPrimos=0;
         for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                sumaPrimos +=i;
            }
        }
         Math.sqrt(sumaPrimos);
         JOptionPane.showMessageDialog(rootPane, "La raiz de la suma de los numeros primos anteriores es: "+sumaPrimos);
    }//GEN-LAST:event_btnComprobar5ActionPerformed

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
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobacionNumerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnComprobar2;
    private javax.swing.JButton btnComprobar3;
    private javax.swing.JButton btnComprobar4;
    private javax.swing.JButton btnComprobar5;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
