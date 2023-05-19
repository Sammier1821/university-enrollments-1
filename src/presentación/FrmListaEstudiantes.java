package presentación;

import javax.swing.table.DefaultTableModel;

public class FrmListaEstudiantes extends javax.swing.JFrame {

    DefaultTableModel dtmEstudiantes = new DefaultTableModel();
    
    public FrmListaEstudiantes(javax.swing.JFrame parent) {
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
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        title.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("LISTA DE ESTUDIANTES");
        panelTitle.add(title);

        bg.add(panelTitle);

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;
    private String encabezados[] = {"CÓDIGO", "DNI", "NOMBRE", "APELLIDOS", "DIRECCION"};
    
    
    private void setModeloTable() {
        
        dtmEstudiantes.setColumnIdentifiers(encabezados);
        tblEstudiantes.setModel(dtmEstudiantes);
        
    }

    private void setDatosTable() {
        
        
        
    }
    
    
}
