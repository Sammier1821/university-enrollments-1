package presentación;

import entidades.Asignatura;
import javax.swing.JOptionPane;
import lógica.BLAsignaturas;

public class FrmRegistroAsignatura extends javax.swing.JFrame {

    public FrmRegistroAsignatura(javax.swing.JFrame parent) {
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
        panelCódigo = new javax.swing.JPanel();
        lblCódigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        panelCiclo = new javax.swing.JPanel();
        lblCiclo = new javax.swing.JLabel();
        cboCiclo = new javax.swing.JComboBox<>();
        panelCreditos = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        panelNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
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
        title.setText("REGISTRO ASIGNATURA");
        panelTitle.add(title);

        bg.add(panelTitle);

        panelDatos.setBackground(new java.awt.Color(57, 72, 103));
        panelDatos.setPreferredSize(new java.awt.Dimension(400, 170));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelCódigo.setBackground(new java.awt.Color(57, 72, 103));
        panelCódigo.setPreferredSize(new java.awt.Dimension(110, 50));
        panelCódigo.setLayout(new java.awt.BorderLayout());

        lblCódigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCódigo.setForeground(java.awt.Color.white);
        lblCódigo.setText("Código:");
        panelCódigo.add(lblCódigo, java.awt.BorderLayout.CENTER);

        txtCodigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 25));
        panelCódigo.add(txtCodigo, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelCódigo);

        panelCiclo.setBackground(new java.awt.Color(57, 72, 103));
        panelCiclo.setPreferredSize(new java.awt.Dimension(110, 50));
        panelCiclo.setLayout(new java.awt.BorderLayout());

        lblCiclo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCiclo.setForeground(java.awt.Color.white);
        lblCiclo.setText("Ciclo:");
        panelCiclo.add(lblCiclo, java.awt.BorderLayout.CENTER);

        cboCiclo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cboCiclo.setEnabled(false);
        cboCiclo.setPreferredSize(new java.awt.Dimension(200, 25));
        panelCiclo.add(cboCiclo, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelCiclo);

        panelCreditos.setBackground(new java.awt.Color(57, 72, 103));
        panelCreditos.setPreferredSize(new java.awt.Dimension(110, 50));
        panelCreditos.setLayout(new java.awt.BorderLayout());

        lblCreditos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCreditos.setForeground(java.awt.Color.white);
        lblCreditos.setText("Créditos");
        panelCreditos.add(lblCreditos, java.awt.BorderLayout.CENTER);

        txtCreditos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCreditos.setEnabled(false);
        txtCreditos.setPreferredSize(new java.awt.Dimension(200, 25));
        panelCreditos.add(txtCreditos, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelCreditos);

        panelNombre.setBackground(new java.awt.Color(57, 72, 103));
        panelNombre.setPreferredSize(new java.awt.Dimension(370, 50));
        panelNombre.setLayout(new java.awt.BorderLayout());

        lblNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNombre.setForeground(java.awt.Color.white);
        lblNombre.setText("Nombre:");
        panelNombre.add(lblNombre, java.awt.BorderLayout.CENTER);

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 25));
        panelNombre.add(txtNombre, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelNombre);

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarComponentes(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String ciclo = cboCiclo.getSelectedItem().toString();
        int creditos = Integer.parseInt(txtCreditos.getText());
        String mensaje = BLAsignaturas.escribirAsignatura(
                codigo, nombre, ciclo, creditos);
        if (mensaje.compareTo("ok") == 0) {
            JOptionPane.showMessageDialog(this, 
                    "¡Asignatura Guardada!", "Información", 
                    JOptionPane.INFORMATION_MESSAGE);
            limpiarComponentes();
            habilitarComponentes(false);
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Asignatura no guardada: " + mensaje, "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCiclo;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblCódigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCiclo;
    private javax.swing.JPanel panelCreditos;
    private javax.swing.JPanel panelCódigo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;

    private void setModeloBox() {
        for (String string : Asignatura.ciclos)
            cboCiclo.addItem(string);
    }

    private void habilitarComponentes(boolean value) {
        btnGuardar.setEnabled(value);
        txtCodigo.setEnabled(value);
        cboCiclo.setEnabled(value);
        txtCreditos.setEnabled(value);
        txtNombre.setEnabled(value);
        btnNuevo.setEnabled(!value);
    }

    private void limpiarComponentes() {
        txtCodigo.setText(null);
        cboCiclo.setSelectedItem(0);
        txtCreditos.setText(null);
        txtNombre.setText(null);
    }
}
