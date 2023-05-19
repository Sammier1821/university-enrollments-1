package presentación;

import javax.swing.table.DefaultTableModel;

public class FrmListaAsignaturas extends javax.swing.JFrame {

    DefaultTableModel dtmEstudiantes = new DefaultTableModel();
    
    public FrmListaAsignaturas(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        parent.setVisible(false);
        setModeloTable();
        setDatosTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        panelDatos = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(33, 42, 62));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(57, 72, 103));
        panelTitle.setPreferredSize(new java.awt.Dimension(960, 40));

        title.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("LISTA DE ASIGNATURAS");
        panelTitle.add(title);

        bg.add(panelTitle);

        jPanel3.setBackground(new java.awt.Color(57, 72, 103));
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 50));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Código de asignatura:");
        jLabel4.setPreferredSize(new java.awt.Dimension(159, 30));
        jPanel3.add(jLabel4);

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(jComboBox1);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Periodo Académico:");
        jLabel1.setPreferredSize(new java.awt.Dimension(159, 30));
        jPanel3.add(jLabel1);

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox2.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(jComboBox2);

        bg.add(jPanel3);

        panelDatos.setBackground(new java.awt.Color(57, 72, 103));
        panelDatos.setPreferredSize(new java.awt.Dimension(800, 500));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 20));

        scrollPane.setPreferredSize(new java.awt.Dimension(600, 402));
        scrollPane.setViewportView(tblEstudiantes);

        panelDatos.add(scrollPane);

        bg.add(panelDatos);

        jPanel2.setBackground(new java.awt.Color(57, 72, 103));
        jPanel2.setPreferredSize(new java.awt.Dimension(140, 400));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnSalir.setBackground(new java.awt.Color(155, 164, 181));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(33, 42, 62));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);

        bg.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;
    private String encabezados[] = {"CÓDIGO", "NOMBRE", "CICLO", "CRÉDITOS"};
    
    
    private void setModeloTable() {
        
        dtmEstudiantes.setColumnIdentifiers(encabezados);
        tblEstudiantes.setModel(dtmEstudiantes);
        
    }

    private void setDatosTable() {
        
        
        
    }
    
    
}
