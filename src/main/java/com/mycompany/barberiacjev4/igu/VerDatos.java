package com.mycompany.barberiacjev4.igu;
import com.mycompany.barberiacjev4.logica.Controladora;
import com.mycompany.barberiacjev4.logica.Servicio;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VerDatos extends javax.swing.JFrame {
    Controladora control = null;           
        public VerDatos() {
        control = new Controladora();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicio = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(37, 37, 37));
        btnEditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        btnEliminar1.setBackground(new java.awt.Color(37, 37, 37));
        btnEliminar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setBorderPainted(false);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102)));

        tablaServicio.setBackground(new java.awt.Color(102, 102, 102));
        tablaServicio.setForeground(new java.awt.Color(51, 51, 51));
        tablaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaServicio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 850, 500));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ver Datos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/barberiacjev4/imagenes/recuadroformulario.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 440, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/barberiacjev4/imagenes/fondoprinc.png"))); // NOI18N
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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
             //controlo que la tabla no este vacia
        if (tablaServicio.getRowCount() > 0) {
            //controlo que se halla se haya selecionado un servicio o linea
            if (tablaServicio.getSelectedRow() != -1) {               
                //obtengo la id del servicio que voy a editar
                int num_servicio = Integer.parseInt(String.valueOf(tablaServicio.getValueAt(tablaServicio.getSelectedRow(), 0)));              
                EditarDatos pantallaEdit = new EditarDatos(num_servicio);
                pantallaEdit.setVisible(true);
                pantallaEdit.setLocationRelativeTo(null);                
                this.dispose();                
        }
            else{
                mostrarMensaje("No selecciono ningun servicio", "Error", "Error al editar");
            }             
        }       
        else{
            mostrarMensaje("No hay nada para editar en la Tabla", "Error", "Error al editar");
        }            
    }//GEN-LAST:event_btnEditarActionPerformed
    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        //controlo que la tabla no este vacia
        if (tablaServicio.getRowCount() > 0) {
            //controlo que se halla se haya selecionado un servicio o linea
            if (tablaServicio.getSelectedRow() != -1) {
                //obtengo la id del servicio que voy a eliminar
                int num_servicio = Integer.parseInt(String.valueOf(tablaServicio.getValueAt(tablaServicio.getSelectedRow(), 0)));
                //Llamo al metodo borrar
                control.borrarServicio(num_servicio);
                //aviso al cliente que borro correctamente
                mostrarMensaje("Servicio eliminado correctamente", "Info", "Borrado de Servicio");
                //se actualiza la tabla en la interfaz grafica
                cargarTabla();                    
            }
            else{
                mostrarMensaje("No selecciono ningun servicio", "Error", "Error al eliminar");
            }                   
        }
        else{
                mostrarMensaje("No hay nada para eliminar en la Tabla", "Error", "Error al eliminar");
            }
    }//GEN-LAST:event_btnEliminar1ActionPerformed
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaServicio;
    // End of variables declaration//GEN-END:variables
    private void cargarTabla() {
       //definimos el modelo que vamos a querer para la tabla
       DefaultTableModel modeloTabla = new DefaultTableModel() {
           //esto hace que las filas y las columnas no sean editables
           @Override
           public boolean isCellEditable (int row, int column) {
               return false;
           }    
       };
       //{"Num Servicio", "Cliente", "Cedula", "Contacto", "Residencia", "Sede", "Barbero", "Tipo Cabello", "Tipo de Corte", "Adicionales", "Asesoria"}
       //establecemos los nombres de la columnas 
       String titulos[] = {"Num Servicio", "Cliente", "Cedula", "Contacto", "Residencia", "Sede", "Barbero", "Tipo Cabello", "Tipo de Corte", "Adicionales", "Asesoria"};
       modeloTabla.setColumnIdentifiers(titulos);       
       //cargar los datos desde la base de datos 
       List <Servicio> listaServicios = control.traerServicios();       
       //recorrer la lista y mostrar cada uno de los elemntos en la tabla
       if(listaServicios!=null){
           for(Servicio servicio : listaServicios) {
               Object[] objeto = {servicio.getNum_Servicio(), servicio.getUnServicio().getNombre_Apellido(), servicio.getUnServicio().getCedula(), 
                   servicio.getUnServicio().getNum_Contacto(), 
                   servicio.getUnServicio().getResidencia(), servicio.getSede(), servicio.getBarbero(), servicio.getTipo_Cabello(),
                   servicio.getTipo_Corte(), servicio.getAdicionales(), servicio.getAsesoria()};/*{servicio.getNum_Servicio(), servicio.getSede(), 
                   servicio.getBarbero(), servicio.getTipo_Cabello(), 
                   servicio.getTipo_Corte(), servicio.getAdicionales(), servicio.getAsesoria(),
                   servicio.getUnServicio().getNombre_Apellido(), servicio.getUnServicio().getCedula(), servicio.getUnServicio().getNum_Contacto(), 
                   servicio.getUnServicio().getResidencia()};*/          
               modeloTabla.addRow(objeto);               
           }                
       }      
       tablaServicio.setModel(modeloTabla);           
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