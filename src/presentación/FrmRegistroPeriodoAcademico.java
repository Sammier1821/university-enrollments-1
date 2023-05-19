package presentación;

import entidades.PeriodoAcademico;
import javax.swing.JOptionPane;
import lógica.BLPeriodoAcademico;

public class FrmRegistroPeriodoAcademico extends javax.swing.JFrame {

    public FrmRegistroPeriodoAcademico(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        parent.setVisible(false);
        setModeloBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelAño = new javax.swing.JPanel();
        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        panelSemestre = new javax.swing.JPanel();
        lblSemestre = new javax.swing.JLabel();
        cboSemestre = new javax.swing.JComboBox<>();
        panelButtons = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(33, 42, 62));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 20));

        panelTitle.setBackground(new java.awt.Color(57, 72, 103));
        panelTitle.setPreferredSize(new java.awt.Dimension(400, 33));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("REGISTRO PERIODO ACADÉMICO");
        panelTitle.add(title);

        bg.add(panelTitle);

        panelDatos.setBackground(new java.awt.Color(57, 72, 103));
        panelDatos.setPreferredSize(new java.awt.Dimension(400, 85));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 10));

        panelAño.setBackground(new java.awt.Color(57, 72, 103));
        panelAño.setPreferredSize(new java.awt.Dimension(150, 50));
        panelAño.setLayout(new java.awt.BorderLayout());

        lblAño.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblAño.setForeground(java.awt.Color.white);
        lblAño.setText("Año:");
        panelAño.add(lblAño, java.awt.BorderLayout.CENTER);

        txtAño.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAño.setEnabled(false);
        txtAño.setPreferredSize(new java.awt.Dimension(200, 25));
        panelAño.add(txtAño, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelAño);

        panelSemestre.setBackground(new java.awt.Color(57, 72, 103));
        panelSemestre.setPreferredSize(new java.awt.Dimension(150, 50));
        panelSemestre.setLayout(new java.awt.BorderLayout());

        lblSemestre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblSemestre.setForeground(java.awt.Color.white);
        lblSemestre.setText("Semestre:");
        panelSemestre.add(lblSemestre, java.awt.BorderLayout.CENTER);

        cboSemestre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cboSemestre.setEnabled(false);
        cboSemestre.setPreferredSize(new java.awt.Dimension(200, 25));
        panelSemestre.add(cboSemestre, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelSemestre);

        bg.add(panelDatos);

        panelButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelButtons.setPreferredSize(new java.awt.Dimension(400, 65));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnNuevo.setBackground(new java.awt.Color(155, 164, 181));
        btnNuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(33, 42, 62));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panelButtons.add(btnNuevo);

        btnGuardar.setBackground(new java.awt.Color(155, 164, 181));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(33, 42, 62));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelButtons.add(btnGuardar);

        btnSalir.setBackground(new java.awt.Color(155, 164, 181));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(33, 42, 62));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelButtons.add(btnSalir);

        bg.add(panelButtons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int año;
        String semestre;
        año = Integer.parseInt(txtAño.getText());
        semestre = cboSemestre.getSelectedItem().toString();
        if(BLPeriodoAcademico.guardarPeriodoAcademico(año, semestre))
            JOptionPane.showMessageDialog(null, "Periodo academico guardado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        habilitarComponentes(false);
        limpiarComponentes();
            
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarComponentes(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboSemestre;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JPanel panelAño;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelSemestre;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAño;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;

    private void setModeloBox() {
        for (String string : PeriodoAcademico.semestres)
            cboSemestre.addItem(string);
    }

    private void habilitarComponentes(boolean value) {
        btnGuardar.setEnabled(value);
        cboSemestre.setEnabled(value);
        txtAño.setEnabled(value);
        btnNuevo.setEnabled(!value);
    }

    private void limpiarComponentes() {
        cboSemestre.setSelectedItem(0);
        txtAño.setText(null);
    }
}
