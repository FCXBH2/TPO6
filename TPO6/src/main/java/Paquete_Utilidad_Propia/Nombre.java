/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Paquete_Utilidad_Propia;

import Paquete_Utilidad_Propia.Clases_Utilidad.Producto;
import com.mycompany.tpo6.Menu_General;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Nombre extends javax.swing.JInternalFrame {
    DefaultTableModel DTM = new DefaultTableModel();
    /**
     * Creates new form Nombre
     */
    public Nombre() {
        initComponents();
        DTM.setColumnIdentifiers(new Object[]{"Codigo","Descripcion","Precio","Stock","Rubro"});
        JTable.setModel(DTM);
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
        JCaracterBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Nombre");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Primeros caracteres");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        JCaracterBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JCaracterBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        JCaracterBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JCaracterBuscarKeyPressed(evt);
            }
        });

        JTable.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock", "Rubro"
            }
        ));
        jScrollPane1.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCaracterBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCaracterBuscar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCaracterBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCaracterBuscarKeyPressed
            if(evt.getKeyCode()==10){
            TreeSet<Producto> TSP = new TreeSet();
            for(int i=0;i<DTM.getRowCount();i++){
                DTM.removeRow(0);
            }
            for(Producto P1: Menu_General.getProductos()){
                if(P1.getDescripcion().length()>=JCaracterBuscar.getText().length()){
                    if(JCaracterBuscar.getText().substring(0,JCaracterBuscar.getText().length()).equals(P1.getDescripcion().substring(0,JCaracterBuscar.getText().length()))){
                        
                        TSP.add(P1);
                     }
                    if(P1.getDescripcion().contains(JCaracterBuscar.getText().substring(0))){
                        
                    }
                 }
            }
            for(Producto P2: TSP){
                DTM.addRow(new Object[]{P2.getCodigo(),P2.getDescripcion(),P2.getPrecio(),P2.getStock(),P2.getRubro()});
            }
        }
    }//GEN-LAST:event_JCaracterBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JCaracterBuscar;
    private javax.swing.JTable JTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
