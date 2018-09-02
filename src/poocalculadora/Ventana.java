
package poocalculadora;

public class Ventana extends javax.swing.JFrame {
     Calculadora calcu= new Calculadora();
     CalculadoraT Calcu= new CalculadoraT();
    
    public Ventana() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        c = new javax.swing.JButton();
        seno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setForeground(new java.awt.Color(51, 0, 204));
        jTextField1.setCaretColor(new java.awt.Color(51, 255, 51));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 220, 40));

        B1.setBackground(new java.awt.Color(204, 255, 255));
        B1.setForeground(new java.awt.Color(102, 0, 102));
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, 40));

        B2.setBackground(new java.awt.Color(204, 255, 255));
        B2.setForeground(new java.awt.Color(51, 0, 102));
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 60, 40));

        B5.setBackground(new java.awt.Color(204, 255, 255));
        B5.setForeground(new java.awt.Color(51, 0, 102));
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 60, 40));

        B4.setBackground(new java.awt.Color(204, 255, 255));
        B4.setForeground(new java.awt.Color(51, 0, 102));
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 40));

        B7.setBackground(new java.awt.Color(204, 255, 255));
        B7.setForeground(new java.awt.Color(51, 0, 102));
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 40));

        Igual.setBackground(new java.awt.Color(255, 204, 255));
        Igual.setForeground(new java.awt.Color(204, 0, 204));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        getContentPane().add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 60, 80));

        B9.setBackground(new java.awt.Color(204, 255, 255));
        B9.setForeground(new java.awt.Color(51, 0, 102));
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 60, 40));

        B6.setBackground(new java.awt.Color(204, 255, 255));
        B6.setForeground(new java.awt.Color(51, 0, 102));
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 60, 40));

        B3.setBackground(new java.awt.Color(204, 255, 255));
        B3.setForeground(new java.awt.Color(51, 0, 102));
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 40));

        B0.setBackground(new java.awt.Color(204, 255, 255));
        B0.setForeground(new java.awt.Color(51, 0, 102));
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        getContentPane().add(B0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 40));

        jButton12.setText("1");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        jButton13.setText("1");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        B8.setBackground(new java.awt.Color(204, 255, 255));
        B8.setForeground(new java.awt.Color(51, 0, 102));
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 40));

        Suma.setBackground(new java.awt.Color(255, 204, 255));
        Suma.setForeground(new java.awt.Color(204, 0, 204));
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        getContentPane().add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 60, 40));

        resta.setBackground(new java.awt.Color(255, 204, 255));
        resta.setForeground(new java.awt.Color(204, 0, 204));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        getContentPane().add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 60, 40));

        multiplicacion.setBackground(new java.awt.Color(255, 204, 255));
        multiplicacion.setForeground(new java.awt.Color(204, 0, 204));
        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 40));

        division.setBackground(new java.awt.Color(255, 204, 255));
        division.setForeground(new java.awt.Color(204, 0, 204));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        getContentPane().add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 60, 40));

        c.setBackground(new java.awt.Color(255, 204, 255));
        c.setForeground(new java.awt.Color(204, 0, 204));
        c.setText("c");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 40));

        seno.setText("jButton1");
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });
        getContentPane().add(seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        calcu.agregarNum(1);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B1ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        calcu.agregarNum(7);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B7ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        calcu.agregarNum(2);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        calcu.agregarNum(3);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        calcu.agregarNum(4);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        calcu.agregarNum(5);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
       calcu.agregarNum(6);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B6ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        calcu.agregarNum(8);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        calcu.agregarNum(9);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        calcu.agregarNum(0);
        jTextField1.setText(calcu.getDigito());
    }//GEN-LAST:event_B0ActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
       calcu.suma(jTextField1.getText()); 
       jTextField1.setText("");//limpia el contenido que este en la caja de texto
    }//GEN-LAST:event_SumaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        jTextField1.setText(""+calcu.calculo(jTextField1.getText()));//de esta manera se muestra el resultado en pantalla
   

    }//GEN-LAST:event_IgualActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
         calcu.resta(jTextField1.getText()); 
         jTextField1.setText("");//limpia el contenido que este en la caja de texto
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
         calcu.multiplicacion(jTextField1.getText()); 
       jTextField1.setText("");//limpia el contenido que este en la caja de texto
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
      calcu.division(jTextField1.getText()); 
       jTextField1.setText("");//limpia el contenido que este en la caja de texto
    }//GEN-LAST:event_divisionActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        //borrar
        calcu.Borrar(jTextField1.getText()); 
       jTextField1.setText("");
    }//GEN-LAST:event_cActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
        jTextField1.setText("el seno de :");
        Calcu.seno(jTextField1.getText());
        jTextField1.setText("");
    }//GEN-LAST:event_senoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Suma;
    private javax.swing.JButton c;
    private javax.swing.JButton division;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton resta;
    private javax.swing.JButton seno;
    // End of variables declaration//GEN-END:variables
}
