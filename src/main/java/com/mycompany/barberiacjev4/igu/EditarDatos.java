package com.mycompany.barberiacjev4.igu;

import com.mycompany.barberiacjev4.logica.Controladora;
import com.mycompany.barberiacjev4.logica.Servicio;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/*
 * Clase EditarDatos.
 * Permite editar la información de un servicio y el cliente asociado. Esta interfaz de usuario
 * proporciona campos para modificar los datos almacenados en la base de datos.
 */
public class EditarDatos extends javax.swing.JFrame {
    // Instancia de la controladora para manejar la lógica del sistema
    Controladora control = null;
    // Identificador del servicio a editar
    int num_servicio;
    // Objeto servicio que contiene los datos del servicio seleccionado
    Servicio servicio;
    
    /*
     * Constructor de la clase EditarDatos.
     * Inicializa los componentes de la interfaz y carga los datos del servicio a editar.
     *
     * @param num_servicio Identificador del servicio a editar
     */
    public EditarDatos(int num_servicio) {
        control = new Controladora();// Inicialización de la controladora
        //this.num_servicio = num_servicio;
        initComponents();// Inicialización de los componentes gráficos
        IngresarDatos(num_servicio);// Carga los datos en la interfaz
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        Celular1 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        Celular = new javax.swing.JLabel();
        txtResidencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbCabello = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCorte = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbSede = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbBarbero = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbAdicionales = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbAsesoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(37, 37, 37));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(37, 37, 37));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Editar Datos Servicio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Editar Datos Cliente");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Nombre y Apellido");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtNombre.setBackground(new java.awt.Color(37, 37, 37));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cedula");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtCedula.setBackground(new java.awt.Color(37, 37, 37));
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, -1));

        Celular1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Celular1.setForeground(new java.awt.Color(204, 204, 204));
        Celular1.setText("Contacto");
        jPanel2.add(Celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtContacto.setBackground(new java.awt.Color(37, 37, 37));
        txtContacto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtContacto.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        Celular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Celular.setForeground(new java.awt.Color(204, 204, 204));
        Celular.setText("Residencia");
        jPanel2.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtResidencia.setBackground(new java.awt.Color(37, 37, 37));
        txtResidencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtResidencia.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Tipo de Cabello");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        cmbCabello.setBackground(new java.awt.Color(37, 37, 37));
        cmbCabello.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbCabello.setForeground(new java.awt.Color(204, 204, 204));
        cmbCabello.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Liso", "Ondulado", "Rizado", "Afro" }));
        jPanel2.add(cmbCabello, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 110, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Que tipo de corte Deseas Hacerte");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        txtCorte.setBackground(new java.awt.Color(37, 37, 37));
        txtCorte.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorte.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 220, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Sede");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        cmbSede.setBackground(new java.awt.Color(37, 37, 37));
        cmbSede.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbSede.setForeground(new java.awt.Color(204, 204, 204));
        cmbSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Chapinero", "Candelaria", "Suba", "Bosa" }));
        jPanel2.add(cmbSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 110, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Barbero");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        cmbBarbero.setBackground(new java.awt.Color(37, 37, 37));
        cmbBarbero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbBarbero.setForeground(new java.awt.Color(204, 204, 204));
        cmbBarbero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Valentina", "Cesar", "Jhonny", "Eliut" }));
        jPanel2.add(cmbBarbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Adicionales");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        cmbAdicionales.setBackground(new java.awt.Color(37, 37, 37));
        cmbAdicionales.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbAdicionales.setForeground(new java.awt.Color(204, 204, 204));
        cmbAdicionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Corte de cejas", "Corte Barba", "Tinturado" }));
        jPanel2.add(cmbAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 110, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Deseas Asesoria");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        cmbAsesoria.setBackground(new java.awt.Color(37, 37, 37));
        cmbAsesoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbAsesoria.setForeground(new java.awt.Color(204, 204, 204));
        cmbAsesoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        jPanel2.add(cmbAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/barberiacjev4/imagenes/recuadroformulario.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 850, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 830, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/barberiacjev4/imagenes/fondoformulario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

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
     * Método para limpiar todos los campos de la interfaz.
     * Resetea los valores de los campos de entrada y las listas desplegables.
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtCedula.setText("");
        txtContacto.setText("");
        txtCorte.setText("");
        txtNombre.setText("");
        txtResidencia.setText("");
        cmbAdicionales.setSelectedIndex(0);
        cmbAsesoria.setSelectedIndex(0);
        cmbBarbero.setSelectedIndex(0);
        cmbSede.setSelectedIndex(0);
        cmbCabello.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed
    /*
     * Método para guardar los cambios realizados en los datos del servicio y cliente.
     * Recoge los datos de los campos y los actualiza en la base de datos.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        // Recopila los datos del cliente
        String cedula = txtCedula.getText();
        String contacto = txtContacto.getText();
        String corte = txtCorte.getText();
        String nombre = txtNombre.getText();
        String residencia = txtResidencia.getText();
        
        // Modifica el servicio y el cliente asociado
        String adicionales = (String) cmbAdicionales.getSelectedItem();
        String asesoria = (String) cmbAsesoria.getSelectedItem();
        String barbero = (String) cmbBarbero.getSelectedItem();
        String sede = (String) cmbSede.getSelectedItem();
        String cabello = (String) cmbCabello.getSelectedItem();
            
        control.modificarServicio(servicio, adicionales, asesoria, barbero, sede, cabello, residencia, nombre, corte, contacto, cedula);       
        
        // Muestra un mensaje de confirmación
        mostrarMensaje("Edicion realizada correctamente", "Info", "Edicion Correcta");
        // Redirige a la ventana de visualización de datos
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        this.dispose();// Cierra la ventana actual
        
    }//GEN-LAST:event_btnGuardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Celular;
    private javax.swing.JLabel Celular1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAdicionales;
    private javax.swing.JComboBox<String> cmbAsesoria;
    private javax.swing.JComboBox<String> cmbBarbero;
    private javax.swing.JComboBox<String> cmbCabello;
    private javax.swing.JComboBox<String> cmbSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorte;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResidencia;
    // End of variables declaration//GEN-END:variables
    /*
     * Método para cargar los datos del servicio en los campos de la interfaz.
     * Ajusta los valores según los datos obtenidos del servicio seleccionado.
     *
     * @param num_servicio Identificador del servicio a editar
     */
    private void IngresarDatos(int num_servicio) {
        this.servicio = control.traerServicios(num_servicio);
        // Rellena los campos con los datos existentes
        txtCedula.setText(servicio.getUnServicio().getCedula());
        txtContacto.setText(servicio.getUnServicio().getNum_Contacto());
        txtCorte.setText(servicio.getTipo_Corte());
        txtNombre.setText(servicio.getUnServicio().getNombre_Apellido());
        txtResidencia.setText(servicio.getUnServicio().getResidencia());
        
                //editar tipo de cabello
                if (servicio.getTipo_Cabello().equals("Liso")) {
                cmbCabello.setSelectedIndex(1);
                } else if (servicio.getTipo_Cabello().equals("Ondulado")) {
                 cmbCabello.setSelectedIndex(2);
                } else if (servicio.getTipo_Cabello().equals("Rizado")) {
                 cmbCabello.setSelectedIndex(3);
                } else if (servicio.getTipo_Cabello().equals("Afro")) {
                  cmbCabello.setSelectedIndex(4);
                }
                //editar Sede
                if (servicio.getSede().equals("Chapinero")) {
                cmbSede.setSelectedIndex(1);
                } else if (servicio.getSede().equals("Candelaria")) {
                 cmbSede.setSelectedIndex(2);
                } else if (servicio.getSede().equals("Suba")) {
                 cmbSede.setSelectedIndex(3);
                } else if (servicio.getSede().equals("Bosa")) {
                  cmbSede.setSelectedIndex(4);
                }
                //editar Barbero
                if (servicio.getBarbero().equals("Valentina")) {
                cmbBarbero.setSelectedIndex(1);
                } else if (servicio.getBarbero().equals("Cesar")) {
                 cmbBarbero.setSelectedIndex(2);
                } else if (servicio.getBarbero().equals("Jhonny")) {
                 cmbBarbero.setSelectedIndex(3);
                } else if (servicio.getBarbero().equals("Eliut")) {
                  cmbBarbero.setSelectedIndex(4);
                }
                //editar Adicionales
                if (servicio.getAdicionales().equals("Corte de cejas")) {
                cmbAdicionales.setSelectedIndex(1);
                } else if (servicio.getAdicionales().equals("Corte Barba")) {
                 cmbAdicionales.setSelectedIndex(2);
                } else if (servicio.getAdicionales().equals("Tinturado")) {
                 cmbAdicionales.setSelectedIndex(3);
                } 
                //editar Asesoria
                if (servicio.getAsesoria().equals("Si")) {
                cmbAsesoria.setSelectedIndex(1);
                } else if (servicio.getAsesoria().equals("No")) {
                 cmbAsesoria.setSelectedIndex(2);
                }
        
        
        
        
        
    }
    /*
     * Muestra un mensaje emergente en la pantalla.
     *
     * @param mensaje Texto del mensaje
     * @param tipo Tipo de mensaje ("Info", "Error", etc.)
     * @param titulo Título del mensaje
     */
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        
        int messageType;
        if (tipo.equals("Info")) {
        messageType = JOptionPane.INFORMATION_MESSAGE;
        } else if (tipo.equals("Error")) {
        messageType = JOptionPane.ERROR_MESSAGE;
        } else {
        messageType = JOptionPane.PLAIN_MESSAGE;
        }
    
        JOptionPane optionPanel = new JOptionPane(mensaje, messageType);
        JDialog dialog = optionPanel.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    
    
    }
    
    
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