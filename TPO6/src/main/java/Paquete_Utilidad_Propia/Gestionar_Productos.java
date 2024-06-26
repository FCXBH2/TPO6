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
        JEliminar = new javax.swing.JButton();
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

        JRubro.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        JRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        JRubro.setBorder(new javax.swing.border.MatteBorder(null));

        JNuevo.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JNuevo.setText("Cambiar");
        JNuevo.setBorder(new javax.swing.border.MatteBorder(null));
        JNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNuevoActionPerformed(evt);
            }
        });

        JEliminar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JEliminar.setText("Eliminar");
        JEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        JEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEliminarActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(JEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(JBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(JDescripcion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JPrecio)
                                            .addComponent(JRubro, 0, 180, Short.MAX_VALUE)
                                            .addComponent(JStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 68, Short.MAX_VALUE)))))
                        .addGap(93, 93, 93)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(JEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed
        
        if(JBuscar.getText().equals("Buscar")){
            if(JCodigo.getText().isBlank()==false){
                for(Producto P1:Menu_General.getProductos()){
                if(P1.getCodigo()==Integer.parseInt(JCodigo.getText())){
                JDescripcion.setText(P1.getDescripcion());
                JPrecio.setText(""+P1.getPrecio());
                JRubro.setSelectedItem(P1.getRubro());
                JStock.setText(""+P1.getStock());
                break;
                }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe haber algun valor numerico para buscar o agregar el Codigo.");
            }
        } else if (JBuscar.getText().equals("Guardar")){
            try{ //He usado 3 clases que heredan de producto, para poder identificar los rubros, usando instanceof.
                switch((String) JRubro.getSelectedItem()){
                    case ("Comestible"):
                            if(JCodigo.getText().isBlank()==false && JDescripcion.getText().isBlank()==false && JPrecio.getText().isBlank()==false && JStock.getText().isBlank()==false){
                                Producto C1 = new Comestible(Integer.parseInt(JCodigo.getText()),JDescripcion.getText(),Double.parseDouble(JPrecio.getText()),Integer.parseInt(JStock.getText()),(String)JRubro.getSelectedItem());
                                boolean Comprobar=Menu_General.getProductos().add(C1);
                                if(Comprobar==true){
                                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                                } else if (Comprobar==false){
                                    JOptionPane.showMessageDialog(this, "El producto ya esta en el Mercado.");
                                  }
                            } else {
                                if(JCodigo.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Debe haber algun valor numerico para buscar o agregar el Codigo.");
                                }
                                if(JDescripcion.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega una Descripcion.");
                                }
                                if(JPrecio.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega un valor Numerico.");
                                }
                                if(JStock.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega la cantidad de Stock que tiene el Producto.");
                                }
                                
                            }
                        break;
                case ("Limpieza"):
                            if(JCodigo.getText().isBlank()==false && JDescripcion.getText().isBlank()==false && JPrecio.getText().isBlank()==false && JStock.getText().isBlank()==false){
                                Producto C1 = new Limpieza(Integer.parseInt(JCodigo.getText()),JDescripcion.getText(),Double.parseDouble(JPrecio.getText()),Integer.parseInt(JStock.getText()),(String)JRubro.getSelectedItem());
                                boolean Comprobar=Menu_General.getProductos().add(C1);
                                if(Comprobar==true){
                                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                                } else if (Comprobar==false){
                                    JOptionPane.showMessageDialog(this, "El producto ya esta en el Mercado.");
                                  }
                            } else {
                                if(JCodigo.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Debe haber algun valor numerico para buscar o agregar el Codigo.");
                                }
                                if(JDescripcion.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega una Descripcion.");
                                }
                                if(JPrecio.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega un valor Numerico.");
                                }
                                if(JStock.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega la cantidad de Stock que tiene el Producto.");
                                }
                                
                            }
                    break;
                case ("Perfumeria"):
                            if(JCodigo.getText().isBlank()==false && JDescripcion.getText().isBlank()==false && JPrecio.getText().isBlank()==false && JStock.getText().isBlank()==false){
                                Producto C1 = new Perfumeria(Integer.parseInt(JCodigo.getText()),JDescripcion.getText(),Double.parseDouble(JPrecio.getText()),Integer.parseInt(JStock.getText()),(String)JRubro.getSelectedItem());
                                boolean Comprobar=Menu_General.getProductos().add(C1);
                                if(Comprobar==true){
                                    JOptionPane.showMessageDialog(this, "Producto Agregado.");
                                } else if (Comprobar==false){
                                    JOptionPane.showMessageDialog(this, "El producto ya esta en el Mercado.");
                                  }
                            } else {
                                if(JCodigo.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Debe haber algun valor numerico para buscar o agregar el Codigo.");
                                }
                                if(JDescripcion.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega una Descripcion.");
                                }
                                if(JPrecio.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega un valor Numerico.");
                                }
                                if(JStock.getText().isBlank()==true){
                                    JOptionPane.showMessageDialog(this, "Agrega la cantidad de Stock que tiene el Producto.");
                                }
                                
                            }
                            break;
            }
        }catch(NumberFormatException E){ //No recuerdo como hacer focus en un textfield cuando una excepcion(opcional ser excepcion) ocurre en dicho textfield.
            JOptionPane.showMessageDialog(this, "Numero Erroneo.");
            
        }
        }
    }//GEN-LAST:event_JBuscarActionPerformed

    private void JNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNuevoActionPerformed
        if(JBuscar.getText().equals("Buscar")){
            Limpiar();
        } else if(JBuscar.getText().equals("Guardar")){
            Llenar();
        }
    }//GEN-LAST:event_JNuevoActionPerformed

    private void JEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEliminarActionPerformed
        
        if(JCodigo.getText().isBlank()==false){
            for(Producto P1: Menu_General.getProductos()){
                if(P1.getCodigo()==Integer.parseInt(JCodigo.getText())){
                    byte B1=(byte) JOptionPane.showConfirmDialog(this, "¿Eliminar Producto?","Confirmacion",JOptionPane.YES_NO_OPTION);
                    if(B1==JOptionPane.YES_OPTION){
                        Menu_General.getProductos().remove(P1);
                        JOptionPane.showMessageDialog(this, "Producto removido.");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingresar codigo a Buscar.");
        }
    }//GEN-LAST:event_JEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed
    private final void Limpiar(){
        JBuscar.setText("Guardar");
        JDescripcion.setText("");
        JPrecio.setText("");
        JStock.setText("");
        JCodigo.setText("");
        JEliminar.setEnabled(false);
    }
    private final void Llenar(){
        JBuscar.setText("Buscar");
        JDescripcion.setText("");
        JPrecio.setText("");
        JStock.setText("");
        JCodigo.setText("");
        JEliminar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBuscar;
    private javax.swing.JTextField JCodigo;
    private javax.swing.JTextField JDescripcion;
    private javax.swing.JButton JEliminar;
    private javax.swing.JButton JNuevo;
    private javax.swing.JTextField JPrecio;
    private javax.swing.JComboBox<String> JRubro;
    private javax.swing.JTextField JStock;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
