package presentación;

public class FrmEstudiante extends javax.swing.JFrame {

    public FrmEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lblPeriodoAcademico = new javax.swing.JLabel();
        panelDecoration1 = new javax.swing.JPanel();
        panelMatricula = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        panelMatriculaButtons = new javax.swing.JPanel();
        btnRegistroMatricula = new javax.swing.JButton();
        iconDocument = new javax.swing.JLabel();
        panelNotas = new javax.swing.JPanel();
        lblNotas = new javax.swing.JLabel();
        panelNotasButtons = new javax.swing.JPanel();
        btnNotas = new javax.swing.JButton();
        iconFolder = new javax.swing.JLabel();
        panelDecoration2 = new javax.swing.JPanel();

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

        panelDecoration1.setBackground(new java.awt.Color(57, 72, 103));
        panelDecoration1.setPreferredSize(new java.awt.Dimension(50, 160));
        panelDecoration1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelDecoration1Layout = new javax.swing.GroupLayout(panelDecoration1);
        panelDecoration1.setLayout(panelDecoration1Layout);
        panelDecoration1Layout.setHorizontalGroup(
            panelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelDecoration1Layout.setVerticalGroup(
            panelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panel.add(panelDecoration1);

        panelMatricula.setBackground(new java.awt.Color(57, 72, 103));
        panelMatricula.setPreferredSize(new java.awt.Dimension(400, 160));
        panelMatricula.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblMatricula.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblMatricula.setForeground(java.awt.Color.white);
        lblMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMatricula.setText("PROCESO DE MATRÍCULA");
        lblMatricula.setPreferredSize(new java.awt.Dimension(500, 60));
        panelMatricula.add(lblMatricula);

        panelMatriculaButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelMatriculaButtons.setPreferredSize(new java.awt.Dimension(250, 60));
        panelMatriculaButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15));

        btnRegistroMatricula.setBackground(new java.awt.Color(155, 164, 181));
        btnRegistroMatricula.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroMatricula.setForeground(new java.awt.Color(33, 42, 62));
        btnRegistroMatricula.setText("Registrar matrícula");
        btnRegistroMatricula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroMatricula.setPreferredSize(new java.awt.Dimension(180, 30));
        btnRegistroMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroMatriculaActionPerformed(evt);
            }
        });
        panelMatriculaButtons.add(btnRegistroMatricula);

        panelMatricula.add(panelMatriculaButtons);

        iconDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentación/iconos/document.png"))); // NOI18N
        iconDocument.setPreferredSize(new java.awt.Dimension(150, 100));
        panelMatricula.add(iconDocument);

        panel.add(panelMatricula);

        panelNotas.setBackground(new java.awt.Color(57, 72, 103));
        panelNotas.setPreferredSize(new java.awt.Dimension(350, 160));
        panelNotas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblNotas.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblNotas.setForeground(java.awt.Color.white);
        lblNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotas.setText("ARCHIVO DE NOTAS");
        lblNotas.setPreferredSize(new java.awt.Dimension(310, 60));
        panelNotas.add(lblNotas);

        panelNotasButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelNotasButtons.setPreferredSize(new java.awt.Dimension(160, 60));
        panelNotasButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15));

        btnNotas.setBackground(new java.awt.Color(155, 164, 181));
        btnNotas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnNotas.setForeground(new java.awt.Color(33, 42, 62));
        btnNotas.setText("Ver notas");
        btnNotas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotas.setPreferredSize(new java.awt.Dimension(115, 30));
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });
        panelNotasButtons.add(btnNotas);

        panelNotas.add(panelNotasButtons);

        iconFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentación/iconos/folder.png"))); // NOI18N
        iconFolder.setPreferredSize(new java.awt.Dimension(150, 100));
        panelNotas.add(iconFolder);

        panel.add(panelNotas);

        panelDecoration2.setBackground(new java.awt.Color(57, 72, 103));
        panelDecoration2.setPreferredSize(new java.awt.Dimension(50, 160));

        javax.swing.GroupLayout panelDecoration2Layout = new javax.swing.GroupLayout(panelDecoration2);
        panelDecoration2.setLayout(panelDecoration2Layout);
        panelDecoration2Layout.setHorizontalGroup(
            panelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelDecoration2Layout.setVerticalGroup(
            panelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panel.add(panelDecoration2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroMatriculaActionPerformed
        
    }//GEN-LAST:event_btnRegistroMatriculaActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        new FrmNotas(this).setVisible(true);
    }//GEN-LAST:event_btnNotasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnRegistroMatricula;
    private javax.swing.JLabel iconDocument;
    private javax.swing.JLabel iconFolder;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblPeriodoAcademico;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelDecoration1;
    private javax.swing.JPanel panelDecoration2;
    private javax.swing.JPanel panelMatricula;
    private javax.swing.JPanel panelMatriculaButtons;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelNotasButtons;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
