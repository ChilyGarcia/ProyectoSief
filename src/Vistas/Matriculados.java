/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.Metodos;
import Metodos_SQL.ConexionBD;
import Metodos_SQL.MetodosSQL;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aula 103
 */
public class Matriculados extends javax.swing.JFrame {

    /**
     * Creates new form Matriculados
     */
    ImageIcon icon;
    
    public Matriculados() {
        initComponents();
        setLocationRelativeTo(null);
        icon = new ImageIcon("image/icon.jpg");
        setIconImage(icon.getImage());
    }
    
    public void mostrar(String codigo)
    {
        
        String sql = "SELECT  codigo_programa, periodo, nombre_del_programa, matriculados FROM nuevoprograma WHERE codigo_programa = "+codigo ;
        Statement st;
        ConexionBD con = new ConexionBD();
        Connection conexion = con.conectar();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("codigo_programa");
        model.addColumn("periodo");
        model.addColumn("nombre_del_programa");
        model.addColumn("Matriculados");
        
        visor.setModel(model);
        String[] datos = new String[4];
        
        try
        {
            st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                model.addRow(datos);
                
            }
        }catch(SQLException e)
        {
            
        }
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboConsultar = new javax.swing.JComboBox<>();
        btnGraficar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboConsultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "107859 - Tecnico profesional en soporte informatico", "107860 - Tecnologo en desarrollo de software", "107861 - Ingenieria de software", "91390 - Tecnica profesional produccion grafica", "91389 - Tecnologia en diseño publlicitario", "91388 - Profesional en diseño grafico", "104668 - Tecnico proceso diseño de modas", "53509 - Tecnologia en gestion de diseño de modas", "104671 - Profesional en diseño y administracion de modas", " " }));
        comboConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(comboConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnGraficar.setBackground(new java.awt.Color(250, 17, 17));
        btnGraficar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("Graficar");
        btnGraficar.setBorderPainted(false);
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(visor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 586, 213));

        btnRegresar.setBackground(new java.awt.Color(250, 17, 17));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        btnExcel.setBackground(new java.awt.Color(0, 102, 0));
        btnExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setText("Excel");
        btnExcel.setBorderPainted(false);
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/tablasSief.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:
         String lista = comboConsultar.getSelectedItem().toString();
         MetodosSQL metodos = new MetodosSQL();
         
         
         
        if(lista.equals("107859 - Tecnico profesional en soporte informatico"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("107859");
            ventana.lblNombre.setText("matriculados"); 
            ventana.setVisible(true);
            ventana.mostrat();
          
            
        }
        else if(lista.equals("107860 - Tecnologo en desarrollo de software"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("107860");
            ventana.lblNombre.setText("matriculados");         
            ventana.setVisible(true);
            ventana.mostrat();
         
        }
        else if(lista.equals("107861 - Ingenieria de software"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("107861");
            ventana.lblNombre.setText("matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
        else if(lista.equals("91390 - Tecnica profesional produccion grafica"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("91390");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
        else if(lista.equals("91389 - Tecnologia en diseño publlicitario"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("91389");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
        else if(lista.equals("91388 - Profesional en diseño grafico"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("91388");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
        else if(lista.equals("104668 - Tecnico proceso diseño de modas"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("104668");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
           
        }
        else if(lista.equals("53509 - Tecnologia en gestion de diseño de modas"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("53509");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
        else if(lista.equals("104671 - Profesional en diseño y administracion de modas"))
        {
            graficaTablas ventana = new graficaTablas();
            ventana.lblCambio.setText("104671");
            ventana.lblNombre.setText("Matriculados");
            ventana.setVisible(true);
            ventana.mostrat();
            
        }
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void comboConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConsultarActionPerformed
        // TODO add your handling code here:
        
        String lista = comboConsultar.getSelectedItem().toString();
        
        if(lista.equals("107859 - Tecnico profesional en soporte informatico"))
        {
            mostrar("107859");
        }
        else if(lista.equals("107860 - Tecnologo en desarrollo de software"))
        {
            mostrar("107860");
        }
        else if(lista.equals("107861 - Ingenieria de software"))
        {
            mostrar("107861");
        }
        else if(lista.equals("91390 - Tecnica profesional produccion grafica"))
        {
            mostrar("91390");
        }
        else if(lista.equals("91389 - Tecnologia en diseño publlicitario"))
        {
            mostrar("91389");
        }
        else if(lista.equals("91388 - Profesional en diseño grafico"))
        {
            mostrar("91388");
        }
        else if(lista.equals("104668 - Tecnico proceso diseño de modas"))
        {
            mostrar("104668");
        }
        else if(lista.equals("53509 - Tecnologia en gestion de diseño de modas"))
        {
            mostrar("53509");
        }
        else if(lista.equals("104671 - Profesional en diseño y administracion de modas"))
        {
            mostrar("104671");
        }
    }//GEN-LAST:event_comboConsultarActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        
        Metodos obj;

        try {
            obj = new Metodos();
            obj.exportarExcel(visor);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExcelActionPerformed

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
            java.util.logging.Logger.getLogger(Matriculados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriculados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriculados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriculados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriculados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
