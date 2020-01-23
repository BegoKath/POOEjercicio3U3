package UI;

import BEU.Curso;
import BEU.Estudiante;
import BLL.GestionCursos;
import BLL.GestionEstudiante;
import BLL.GestionMatricula;
import java.util.List;
import javax.swing.JOptionPane;

public class frmRegistroMatricula extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de Matrícula";
    private GestionCursos cursosBll = new GestionCursos();
    private GestionEstudiante estudianteBll = new GestionEstudiante();
    private GestionMatricula matriculaBll = new GestionMatricula();
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    private boolean Validar() {
        Curso cr = (Curso) this.cmbCurso.getSelectedItem();
        if (cr.getTitulo().equals("--Seleccione--")) {
            vtnPrincipal.verMensaje("Curso no válido", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        Estudiante est = (Estudiante) this.cmbEstudiante.getSelectedItem();
        if (est.getNombre().equals("--Seleccione--")) {
            vtnPrincipal.verMensaje("Estudiante no válido", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void CrearMatricula() throws Exception {

        Curso cr = (Curso) this.cmbCurso.getSelectedItem();
        Estudiante es = (Estudiante) this.cmbEstudiante.getSelectedItem();
        matriculaBll.crear();
        matriculaBll.configurar(cr, es);
        matriculaBll.archivar();

    }

    private void cargarCursos() {
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

    private void leerEstudiantes() {
        try {
            Estudiante ficticio = new Estudiante();
            ficticio.setNombre("--Seleccione--");
            ficticio.setApellido("");
            this.cmbEstudiante.addItem(ficticio);
            estudiantes = estudianteBll.leerEstudiantes();
            estudiantes.forEach((est) -> {
                this.cmbEstudiante.addItem(est);
            });
        } catch (Exception e) {
            vtnPrincipal.verMensaje("Error al leer los estudiantes" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public frmRegistroMatricula() {
        initComponents();
        cargarCursos();
        leerEstudiantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistroMatricula = new javax.swing.JPanel();
        lblEstudiante = new javax.swing.JLabel();
        cmbEstudiante = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        btnGuardarRegistro = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlRegistroMatricula.setBackground(new java.awt.Color(255, 255, 204));
        pnlRegistroMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Matrícula", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        lblEstudiante.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        cmbEstudiante.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        lblCurso.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        lblCurso.setText("Curso:");

        btnGuardarRegistro.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        btnGuardarRegistro.setIcon(new javax.swing.ImageIcon("/home/labctr/NetBeansProjects/Ejercicio3U3/iconos/savetheapplication_guardar_2958.png")); // NOI18N
        btnGuardarRegistro.setText("Guardar");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        cmbCurso.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlRegistroMatriculaLayout = new javax.swing.GroupLayout(pnlRegistroMatricula);
        pnlRegistroMatricula.setLayout(pnlRegistroMatriculaLayout);
        pnlRegistroMatriculaLayout.setHorizontalGroup(
            pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstudiante)
                            .addComponent(lblCurso))
                        .addGap(38, 38, 38)
                        .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEstudiante, 0, 259, Short.MAX_VALUE)
                            .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnGuardarRegistro)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlRegistroMatriculaLayout.setVerticalGroup(
            pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante)
                    .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCurso)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnGuardarRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed

        try {
            if (Validar()) {
                CrearMatricula();
                vtnPrincipal.verMensaje("Matrícula Archivada correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            vtnPrincipal.verMensaje("Error al crear la Matrícula" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JComboBox<Estudiante> cmbEstudiante;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JPanel pnlRegistroMatricula;
    // End of variables declaration//GEN-END:variables
}
