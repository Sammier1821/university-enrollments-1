package presentación;

import entidades.Asignatura;
import javax.swing.table.DefaultTableModel;
import lógica.BLAsignaturas;

public class FrmListaAsignaturas extends javax.swing.JFrame {

    private DefaultTableModel dtmAsignaturas = new DefaultTableModel();
    
    public FrmListaAsignaturas(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        parent.setVisible(false);
        setModeloTable();
        if (BLAsignaturas.getNumeroRegistros() > 0) {
            setDatosTable();            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        lblCodigoAsignatura = new javax.swing.JLabel();
        cboCodigoAsignatura = new javax.swing.JComboBox<>();
        lblPeriodoAcademico = new javax.swing.JLabel();
        cboPeriodoAcademico = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tblAsignaturas = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
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

        panelInfo.setBackground(new java.awt.Color(57, 72, 103));
        panelInfo.setPreferredSize(new java.awt.Dimension(960, 50));
        panelInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        lblCodigoAsignatura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCodigoAsignatura.setForeground(java.awt.Color.white);
        lblCodigoAsignatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigoAsignatura.setText("Código de asignatura:");
        lblCodigoAsignatura.setPreferredSize(new java.awt.Dimension(159, 30));
        panelInfo.add(lblCodigoAsignatura);

        cboCodigoAsignatura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cboCodigoAsignatura.setPreferredSize(new java.awt.Dimension(150, 30));
        panelInfo.add(cboCodigoAsignatura);

        lblPeriodoAcademico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPeriodoAcademico.setForeground(java.awt.Color.white);
        lblPeriodoAcademico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPeriodoAcademico.setText("Periodo Académico:");
        lblPeriodoAcademico.setPreferredSize(new java.awt.Dimension(159, 30));
        panelInfo.add(lblPeriodoAcademico);

        cboPeriodoAcademico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cboPeriodoAcademico.setPreferredSize(new java.awt.Dimension(150, 30));
        panelInfo.add(cboPeriodoAcademico);

        btnFiltrar.setBackground(new java.awt.Color(155, 164, 181));
        btnFiltrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnFiltrar.setForeground(new java.awt.Color(33, 42, 62));
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        panelInfo.add(btnFiltrar);

        bg.add(panelInfo);

        panelDatos.setBackground(new java.awt.Color(57, 72, 103));
        panelDatos.setPreferredSize(new java.awt.Dimension(800, 480));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 40));

        scrollPane.setPreferredSize(new java.awt.Dimension(600, 400));

        tblAsignaturas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        scrollPane.setViewportView(tblAsignaturas);

        panelDatos.add(scrollPane);

        bg.add(panelDatos);

        panelButtons.setBackground(new java.awt.Color(57, 72, 103));
        panelButtons.setPreferredSize(new java.awt.Dimension(140, 400));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCodigoAsignatura;
    private javax.swing.JComboBox<String> cboPeriodoAcademico;
    private javax.swing.JLabel lblCodigoAsignatura;
    private javax.swing.JLabel lblPeriodoAcademico;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblAsignaturas;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;
    private String encabezados[] = {"CÓDIGO", "NOMBRE", "CICLO", "CRÉDITOS"};
    
    
    private void setModeloTable() {
        
        dtmAsignaturas.setColumnIdentifiers(encabezados);
        tblAsignaturas.setModel(dtmAsignaturas);
        tblAsignaturas.getColumnModel().getColumn(0).
                setPreferredWidth(70);
        tblAsignaturas.getColumnModel().getColumn(1).
                setPreferredWidth(330);
        tblAsignaturas.getColumnModel().getColumn(2).
                setPreferredWidth(100);
        tblAsignaturas.getColumnModel().getColumn(3).
                setPreferredWidth(100);
    }

    private void setDatosTable() {
        
        Object[] data = new Object[dtmAsignaturas.getColumnCount()];
        
        for (Asignatura asignatura : BLAsignaturas.getAsignaturas()) {
            data[0] = asignatura.getCodigo();
            data[1] = asignatura.getNombre();
            data[2] = asignatura.getCiclo();
            data[3] = asignatura.getCreditos();
            dtmAsignaturas.addRow(data);
        }
        
        tblAsignaturas.setModel(dtmAsignaturas);
        
    }
    
    
}
