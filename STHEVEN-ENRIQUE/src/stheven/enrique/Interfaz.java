
package stheven.enrique;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author sthev
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        iniciar();
    }
    
    public void iniciar(){
         labCom1.setText("0");
    labCom2.setText("0");
    labCom3.setText("0");
    labCom4.setText("0");
    labCom5.setText("0");
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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        butFil1 = new javax.swing.JButton();
        labTen1 = new javax.swing.JLabel();
        labTen5 = new javax.swing.JLabel();
        labTen3 = new javax.swing.JLabel();
        butFil2 = new javax.swing.JButton();
        labTen2 = new javax.swing.JLabel();
        labTen4 = new javax.swing.JLabel();
        butFil3 = new javax.swing.JButton();
        butFil4 = new javax.swing.JButton();
        butFil5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAreaProceso = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        labCom4 = new javax.swing.JLabel();
        labCom5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labCom1 = new javax.swing.JLabel();
        labCom2 = new javax.swing.JLabel();
        labCom3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mesa de Filosofos");
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Mesa de Filosfos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Integrantes: Stheven Caruajulca león y Enrique Matencio Flores");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butFil1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFil1.setText("Filosofo1");
        jPanel1.add(butFil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        labTen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTen1.setText("Ten1");
        jPanel1.add(labTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        labTen5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTen5.setText("Ten5");
        jPanel1.add(labTen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        labTen3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTen3.setText("Ten3");
        jPanel1.add(labTen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        butFil2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFil2.setText("Filosofo2");
        jPanel1.add(butFil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        labTen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTen2.setText("Ten2");
        jPanel1.add(labTen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        labTen4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTen4.setText("Ten4");
        jPanel1.add(labTen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        butFil3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFil3.setText("Filosofo3");
        jPanel1.add(butFil3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        butFil4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFil4.setText("Filosofo4");
        jPanel1.add(butFil4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        butFil5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        butFil5.setText("Filosofo5");
        jPanel1.add(butFil5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados/Proceso"));

        tAreaProceso.setColumns(20);
        tAreaProceso.setRows(5);
        tAreaProceso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(tAreaProceso);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Numero de Veces en comer"));

        labCom4.setText("0");

        labCom5.setText("0");

        jLabel5.setText("Filosofo 01");

        jLabel6.setText("Filosofo 02");

        jLabel7.setText("Filosofo 03");

        jLabel8.setText("Filosofo 04");

        jLabel9.setText("Filosofo 05");

        labCom1.setText("0");

        labCom2.setText("0");

        labCom3.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(labCom1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labCom2)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labCom3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labCom4)
                        .addGap(22, 22, 22)))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labCom5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCom1)
                    .addComponent(labCom5)
                    .addComponent(labCom4)
                    .addComponent(labCom3)
                    .addComponent(labCom2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(413, 413, 413)
                                .addComponent(jButton1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         JButton filosofo[];
        filosofo = new JButton[5];
        filosofo[0] = butFil1;
        filosofo[1] = butFil2;
        filosofo[2] = butFil3;
        filosofo[3] = butFil4;
        filosofo[4] = butFil5;
       
        Filosofo com;
        
        JLabel tenedor[];
        tenedor = new JLabel[5];
        tenedor[0] = labTen1;
        tenedor[1] = labTen2;
        tenedor[2] = labTen3;
        tenedor[3] = labTen4;
        tenedor[4] = labTen5;
      
        JLabel resultado[];  
        resultado = new JLabel[5];  
            resultado[0] = labCom1;  
            resultado[1] = labCom2;  
            resultado[2] = labCom3;  
            resultado[3] = labCom4;  
            resultado[4] = labCom5;  
        
        int i, izq, der = 0;

        
        for (i = 0; i < 5; i++) {
          
            izq = i - 1;
           
            if (izq < 0) {
                izq = 4;
            }
            der = i;
            
            com = new Filosofo(i, tenedor[izq], tenedor[der], filosofo[i],resultado[i], tAreaProceso);
                    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFil1;
    private javax.swing.JButton butFil2;
    private javax.swing.JButton butFil3;
    private javax.swing.JButton butFil4;
    private javax.swing.JButton butFil5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCom1;
    private javax.swing.JLabel labCom2;
    private javax.swing.JLabel labCom3;
    private javax.swing.JLabel labCom4;
    private javax.swing.JLabel labCom5;
    private javax.swing.JLabel labTen1;
    private javax.swing.JLabel labTen2;
    private javax.swing.JLabel labTen3;
    private javax.swing.JLabel labTen4;
    private javax.swing.JLabel labTen5;
    private javax.swing.JTextArea tAreaProceso;
    // End of variables declaration//GEN-END:variables
}
