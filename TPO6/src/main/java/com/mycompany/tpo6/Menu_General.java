/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tpo6;
import Paquete_Utilidad_Propia.Clases_Utilidad.Producto;
import Paquete_Utilidad_Propia.Gestionar_Productos;
import Paquete_Utilidad_Propia.Nombre;
import Paquete_Utilidad_Propia.Precio;
import Paquete_Utilidad_Propia.Rubro;
import java.util.TreeSet;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Menu_General extends javax.swing.JFrame {
    private static final TreeSet<Producto> Productos = new TreeSet();
    /**
     * Creates new form Menu_General
     */
    public Menu_General() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administracion = new javax.swing.JMenu();
        JProductos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Consultas = new javax.swing.JMenu();
        JRubro = new javax.swing.JMenuItem();
        JNombre = new javax.swing.JMenuItem();
        JPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        Escritorio.setMaximumSize(new java.awt.Dimension(800, 574));
        Escritorio.setMinimumSize(new java.awt.Dimension(800, 574));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        Administracion.setText("Administracion");
        Administracion.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        Administracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JProductos.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JProductos.setText("Productos");
        JProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JProductosActionPerformed(evt);
            }
        });
        Administracion.add(JProductos);

        jMenuBar1.add(Administracion);

        jMenu1.setEnabled(false);
        jMenu1.setFocusable(false);
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 6));
        jMenuBar1.add(jMenu1);

        Consultas.setText("Consultas");
        Consultas.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N

        JRubro.setText("Por Rubro");
        JRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRubroActionPerformed(evt);
            }
        });
        Consultas.add(JRubro);

        JNombre.setText("Por Nombre");
        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });
        Consultas.add(JNombre);

        JPrecio.setText("Por Precio");
        JPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPrecioActionPerformed(evt);
            }
        });
        Consultas.add(JPrecio);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JProductosActionPerformed
            Gestionar_Productos Gestionar_Producto = new Gestionar_Productos();
            Escritorio.removeAll();
            Escritorio.repaint();
            Gestionar_Producto.setVisible(true);
            Escritorio.add(Gestionar_Producto);
    }//GEN-LAST:event_JProductosActionPerformed

    private void JRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRubroActionPerformed
            Rubro R1 = new Rubro();
            Escritorio.removeAll();
            Escritorio.repaint();
            R1.setVisible(true);
            Escritorio.add(R1);
    }//GEN-LAST:event_JRubroActionPerformed

    private void JNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNombreActionPerformed
        Nombre N1 = new Nombre();
        Escritorio.removeAll();
        Escritorio.repaint();
        N1.setVisible(true);
        Escritorio.add(N1);
    }//GEN-LAST:event_JNombreActionPerformed

    private void JPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPrecioActionPerformed
        Precio P1 = new Precio();
        Escritorio.removeAll();
        Escritorio.repaint();
        P1.setVisible(true);
        Escritorio.add(P1);
    }//GEN-LAST:event_JPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_General().setVisible(true);
            }
        });
    }
    public static TreeSet<Producto> getProductos() {
        return Productos;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenu Consultas;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem JNombre;
    private javax.swing.JMenuItem JPrecio;
    private javax.swing.JMenuItem JProductos;
    private javax.swing.JMenuItem JRubro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
