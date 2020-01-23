package UI;

import BEU.Estudiante;
import BLL.GestionEstudiante;
import Cardenas.Util;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class frmRegistroEstudiante extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de Estudiante";
    private GestionEstudiante estudianteBll = new GestionEstudiante();

    private void iniciarListado() throws Exception {
        estudianteBll.leerEstudiantes();
    }
    private String verificarClub(JCheckBox chk){
       if(chk.isSelected()){
           return chk.getText();
       } 
       return "";
    }
    private void CrearEstudiante(){
        Estudiante nuevo= new Estudiante();
        nuevo.setCedula(this.txtCedula.getText());
        nuevo.setNombre(this.txtNombres.getText());
        nuevo.setApellido(this.txtApellidos.getText());
        nuevo.setCarrera(this.cmbCarrera.getSelectedItem().toString());
        nuevo.addClub(this.verificarClub(chkAndinismo));
        nuevo.addClub(this.verificarClub(chkArtes));
        nuevo.addClub(this.verificarClub(chkDanza));
        nuevo.addClub(this.verificarClub(chkMusica));
        nuevo.addClub(this.verificarClub(chkRobotica));
        nuevo.addClub(this.verificarClub(chkfutbol));
        nuevo.addClub(this.verificarClub(chksoftware));
        nuevo.addClub(this.verificarClub(chktenis ));
        
        
        estudianteBll.getEstudiantes().add(nuevo);
    }
    private void Archivar() throws Exception{
        estudianteBll.archivar();
    }
    public frmRegistroEstudiante() throws Exception {
        initComponents();
        try {
            iniciarListado();
        } catch (Exception e) {
            Util.imprimir(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        chkDanza = new javax.swing.JCheckBox();
        chkRobotica = new javax.swing.JCheckBox();
        chkMusica = new javax.swing.JCheckBox();
        chkAndinismo = new javax.swing.JCheckBox();
        chkfutbol = new javax.swing.JCheckBox();
        chksoftware = new javax.swing.JCheckBox();
        chktenis = new javax.swing.JCheckBox();
        chkArtes = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Estudiantes");

        pnlDatos.setBackground(new java.awt.Color(204, 204, 255));
        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Estudiantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Schoolbook L", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        jLabel1.setText("Datos Personales:");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel2.setText("Cédula:");

        txtCedula.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        txtNombres.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel4.setText("Apellidos:");

        txtApellidos.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        jLabel5.setText("Datos extracurriculares:");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel6.setText("Carrera:");

        cmbCarrera.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Software", "Ingeniería Electromecánica", "Ingeniería Automotriz", "Ingeniería Aeronautica" }));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        jLabel7.setText("Datos académicos:");

        chkDanza.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkDanza.setText("Club de danza");

        chkRobotica.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkRobotica.setText("Club de robótica");

        chkMusica.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkMusica.setText("Club de música");
        chkMusica.setToolTipText("");

        chkAndinismo.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkAndinismo.setText("Club de andinismo");
        chkAndinismo.setToolTipText("");

        chkfutbol.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkfutbol.setText("Club de fútbol");
        chkfutbol.setToolTipText("");

        chksoftware.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chksoftware.setText("Club de software");
        chksoftware.setToolTipText("");

        chktenis.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chktenis.setText("Club de tenis");
        chktenis.setToolTipText("");

        chkArtes.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        chkArtes.setText("Club de artes plásticas");
        chkArtes.setToolTipText("");

        btnGuardar.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("/home/labctr/NetBeansProjects/Ejercicio3U3/iconos/iconfinder_system-search_118797.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRobotica)
                    .addComponent(chkDanza)
                    .addComponent(chkAndinismo)
                    .addComponent(chkMusica))
                .addGap(65, 65, 65)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkArtes)
                    .addComponent(chktenis)
                    .addComponent(chksoftware)
                    .addComponent(chkfutbol))
                .addGap(63, 63, 63))
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))))
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(41, 41, 41)
                                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDatosLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel7)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDanza)
                    .addComponent(chksoftware))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRobotica)
                    .addComponent(chkfutbol))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAndinismo)
                    .addComponent(chktenis))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMusica)
                    .addComponent(chkArtes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDatosLayout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(jLabel7)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            CrearEstudiante();
            Archivar();
            vtnPrincipal.verMensaje("Estudiante agregado correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            vtnPrincipal.verMensaje("Error al guardar el estudiante" + e.toString(),titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkAndinismo;
    private javax.swing.JCheckBox chkArtes;
    private javax.swing.JCheckBox chkDanza;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkRobotica;
    private javax.swing.JCheckBox chkfutbol;
    private javax.swing.JCheckBox chksoftware;
    private javax.swing.JCheckBox chktenis;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
