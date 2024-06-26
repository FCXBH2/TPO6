/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Paquete_Utilidad_Propia;

import Paquete_Utilidad_Propia.Clases_Utilidad.Producto;
import com.mycompany.tpo6.Menu_General;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Precio extends javax.swing.JInternalFrame {
    DefaultTableModel T1 = new DefaultTableModel();
    /**
     * Creates new form Precio
     */
    public Precio() {
        initComponents();
        T1.setColumnIdentifiers(new Object[]{"Codigo","Descripcion","Precio","Stock","Rubro"});
        for(Producto P:Menu_General.getProductos()){
            T1.addRow(new Object[]{P.getCodigo(),P.getDescripcion(),P.getPrecio(),P.getStock(),P.getRubro()});
        }
        JTablet.setModel(T1);
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
        JPrecio_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JPrecio_2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablet = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Precio");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precio Entre:");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        JPrecio_1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JPrecio_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPrecio_1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Y");

        JPrecio_2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JPrecio_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPrecio_2.setBorder(new javax.swing.border.MatteBorder(null));

        JTablet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTablet);

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPrecio_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPrecio_2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(JPrecio_1)
                    .addComponent(JPrecio_2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i=T1.getRowCount()-1;i>=0;i--) {
                    T1.removeRow(i);
                }
        for(Producto P1:Menu_General.getProductos()){
            if(P1.getPrecio()>=Double.parseDouble(JPrecio_1.getText()) && P1.getPrecio()<=Double.parseDouble(JPrecio_2.getText())){
                T1.addRow(new Object[]{P1.getCodigo(),P1.getDescripcion(),P1.getDescripcion(),P1.getPrecio(),P1.getStock(),P1.getStock()});
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JPrecio_1;
    private javax.swing.JTextField JPrecio_2;
    private javax.swing.JTable JTablet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
