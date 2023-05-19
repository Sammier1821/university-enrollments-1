package presentación;

public class FrmLoginEstudiante extends javax.swing.JFrame {

    public FrmLoginEstudiante(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        panelCódigo = new javax.swing.JPanel();
        lblCódigo = new javax.swing.JLabel();
        txtCódigo = new javax.swing.JTextField();
        panelIcon = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(33, 42, 62));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 20));

        panelTitle.setBackground(new java.awt.Color(57, 72, 103));
        panelTitle.setPreferredSize(new java.awt.Dimension(310, 33));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("CUENTA DE ESTUDIANTE");
        panelTitle.add(title);

        bg.add(panelTitle);

        panelLogin.setBackground(new java.awt.Color(57, 72, 103));
        panelLogin.setPreferredSize(new java.awt.Dimension(310, 120));
        panelLogin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        panelCódigo.setBackground(new java.awt.Color(57, 72, 103));
        panelCódigo.setPreferredSize(new java.awt.Dimension(110, 50));
        panelCódigo.setLayout(new java.awt.BorderLayout());

        lblCódigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCódigo.setForeground(java.awt.Color.white);
        lblCódigo.setText("Código:");
        panelCódigo.add(lblCódigo, java.awt.BorderLayout.CENTER);

        txtCódigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCódigo.setPreferredSize(new java.awt.Dimension(200, 25));
        panelCódigo.add(txtCódigo, java.awt.BorderLayout.PAGE_END);

        panelLogin.add(panelCódigo);

        panelIcon.setBackground(new java.awt.Color(57, 72, 103));
        panelIcon.setLayout(new javax.swing.BoxLayout(panelIcon, javax.swing.BoxLayout.LINE_AXIS));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentación/iconos/graduado.png"))); // NOI18N
        panelIcon.add(lblIcon);

        panelLogin.add(panelIcon);

        bg.add(panelLogin);

        panelButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelButtons.setPreferredSize(new java.awt.Dimension(310, 65));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnConfirmar.setBackground(new java.awt.Color(155, 164, 181));
        btnConfirmar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(33, 42, 62));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelButtons.add(btnConfirmar);

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        new FrmEstudiante().setVisible(true);
//        if (codigo estudiante existe) {
//            que mande mensaje sobre ingreso exitoso
//            que cierre esta ventana
//            que abra FrmEstudiante
//        } else {
//            que mande mensaje de que el estudiante no existe
//            que cierre esta ventana
//            que vuelva a FrmLogin
//        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblCódigo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCódigo;
    private javax.swing.JPanel panelIcon;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCódigo;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;
    
    
}
