package Vistas;

import DAO.PasajeroData;
import Modelos.Pasajero;
import static Utilidades.Regex.validarRegex;
import javax.swing.JOptionPane;

public class VistaPasajero extends javax.swing.JInternalFrame {

  /**
   * Creates new form VistaPasajero
   */
  public VistaPasajero() {
    initComponents();
    estadoPasajero.setSelected(true);
    estadoPasajero.setEnabled(false);
    buscar.setEnabled(false);
    limpiar.setEnabled(false);
    guardar.setEnabled(false);
    eliminar.setEnabled(false);

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellidoPasajero = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombrePasajero = new javax.swing.JTextField();
        correoPasajero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonoPasajero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        estadoPasajero = new javax.swing.JRadioButton();
        dniPasajero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Pasajero");
        setMaximumSize(new java.awt.Dimension(800, 580));
        setMinimumSize(new java.awt.Dimension(800, 580));
        setPreferredSize(new java.awt.Dimension(800, 580));

        apellidoPasajero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        apellidoPasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoPasajeroKeyReleased(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        nombrePasajero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        nombrePasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombrePasajeroKeyReleased(evt);
            }
        });

        correoPasajero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        correoPasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoPasajeroKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Correo:");

        telefonoPasajero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        telefonoPasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoPasajeroKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        limpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Estado:");

        dniPasajero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        dniPasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dniPasajeroKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Documento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dniPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(apellidoPasajero)
                            .addComponent(nombrePasajero))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(estadoPasajero)
                                        .addGap(298, 349, Short.MAX_VALUE))
                                    .addComponent(correoPasajero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefonoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dniPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombrePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(correoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoPasajero)
                    .addComponent(jLabel6))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(guardar)
                    .addComponent(eliminar))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void dniPasajeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniPasajeroKeyReleased
    chequearCampos();
    }//GEN-LAST:event_dniPasajeroKeyReleased

    private void apellidoPasajeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPasajeroKeyReleased
    chequearCampos();
    }//GEN-LAST:event_apellidoPasajeroKeyReleased

    private void nombrePasajeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePasajeroKeyReleased
    chequearCampos();
    }//GEN-LAST:event_nombrePasajeroKeyReleased

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    String correoRegex = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$";

    boolean correoValido = validarRegex(correoRegex, correoPasajero.getText().trim());

    boolean valido = correoValido;

    if (pasajeroActivo == null && valido) {
      int dni = Integer.parseInt(dniPasajero.getText());
      String nombre = nombrePasajero.getText();
      String apellido = apellidoPasajero.getText();
      String correo = correoPasajero.getText();
      String telefono = telefonoPasajero.getText();

      Pasajero pasajero = new Pasajero(nombre, apellido, dni, correo, telefono, true);
      pasajeroData.crearPasajero(pasajero);
      JOptionPane.showMessageDialog(this, "Pasajero guardado");
      limpiarCampos();
    } else if (pasajeroActivo != null && valido) {
      int dni = Integer.parseInt(dniPasajero.getText());
      pasajeroActivo.setDni(dni);
      pasajeroActivo.setApellido(apellidoPasajero.getText());
      pasajeroActivo.setNombre(nombrePasajero.getText());
      pasajeroActivo.setCorreo(correoPasajero.getText());
      pasajeroActivo.setTelefono(telefonoPasajero.getText());
      pasajeroActivo.setEstado(estadoPasajero.isSelected());

      pasajeroData.modificarPasajero(pasajeroActivo);
      JOptionPane.showMessageDialog(this, "Pasajero modificado");
      limpiarCampos();
    } else {
      JOptionPane.showMessageDialog(this, "correo no es validos");
    }

    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    Integer dni = Integer.valueOf(dniPasajero.getText().trim());
    pasajeroActivo = pasajeroData.obtenerPasajeroPorDni(dni);

    if (pasajeroActivo != null) {
      apellidoPasajero.setText(pasajeroActivo.getApellido());
      nombrePasajero.setText(pasajeroActivo.getNombre());
      correoPasajero.setText(pasajeroActivo.getCorreo());
      telefonoPasajero.setText(pasajeroActivo.getTelefono());
      estadoPasajero.setSelected(pasajeroActivo.isEstado());
      guardar.setText("Editar");

    } else {
      JOptionPane.showMessageDialog(this, "Pasajero no encontrado");
      limpiarCampos();
      dniPasajero.requestFocus();
    }

    chequearCampos();

    if (pasajeroActivo != null && !pasajeroActivo.isEstado()) {
      eliminar.setEnabled(false);
      estadoPasajero.setEnabled(true);
    }

    dniPasajero.requestFocus();
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar: " + pasajeroActivo.getApellido() + " " + pasajeroActivo.getNombre() + "?");

    if (pasajeroActivo != null && opcion == 0) {
      pasajeroData.borrarPasajero(pasajeroActivo.getIdPasajero());
      JOptionPane.showMessageDialog(this, "Pasajero Eliminado.");
      limpiarCampos();

    } else if (pasajeroActivo != null && opcion == 1 || opcion == 2 || opcion == -1) {
      dniPasajero.requestFocus();

    } else if (pasajeroActivo == null) {
      JOptionPane.showMessageDialog(this, "El pasajero no se pudo eliminar");
    }

    }//GEN-LAST:event_eliminarActionPerformed

    private void telefonoPasajeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoPasajeroKeyReleased
    chequearCampos();
    }//GEN-LAST:event_telefonoPasajeroKeyReleased

    private void correoPasajeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoPasajeroKeyReleased
    chequearCampos();
    }//GEN-LAST:event_correoPasajeroKeyReleased

  private void limpiarCampos() {
    apellidoPasajero.setText("");
    nombrePasajero.setText("");
    correoPasajero.setText("");
    telefonoPasajero.setText("");
    dniPasajero.setText("");
    pasajeroActivo = null;
    estadoPasajero.setSelected(true);
    estadoPasajero.setEnabled(false);
    buscar.setEnabled(false);
    limpiar.setEnabled(false);
    guardar.setEnabled(false);
    eliminar.setEnabled(false);
    guardar.setText("Guardar");
  }

  private void chequearCampos() {

    //OBTENER CAMPOS
    String dni = dniPasajero.getText().trim();
    String apellido = apellidoPasajero.getText().trim();
    String nombre = nombrePasajero.getText().trim();
    String correo = correoPasajero.getText().trim();
    String telefono = telefonoPasajero.getText().trim();

    // EXPRESIONES REGULARES PARA VALIDAR DOCUMENTO, NOMBRE Y APELLIDO
    String dniRegex = "^[1-9]\\d{0,7}$";
    String nombreApellidoRegex = "^[^\\d]+$";
    String telefonoRegex = "^[0-9]{1,13}$";

    //VALIDAR CAMPOS
    boolean dniValido = !dni.isEmpty() && validarRegex(dniRegex, dni);
    boolean apellidoValido = !apellido.isEmpty() && validarRegex(nombreApellidoRegex, apellido);
    boolean nombreValido = !nombre.isEmpty() && validarRegex(nombreApellidoRegex, nombre);
    boolean telefonoValido = validarRegex(telefonoRegex, telefonoPasajero.getText().trim());

    boolean validado = dniValido && apellidoValido && nombreValido && telefonoValido && !correo.isEmpty();

    //HABILITAR BOTONES GUARDAR Y ELIMINAR SI TODOS LOS CAMPOS SON VALIDOS
    limpiar.setEnabled(true);
    guardar.setEnabled(validado);
    eliminar.setEnabled(validado && pasajeroActivo != null);

    //MOSTRAR ERROR ESPECIFICO SEGUN EL CAMPO
    if (!dni.isEmpty() && !dniValido) {
      JOptionPane.showMessageDialog(this, "Documento no válido, solo números enteros y hasta 8 dígitos");
      dniPasajero.requestFocus();
    } else if (!apellido.isEmpty() && !apellidoValido) {
      JOptionPane.showMessageDialog(this, "El apellido no puede contener números");
      apellidoPasajero.requestFocus();
    } else if (!nombre.isEmpty() && !nombreValido) {
      JOptionPane.showMessageDialog(this, "El nombre no puede contener números");
      nombrePasajero.requestFocus();
    } else if (!telefono.isEmpty() && !telefonoValido) {
      JOptionPane.showMessageDialog(this, "Telefono no valido, solo números enteros");
      telefonoPasajero.requestFocus();
    }

    //HABILITAR BOTON BUSCAR SI EL DOCUMENTO
    if (dniValido) {
      buscar.setEnabled(true);
    } else {
      buscar.setEnabled(false);
    }

    //DESHABILITAR EL BOTON LIMPIAR SI LOS CAMPOS ESTAN VACIOS
    if (dni.isEmpty() && apellido.isEmpty() && nombre.isEmpty() && correo.isEmpty() && telefono.isEmpty()) {
      limpiar.setEnabled(false);
    }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoPasajero;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField correoPasajero;
    private javax.swing.JTextField dniPasajero;
    private javax.swing.JButton eliminar;
    private javax.swing.JRadioButton estadoPasajero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombrePasajero;
    private javax.swing.JTextField telefonoPasajero;
    // End of variables declaration//GEN-END:variables
  Pasajero pasajeroActivo = null;
  PasajeroData pasajeroData = new PasajeroData();
}
