/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCursos;
import BLL.GestionMatricula;
import Cardenas.Util;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReporteCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Reporte de Calificaciones";
    private GestionCursos cursosBll = new GestionCursos();
    private GestionMatricula matriculaBll = new GestionMatricula();
    private List<Curso> cursos;
    private List<Matricula> calificaciones;
    private final DefaultTableModel dtmCalificaciones = new DefaultTableModel();

    private void buscarMatriculas() throws Exception {
        Curso seleccionado = (Curso) this.cmbCurso.getSelectedItem();
        calificaciones = matriculaBll.reportar(seleccionado.getTitulo());
        mostrarCalificaciones();
    }

    private void mostrarCalificaciones() {
        for (int i = dtmCalificaciones.getRowCount() - 1; i >= 0; i--) {
            this.dtmCalificaciones.removeRow(i);
        }

        for (Matricula m : calificaciones) {
            Vector fila = new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());
            this.dtmCalificaciones.addRow(fila);
        }
        this.tblCalificaciones.setModel(dtmCalificaciones);
    }

    private void configurarModeloTabla() {
        String[] columnas = {"Nombre", "Promedio", "Estado"};
        this.dtmCalificaciones.setColumnIdentifiers(columnas);
        this.tblCalificaciones.setModel(dtmCalificaciones);

    }

    private void leerCursos() {
        try {
            Curso ficticio = new Curso();
            ficticio.setTitulo("--Seleccione--");
            this.cmbCurso.addItem(ficticio);
            cursos = cursosBll.getCursos();
            //Expresion Lambda

            cursos.forEach((c) -> {
                this.cmbCurso.addItem(c);
            });

        } catch (Exception e) {
            vtnPrincipal.verMensaje("Error al leer los cursos" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public frmReporteCalificaciones() {
        initComponents();
        this.leerCursos();
        this.configurarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        lblCurso = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalificaciones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Calificaciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de Calificaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Schoolbook L", 1, 24))); // NOI18N

        lblCurso.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        lblCurso.setText("Curso:");

        cmbCurso.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/iconfinder_system-search_118797.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblCalificaciones.setBackground(new java.awt.Color(255, 204, 102));
        tblCalificaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        tblCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCalificaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(btnBuscar)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            buscarMatriculas();
        } catch (Exception e) {
            vtnPrincipal.verMensaje("Error al buscar la curso" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JTable tblCalificaciones;
    // End of variables declaration//GEN-END:variables
}
