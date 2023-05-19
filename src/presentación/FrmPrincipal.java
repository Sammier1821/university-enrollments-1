package presentación;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnRegistroSecretarios = new javax.swing.JButton();
        btnRegistroJefes = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        btnListadoSecres = new javax.swing.JButton();
        btnListadoAutos = new javax.swing.JButton();
        btnListadoJefes = new javax.swing.JButton();
        btnRegistroAutos1 = new javax.swing.JButton();
        btnRegistroSecretarios1 = new javax.swing.JButton();
        btnRegistroSecretarios2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 255));

        btnRegistroSecretarios.setText("Registro de matriculas");
        btnRegistroSecretarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroSecretariosActionPerformed(evt);
            }
        });

        btnRegistroJefes.setText("Registro de asignaturas");
        btnRegistroJefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroJefesActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SUV 3");

        btnListadoSecres.setText("Listado de matriculas");
        btnListadoSecres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoSecresActionPerformed(evt);
            }
        });

        btnListadoAutos.setText("Listado de estudiantes (mostrando cursos matriculados)");
        btnListadoAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoAutosActionPerformed(evt);
            }
        });

        btnListadoJefes.setText("Listado de asignaturas (mostrando estudiantes matriculados)");
        btnListadoJefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoJefesActionPerformed(evt);
            }
        });

        btnRegistroAutos1.setText("Registro de estudiantes");
        btnRegistroAutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAutos1ActionPerformed(evt);
            }
        });

        btnRegistroSecretarios1.setText("(1RO AL ENTRAR AL SUV3, DEMAS BOTONES BLOQUEADOS) Registro de periodo académico");
        btnRegistroSecretarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroSecretarios1ActionPerformed(evt);
            }
        });

        btnRegistroSecretarios2.setText("Registro de notas 1) Seleccionar estudiante 2) Seleccionar cursos 3) Definir notas");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOSTRAR PERIODO ACADEMICO ACTUAL (String)");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegistroAutos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistroJefes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistroSecretarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnListadoJefes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListadoAutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListadoSecres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRegistroSecretarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistroSecretarios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(btnRegistroSecretarios1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListadoAutos)
                    .addComponent(btnRegistroJefes))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnRegistroAutos1)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistroSecretarios))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnListadoJefes)
                        .addGap(18, 18, 18)
                        .addComponent(btnListadoSecres)))
                .addGap(18, 18, 18)
                .addComponent(btnRegistroSecretarios2)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroSecretariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroSecretariosActionPerformed
//        if (ListaEmpleados.getNumeroJefesDeZona() == 0) {
//            JOptionPane.showMessageDialog(this, "No hay instancias de jefes de zona", "Aviso", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            RegistroSecretarios window = new RegistroSecretarios(this);
//            window.setVisible(true);
//        }

    }//GEN-LAST:event_btnRegistroSecretariosActionPerformed

    private void btnRegistroJefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroJefesActionPerformed
//        if (ListaDatos.getEmpresa().getNumeroAutomoviles() == 0) {
//            JOptionPane.showMessageDialog(this, "No hay instancias de automóviles", "Aviso", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            RegistroJefesDeZona window = new RegistroJefesDeZona(this);
//            window.setVisible(true);
//        }
    }//GEN-LAST:event_btnRegistroJefesActionPerformed

    private void btnListadoSecresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoSecresActionPerformed
//        ListadoSecretarios window = new ListadoSecretarios(this);
//        window.setVisible(true);
    }//GEN-LAST:event_btnListadoSecresActionPerformed

    private void btnListadoAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoAutosActionPerformed
//        ListadoAutomoviles window = new ListadoAutomoviles(this);
//        window.setVisible(true);
    }//GEN-LAST:event_btnListadoAutosActionPerformed

    private void btnListadoJefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoJefesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListadoJefesActionPerformed

    private void btnRegistroAutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAutos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroAutos1ActionPerformed

    private void btnRegistroSecretarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroSecretarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroSecretarios1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListadoAutos;
    private javax.swing.JButton btnListadoJefes;
    private javax.swing.JButton btnListadoSecres;
    private javax.swing.JButton btnRegistroAutos1;
    private javax.swing.JButton btnRegistroJefes;
    private javax.swing.JButton btnRegistroSecretarios;
    private javax.swing.JButton btnRegistroSecretarios1;
    private javax.swing.JButton btnRegistroSecretarios2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
