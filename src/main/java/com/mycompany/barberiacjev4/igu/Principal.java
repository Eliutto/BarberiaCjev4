package com.mycompany.barberiacjev4.igu;
/*
 * Clase Principal que extiende javax.swing.JFrame y actúa como la ventana principal de la aplicación.
 * Contiene botones para navegar a otras funcionalidades de la aplicación y un diseño gráfico personalizado.
 */
public class Principal extends javax.swing.JFrame {
    /*
     * Constructor de la clase Principal.
     * Inicializa los componentes gráficos mediante el método initComponents().
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(37, 37, 37));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Salir");
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 160, 40));

        btnRegistrar.setBackground(new java.awt.Color(37, 37, 37));
        btnRegistrar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 160, 40));

        btnDatos.setBackground(new java.awt.Color(37, 37, 37));
        btnDatos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnDatos.setForeground(new java.awt.Color(204, 204, 204));
        btnDatos.setText("Ver Datos");
        btnDatos.setBorderPainted(false);
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/barberiacjev4/imagenes/fondoprinc.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
     * Método invocado al presionar el botón "Registrar".
     * Abre una nueva ventana para ingresar datos.
     * 
     * @param evt Evento de acción asociado al botón.
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        IngresarDatos pantalla = new IngresarDatos();// Crea una nueva ventana de tipo IngresarDatos.
        pantalla.setVisible(true);// Hace visible la ventana "IngresarDatos".
        pantalla.setLocationRelativeTo(null);// Centra la ventana en la pantalla.        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    /*
     * Método invocado al presionar el botón "Ver Datos".
     * Abre una nueva ventana para visualizar datos registrados.
     * 
     * @param evt Evento de acción asociado al botón.
     */
    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
       VerDatos pantalla = new VerDatos();// Crea una nueva ventana de tipo VerDatos.
        pantalla.setVisible(true);// Hace visible la ventana "VerDatos".
        pantalla.setLocationRelativeTo(null);// Centra la ventana en la pantalla.
    }//GEN-LAST:event_btnDatosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * =================================================================================
 *                                Barberiacjev App
 * =================================================================================
 * 
 * Aplicación desarrollada por [Gerson Eliut Torrado Guerrero] para la gestión de clientes
 * y servicios en la barbería "Barberiacjev".
 * 
 * Fecha de creación: [1/10/2025]
 * Última modificación: [1/12/2025]
 * 
 * Derechos de Autor © [2025], [Gerson Eliut Torrado Guerrero]. Todos los derechos reservados.
 * 
 * Esta aplicación y su código fuente son propiedad exclusiva de [Gerson Eliut Torrado Guerrero].
 * Está prohibida su reproducción, distribución, modificación o uso no autorizado sin el
 * consentimiento explícito por escrito del propietario. Cualquier intento de uso indebido
 * o apropiación del código será considerado una violación de los derechos de autor y será
 * tratado según las leyes vigentes.
 * 
 * Para consultas o permisos especiales, contacta a: [gerson.torrado@cun.edu.co]
 * 
 * =================================================================================
 */