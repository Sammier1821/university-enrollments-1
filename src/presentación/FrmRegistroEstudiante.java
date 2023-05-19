package presentación;

import javax.swing.JOptionPane;

import lógica.BLEstudiantes;
import lógica.BLPeriodosAcademicos;

public class FrmRegistroEstudiante extends javax.swing.JFrame {

    public FrmRegistroEstudiante(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        parent.setVisible(false);
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
        txtCódigo = new javax.swing.JTextField();
        panelDni = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        panelNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panelApellidos = new javax.swing.JPanel();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        panelDireccion = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
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
        title.setText("REGISTRO ESTUDIANTE");
        panelTitle.add(title);

        bg.add(panelTitle);

        panelDatos.setBackground(new java.awt.Color(57, 72, 103));
        panelDatos.setPreferredSize(new java.awt.Dimension(400, 310));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 20));

        panelCódigo.setBackground(new java.awt.Color(57, 72, 103));
        panelCódigo.setPreferredSize(new java.awt.Dimension(160, 50));
        panelCódigo.setLayout(new java.awt.BorderLayout());

        lblCódigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCódigo.setForeground(java.awt.Color.white);
        lblCódigo.setText("Código:");
        panelCódigo.add(lblCódigo, java.awt.BorderLayout.CENTER);

        txtCódigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCódigo.setEnabled(false);
        txtCódigo.setPreferredSize(new java.awt.Dimension(200, 25));
        panelCódigo.add(txtCódigo, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelCódigo);

        panelDni.setBackground(new java.awt.Color(57, 72, 103));
        panelDni.setPreferredSize(new java.awt.Dimension(160, 50));
        panelDni.setLayout(new java.awt.BorderLayout());

        lblDni.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDni.setForeground(java.awt.Color.white);
        lblDni.setText("DNI:");
        panelDni.add(lblDni, java.awt.BorderLayout.CENTER);

        txtDni.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtDni.setEnabled(false);
        txtDni.setPreferredSize(new java.awt.Dimension(200, 25));
        panelDni.add(txtDni, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelDni);

        panelNombre.setBackground(new java.awt.Color(57, 72, 103));
        panelNombre.setPreferredSize(new java.awt.Dimension(350, 50));
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

        panelApellidos.setBackground(new java.awt.Color(57, 72, 103));
        panelApellidos.setPreferredSize(new java.awt.Dimension(350, 50));
        panelApellidos.setLayout(new java.awt.BorderLayout());

        lblApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblApellidos.setForeground(java.awt.Color.white);
        lblApellidos.setText("Apellidos:");
        panelApellidos.add(lblApellidos, java.awt.BorderLayout.CENTER);

        txtApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellidos.setEnabled(false);
        txtApellidos.setPreferredSize(new java.awt.Dimension(200, 25));
        panelApellidos.add(txtApellidos, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelApellidos);

        panelDireccion.setBackground(new java.awt.Color(57, 72, 103));
        panelDireccion.setPreferredSize(new java.awt.Dimension(350, 50));
        panelDireccion.setLayout(new java.awt.BorderLayout());

        lblDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDireccion.setForeground(java.awt.Color.white);
        lblDireccion.setText("Dirección:");
        panelDireccion.add(lblDireccion, java.awt.BorderLayout.CENTER);

        txtDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtDireccion.setEnabled(false);
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 25));
        panelDireccion.add(txtDireccion, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelDireccion);

        bg.add(panelDatos);

        panelBotones.setBackground(new java.awt.Color(57, 72, 103));
        panelBotones.setPreferredSize(new java.awt.Dimension(400, 65));
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        btnNuevo.setBackground(new java.awt.Color(155, 164, 181));
        btnNuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(33, 42, 62));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panelBotones.add(btnNuevo);

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
        panelBotones.add(btnGuardar);

        btnSalir.setBackground(new java.awt.Color(155, 164, 181));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(33, 42, 62));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelBotones.add(btnSalir);

        bg.add(panelBotones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String codigo = txtCódigo.getText();
        String dni = txtDni.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String direccion = txtDireccion.getText();
        String mensaje = BLEstudiantes.escribirEstudiante(codigo, dni, nombre, 
                apellidos, direccion);
        
        if(mensaje.compareTo("ok") == 0) {
            JOptionPane.showMessageDialog(null, 
                    "¡Estudiante Guardado!", "Información", 
                    JOptionPane.INFORMATION_MESSAGE);
            habilitarComponentes(false);
            limpiarComponentes();
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Estudiante no guardado: " + mensaje, "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCódigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelApellidos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCódigo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDireccion;
    private javax.swing.JPanel panelDni;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;
    
    private void habilitarComponentes(boolean value) {
        btnGuardar.setEnabled(value);
        txtCódigo.setEnabled(value);
        txtDni.setEnabled(value);
        txtNombre.setEnabled(value);
        txtApellidos.setEnabled(value);
        txtDireccion.setEnabled(value);
        btnNuevo.setEnabled(!value);
    }

    private void limpiarComponentes() {
        txtCódigo.setText(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtDireccion.setText(null);
        txtDni.setText(null);
    }
    
}
