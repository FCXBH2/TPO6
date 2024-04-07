/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Paquete_Utilidad_Propia;

import Paquete_Utilidad_Propia.Clases_Utilidad.Comestible;
import Paquete_Utilidad_Propia.Clases_Utilidad.Limpieza;
import Paquete_Utilidad_Propia.Clases_Utilidad.Perfumeria;
import Paquete_Utilidad_Propia.Clases_Utilidad.Producto;
import com.mycompany.tpo6.Menu_General;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Gestionar_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestionar_Productos
     */
    public Gestionar_Productos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCodigo = new javax.swing.JTextField();
        JBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JStock = new javax.swing.JTextField();
        JRubro = new javax.swing.JComboBox<>();
        JNuevo = new javax.swing.JButton();
        JGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setMaximumSize(new java.awt.Dimension(665, 538));
        setMinimumSize(new java.awt.Dimension(665, 538));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Productos");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        JCodigo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JCodigo.setBorder(new javax.swing.border.MatteBorder(null));

        JBuscar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JBuscar.setText("Buscar");
        JBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        JBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Descripcion");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        JDescripcion.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDescripcion.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        JPrecio.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPrecio.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rubro");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Stock");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        JStock.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JStock.setBorder(new javax.swing.border.MatteBorder(null));

        JRubro.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumería" }));
        JRubro.setBorder(new javax.swing.border.MatteBorder(null));

        JNuevo.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JNuevo.setText("Nuevo");
        JNuevo.setBorder(new javax.swing.border.MatteBorder(null));
        JNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNuevoActionPerformed(evt);
            }
        });

        JGuardar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JGuardar.setText("Guardar");
        JGuardar.setBorder(new javax.swing.border.MatteBorder(null));
        JGuardar.setEnabled(false);
        JGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGuardarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));

        jButton5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JDescripcion)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JPrecio)
                                                .addComponent(JRubro, 0, 180, Short.MAX_VALUE)
                                                .addComponent(JStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(JCodigo)
                    .addComponent(JBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(JDescripcion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(JPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(JRubro, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(JStock))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed
        
        if(JBuscar.getText().equals("Buscar")){
            for(Producto P1:Menu_General.getProductos()){
            if(P1.getCodigo()==Integer.valueOf(JCodigo.getText())){
                JDescripcion.setText(P1.getDescripcion());
                JPrecio.setText(""+P1.getPrecio());
                JRubro.setSelectedItem(P1.getRubro());
                JStock.setText(""+P1.getStock());
                break;
            }
            }
        }
    }//GEN-LAST:event_JBuscarActionPerformed

    private void JNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNuevoActionPerformed
        if(JBuscar.getText().equals("Buscar")){
            JBuscar.setText("Agregar");
            JDescripcion.setText("");
            JPrecio.setText("");
            JStock.setText("");
            JBuscar.setEnabled(false);
            JGuardar.setEnabled(true);
            JNuevo.setText("Busqueda");
        } else if(JBuscar.getText().equals("Agregar")){
            JBuscar.setText("Buscar");
            JDescripcion.setText("");
            JPrecio.setText("");
            JStock.setText("");
            JGuardar.setEnabled(false);
            JBuscar.setEnabled(true);
            JNuevo.setText("Nuevo");
        }
        
    }//GEN-LAST:event_JNuevoActionPerformed

    private void JGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGuardarActionPerformed
        
        
        switch((String) JRubro.getSelectedItem()){
                case ("Comestible"):
                    Producto C1 = new Comestible(Integer.valueOf(JCodigo.getText()),JDescripcion.getText(),Double.valueOf(JPrecio.getText()),Integer.valueOf(JStock.getText()),(String)JRubro.getSelectedItem());
                    Menu_General.getProductos().add(C1);
                    for(Producto P2: Menu_General.getProductos()){
                    if(P2 instanceof Comestible){
                    Menu_General.getC().add((Comestible) P2);
                    }
                    if(P2 instanceof Limpieza){
                    Menu_General.getL().add((Limpieza) P2);
                    }
                    if(P2 instanceof Perfumeria){
                    Menu_General.getP().add((Perfumeria) P2);
                    }
                    }
                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                    break;
                case ("Limpieza"):
                    C1 = new Limpieza(Integer.valueOf(JCodigo.getText()),JDescripcion.getText(),Double.valueOf(JPrecio.getText()),Integer.valueOf(JStock.getText()),(String)JRubro.getSelectedItem());
                    Menu_General.getProductos().add(C1);
                    for(Producto P2: Menu_General.getProductos()){
                    if(P2 instanceof Comestible){
                    Menu_General.getC().add((Comestible) P2);
                    }
                    if(P2 instanceof Limpieza){
                    Menu_General.getL().add((Limpieza) P2);
                    }
                    if(P2 instanceof Perfumeria){
                    Menu_General.getP().add((Perfumeria) P2);
                    }
                    }
                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                    break;
                case ("Perfumeria"):
                    C1 = new Perfumeria(Integer.valueOf(JCodigo.getText()),JDescripcion.getText(),Double.valueOf(JPrecio.getText()),Integer.valueOf(JStock.getText()),(String)JRubro.getSelectedItem());
                    Menu_General.getProductos().add(C1);
                    for(Producto P2: Menu_General.getProductos()){
                    if(P2 instanceof Comestible){
                    Menu_General.getC().add((Comestible) P2);
                    }
                    if(P2 instanceof Limpieza){
                    Menu_General.getL().add((Limpieza) P2);
                    }
                    if(P2 instanceof Perfumeria){
                    Menu_General.getP().add((Perfumeria) P2);
                    }
                    }
                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                    break;
            }
        
        
    }//GEN-LAST:event_JGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBuscar;
    private javax.swing.JTextField JCodigo;
    private javax.swing.JTextField JDescripcion;
    private javax.swing.JButton JGuardar;
    private javax.swing.JButton JNuevo;
    private javax.swing.JTextField JPrecio;
    private javax.swing.JComboBox<String> JRubro;
    private javax.swing.JTextField JStock;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
