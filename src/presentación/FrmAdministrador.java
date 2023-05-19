package presentación;

import lógica.BLPeriodosAcademicos;

public class FrmAdministrador extends javax.swing.JFrame {

    public FrmAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        habilitarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lblPeriodoAcademico = new javax.swing.JLabel();
        panelPeriodoAcademico = new javax.swing.JPanel();
        btnRegistroPeriodoAcademico = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        panelRegistroButtons = new javax.swing.JPanel();
        btnRegistroEstudiante = new javax.swing.JButton();
        btnRegistroAsignatura = new javax.swing.JButton();
        iconDocument = new javax.swing.JLabel();
        panelListado = new javax.swing.JPanel();
        lblListado = new javax.swing.JLabel();
        panelListadoButtons = new javax.swing.JPanel();
        btnListaEstudiantes = new javax.swing.JButton();
        btnListaAsignaturas = new javax.swing.JButton();
        icoFolder = new javax.swing.JLabel();
        panelMatriculas = new javax.swing.JPanel();
        lblMatriculas = new javax.swing.JLabel();
        panelMatriculasButtons = new javax.swing.JPanel();
        btnListaMatriculas = new javax.swing.JButton();
        btnRegistroNotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(33, 42, 62));
        panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 30));

        panelTitle.setBackground(new java.awt.Color(57, 72, 103));
        panelTitle.setPreferredSize(new java.awt.Dimension(940, 90));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        title.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("UNIVERSIDAD NACIONAL DE TRUJILLO");
        panelTitle.add(title);

        lblPeriodoAcademico.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPeriodoAcademico.setForeground(java.awt.Color.white);
        lblPeriodoAcademico.setText("Periodo Académico: SIN REGISTRAR");
        panelTitle.add(lblPeriodoAcademico);

        panel.add(panelTitle);

        panelPeriodoAcademico.setBackground(new java.awt.Color(57, 72, 103));
        panelPeriodoAcademico.setPreferredSize(new java.awt.Dimension(940, 50));
        panelPeriodoAcademico.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 10));

        btnRegistroPeriodoAcademico.setBackground(new java.awt.Color(155, 164, 181));
        btnRegistroPeriodoAcademico.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroPeriodoAcademico.setForeground(new java.awt.Color(33, 42, 62));
        btnRegistroPeriodoAcademico.setText("Registrar Periodo Académico");
        btnRegistroPeriodoAcademico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroPeriodoAcademico.setPreferredSize(new java.awt.Dimension(254, 30));
        btnRegistroPeriodoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPeriodoAcademicoActionPerformed(evt);
            }
        });
        panelPeriodoAcademico.add(btnRegistroPeriodoAcademico);

        panel.add(panelPeriodoAcademico);

        panelRegistro.setBackground(new java.awt.Color(57, 72, 103));
        panelRegistro.setPreferredSize(new java.awt.Dimension(310, 200));
        panelRegistro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblRegistro.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblRegistro.setForeground(java.awt.Color.white);
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("REGISTRO");
        lblRegistro.setPreferredSize(new java.awt.Dimension(310, 60));
        panelRegistro.add(lblRegistro);

        panelRegistroButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelRegistroButtons.setPreferredSize(new java.awt.Dimension(160, 140));
        panelRegistroButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 25));

        btnRegistroEstudiante.setBackground(new java.awt.Color(155, 164, 181));
        btnRegistroEstudiante.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroEstudiante.setForeground(new java.awt.Color(33, 42, 62));
        btnRegistroEstudiante.setText("Estudiante");
        btnRegistroEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroEstudiante.setPreferredSize(new java.awt.Dimension(110, 30));
        btnRegistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEstudianteActionPerformed(evt);
            }
        });
        panelRegistroButtons.add(btnRegistroEstudiante);

        btnRegistroAsignatura.setBackground(new java.awt.Color(155, 164, 181));
        btnRegistroAsignatura.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroAsignatura.setForeground(new java.awt.Color(33, 42, 62));
        btnRegistroAsignatura.setText("Asignatura");
        btnRegistroAsignatura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroAsignatura.setPreferredSize(new java.awt.Dimension(110, 30));
        btnRegistroAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAsignaturaActionPerformed(evt);
            }
        });
        panelRegistroButtons.add(btnRegistroAsignatura);

        panelRegistro.add(panelRegistroButtons);

        iconDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentación/iconos/document.png"))); // NOI18N
        iconDocument.setPreferredSize(new java.awt.Dimension(150, 140));
        panelRegistro.add(iconDocument);

        panel.add(panelRegistro);

        panelListado.setBackground(new java.awt.Color(57, 72, 103));
        panelListado.setPreferredSize(new java.awt.Dimension(310, 200));
        panelListado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblListado.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblListado.setForeground(java.awt.Color.white);
        lblListado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListado.setText("LISTADO");
        lblListado.setPreferredSize(new java.awt.Dimension(310, 60));
        panelListado.add(lblListado);

        panelListadoButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelListadoButtons.setPreferredSize(new java.awt.Dimension(160, 140));
        panelListadoButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 25));

        btnListaEstudiantes.setBackground(new java.awt.Color(155, 164, 181));
        btnListaEstudiantes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnListaEstudiantes.setForeground(new java.awt.Color(33, 42, 62));
        btnListaEstudiantes.setText("Estudiantes");
        btnListaEstudiantes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListaEstudiantes.setPreferredSize(new java.awt.Dimension(115, 30));
        btnListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEstudiantesActionPerformed(evt);
            }
        });
        panelListadoButtons.add(btnListaEstudiantes);

        btnListaAsignaturas.setBackground(new java.awt.Color(155, 164, 181));
        btnListaAsignaturas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnListaAsignaturas.setForeground(new java.awt.Color(33, 42, 62));
        btnListaAsignaturas.setText("Asignaturas");
        btnListaAsignaturas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListaAsignaturas.setPreferredSize(new java.awt.Dimension(115, 30));
        btnListaAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAsignaturasActionPerformed(evt);
            }
        });
        panelListadoButtons.add(btnListaAsignaturas);

        panelListado.add(panelListadoButtons);

        icoFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentación/iconos/folder.png"))); // NOI18N
        icoFolder.setPreferredSize(new java.awt.Dimension(150, 140));
        panelListado.add(icoFolder);

        panel.add(panelListado);

        panelMatriculas.setBackground(new java.awt.Color(57, 72, 103));
        panelMatriculas.setPreferredSize(new java.awt.Dimension(260, 200));
        panelMatriculas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblMatriculas.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblMatriculas.setForeground(java.awt.Color.white);
        lblMatriculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMatriculas.setText("MATRÍCULAS");
        lblMatriculas.setPreferredSize(new java.awt.Dimension(310, 60));
        panelMatriculas.add(lblMatriculas);

        panelMatriculasButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelMatriculasButtons.setPreferredSize(new java.awt.Dimension(260, 140));
        panelMatriculasButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 25));

        btnListaMatriculas.setBackground(new java.awt.Color(155, 164, 181));
        btnListaMatriculas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnListaMatriculas.setForeground(new java.awt.Color(33, 42, 62));
        btnListaMatriculas.setText("Lista de matrículas");
        btnListaMatriculas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListaMatriculas.setPreferredSize(new java.awt.Dimension(175, 30));
        btnListaMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaMatriculasActionPerformed(evt);
            }
        });
        panelMatriculasButtons.add(btnListaMatriculas);

        btnRegistroNotas.setBackground(new java.awt.Color(155, 164, 181));
        btnRegistroNotas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroNotas.setForeground(new java.awt.Color(33, 42, 62));
        btnRegistroNotas.setText("Registrar notas");
        btnRegistroNotas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroNotas.setEnabled(false);
        btnRegistroNotas.setPreferredSize(new java.awt.Dimension(175, 30));
        panelMatriculasButtons.add(btnRegistroNotas);

        panelMatriculas.add(panelMatriculasButtons);

        panel.add(panelMatriculas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEstudianteActionPerformed
        new FrmRegistroEstudiante(this).setVisible(true);
    }//GEN-LAST:event_btnRegistroEstudianteActionPerformed

    private void btnListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEstudiantesActionPerformed
        new FrmListaEstudiantes(this).setVisible(true);
    }//GEN-LAST:event_btnListaEstudiantesActionPerformed

    private void btnListaMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaMatriculasActionPerformed
        new FrmListaMatriculas(this).setVisible(true);
    }//GEN-LAST:event_btnListaMatriculasActionPerformed

    private void btnRegistroPeriodoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPeriodoAcademicoActionPerformed
        new FrmRegistroPeriodoAcademico(this).setVisible(true);
    }//GEN-LAST:event_btnRegistroPeriodoAcademicoActionPerformed

    private void btnRegistroAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAsignaturaActionPerformed
        new FrmRegistroAsignatura(this).setVisible(true);
    }//GEN-LAST:event_btnRegistroAsignaturaActionPerformed

    private void btnListaAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAsignaturasActionPerformed
        new FrmListaAsignaturas(this).setVisible(true);
    }//GEN-LAST:event_btnListaAsignaturasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaAsignaturas;
    private javax.swing.JButton btnListaEstudiantes;
    private javax.swing.JButton btnListaMatriculas;
    private javax.swing.JButton btnRegistroAsignatura;
    private javax.swing.JButton btnRegistroEstudiante;
    private javax.swing.JButton btnRegistroNotas;
    private javax.swing.JButton btnRegistroPeriodoAcademico;
    private javax.swing.JLabel icoFolder;
    private javax.swing.JLabel iconDocument;
    private javax.swing.JLabel lblListado;
    private javax.swing.JLabel lblMatriculas;
    private javax.swing.JLabel lblPeriodoAcademico;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelListado;
    private javax.swing.JPanel panelListadoButtons;
    private javax.swing.JPanel panelMatriculas;
    private javax.swing.JPanel panelMatriculasButtons;
    private javax.swing.JPanel panelPeriodoAcademico;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelRegistroButtons;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void habilitarComponentes() {
        if (BLPeriodosAcademicos.existePeriodoAcademico()) {
            btnRegistroNotas.setEnabled(true);
            btnRegistroPeriodoAcademico.setEnabled(false);
            lblPeriodoAcademico.setText("Periodo Académico: " 
                    + BLPeriodosAcademicos.obtenerUltimoPeriodoAcademico());
        } else {
            
        }
    }
}
