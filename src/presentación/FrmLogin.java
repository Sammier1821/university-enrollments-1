package presentación;

public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        btnEstudiante = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(33, 42, 62));
        bg.setMinimumSize(new java.awt.Dimension(0, 0));
        bg.setPreferredSize(new java.awt.Dimension(500, 250));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(57, 72, 103));
        panelTitle.setPreferredSize(new java.awt.Dimension(460, 40));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        title.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("UNIVERSIDAD NACIONAL DE TRUJILLO");
        title.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title.setPreferredSize(new java.awt.Dimension(460, 30));
        panelTitle.add(title);

        bg.add(panelTitle);

        panelButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelButtons.setPreferredSize(new java.awt.Dimension(460, 150));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnEstudiante.setBackground(new java.awt.Color(155, 164, 181));
        btnEstudiante.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(33, 42, 62));
        btnEstudiante.setText("ESTUDIANTE");
        btnEstudiante.setMaximumSize(new java.awt.Dimension(9999, 9999));
        btnEstudiante.setPreferredSize(new java.awt.Dimension(440, 60));
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });
        panelButtons.add(btnEstudiante);

        btnAdministrador.setBackground(new java.awt.Color(155, 164, 181));
        btnAdministrador.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(33, 42, 62));
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setMaximumSize(new java.awt.Dimension(9999, 9999));
        btnAdministrador.setPreferredSize(new java.awt.Dimension(440, 60));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        panelButtons.add(btnAdministrador);

        bg.add(panelButtons);

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        new FrmAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        new FrmLoginEstudiante(this).setVisible(true);
    }//GEN-LAST:event_btnEstudianteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
