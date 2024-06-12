package Vistas;

import DAO.ColectivoData;
import Modelos.Colectivo;
import static Utilidades.Regex.validarRegex;
import javax.swing.JOptionPane;

public class VistaColectivo extends javax.swing.JInternalFrame {

  /**
   * Creates new form VistaColectivo
   */
  public VistaColectivo() {
    initComponents();
    estadoColectivo.setSelected(true);
    estadoColectivo.setEnabled(false);
    limpiar.setEnabled(false);
    buscar.setEnabled(false);
    eliminar.setEnabled(false);
    buscar.setEnabled(false);
    guardar.setEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar = new javax.swing.JButton();
        idColectivo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        capacidadColectivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        matriculaColectivo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        marcaColectivo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        modeloColectivo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        estadoColectivo = new javax.swing.JRadioButton();
        limpiar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Colectivo");
        setMaximumSize(new java.awt.Dimension(800, 580));
        setMinimumSize(new java.awt.Dimension(800, 580));

        buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        idColectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idColectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idColectivoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        capacidadColectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        capacidadColectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                capacidadColectivoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Marca:");

        matriculaColectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        matriculaColectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matriculaColectivoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Matricula:");

        marcaColectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        marcaColectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                marcaColectivoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Modelo:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Capacidad:");

        modeloColectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        modeloColectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modeloColectivoKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Estado:");

        limpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estadoColectivo)
                                .addGap(544, 544, 544))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(capacidadColectivo)
                                    .addComponent(idColectivo)
                                    .addComponent(matriculaColectivo)
                                    .addComponent(marcaColectivo)
                                    .addComponent(modeloColectivo))
                                .addGap(31, 31, 31)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(idColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(marcaColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(modeloColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(capacidadColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(estadoColectivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(eliminar)
                    .addComponent(guardar))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    if (!idColectivo.getText().equals("")) {
      Integer id = Integer.valueOf(idColectivo.getText().trim());
      colectivoActivo = colectivoData.obtenerColectivoPorId(id);

    } else if (!matriculaColectivo.getText().equals("")) {
      String matricula = matriculaColectivo.getText().trim();
      colectivoActivo = colectivoData.obtenerColectivoPorMatricula(matricula);
    }

    if (colectivoActivo != null) {
      idColectivo.setEnabled(false);
      buscar.setEnabled(false);

      idColectivo.setText(colectivoActivo.getIdColectivo() + "");
      matriculaColectivo.setText(colectivoActivo.getMatricula());
      marcaColectivo.setText(colectivoActivo.getMarca());
      modeloColectivo.setText(colectivoActivo.getModelo());
      capacidadColectivo.setText(colectivoActivo.getCapacidad() + "");
      estadoColectivo.setSelected(colectivoActivo.isEstado());

      eliminar.setEnabled(true);
      guardar.setText("Editar");

    } else {
      limpiarCampos();
      idColectivo.requestFocus();
      JOptionPane.showMessageDialog(this, "Colectivo no encontrado");

    }

    chequearCampos();

    if (colectivoActivo != null && !colectivoActivo.isEstado()) {
      eliminar.setEnabled(false);
      estadoColectivo.setEnabled(true);
    }

    }//GEN-LAST:event_buscarActionPerformed

    private void capacidadColectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacidadColectivoKeyReleased
    chequearCampos();
    }//GEN-LAST:event_capacidadColectivoKeyReleased

    private void matriculaColectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaColectivoKeyReleased
    chequearCampos();
    }//GEN-LAST:event_matriculaColectivoKeyReleased

    private void marcaColectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaColectivoKeyReleased
    chequearCampos();
    }//GEN-LAST:event_marcaColectivoKeyReleased

    private void modeloColectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloColectivoKeyReleased
    chequearCampos();
    }//GEN-LAST:event_modeloColectivoKeyReleased

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar el colectivo: " + "\n" + colectivoActivo.getMarca() + "\n" + "Modelo: " + colectivoActivo.getModelo() + "\n" + "Matricula: " + colectivoActivo.getMatricula());

    if (colectivoActivo != null && opcion == 0) {
      colectivoData.borrarColectivo(colectivoActivo.getIdColectivo());
      JOptionPane.showMessageDialog(this, "Colectivo eliminado");
      limpiarCampos();
    } else if (colectivoActivo != null && opcion == 1 || opcion == 2 || opcion == -1) {
      matriculaColectivo.requestFocus();
    } else if (colectivoActivo == null) {
      JOptionPane.showMessageDialog(this, "El colectivo no se pudo eliminar");
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    if (colectivoActivo == null) {
      String matricula = matriculaColectivo.getText().trim();
      String marca = marcaColectivo.getText().trim();
      String modelo = modeloColectivo.getText().trim();
      int capacidad = Integer.parseInt(capacidadColectivo.getText().trim());

      Colectivo colectivo = new Colectivo(matricula, marca, modelo, capacidad, true);
      colectivoData.crearColectivo(colectivo);
      JOptionPane.showMessageDialog(this, "Colectivo creado");
      limpiarCampos();
    } else {
      colectivoActivo.setMatricula(matriculaColectivo.getText().trim());
      colectivoActivo.setMarca(marcaColectivo.getText().trim());
      colectivoActivo.setModelo(modeloColectivo.getText().trim());
      colectivoActivo.setCapacidad(Integer.parseInt(capacidadColectivo.getText().trim()));
      colectivoActivo.setEstado(estadoColectivo.isSelected());

      colectivoData.modificarColectivo(colectivoActivo);
      JOptionPane.showMessageDialog(this, "Colectivo modificado");
      limpiarCampos();
    }
    }//GEN-LAST:event_guardarActionPerformed

    private void idColectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idColectivoKeyReleased
    chequearCampos();
    }//GEN-LAST:event_idColectivoKeyReleased

  private void limpiarCampos() {
    colectivoActivo = null;
    idColectivo.setText("");
    matriculaColectivo.setText("");
    marcaColectivo.setText("");
    modeloColectivo.setText("");
    capacidadColectivo.setText("");
    estadoColectivo.setSelected(true);
    estadoColectivo.setEnabled(false);
    buscar.setEnabled(false);
    limpiar.setEnabled(false);
    guardar.setEnabled(false);
    eliminar.setEnabled(false);
    idColectivo.setEnabled(true);
    guardar.setText("Guardar");
  }

  private void chequearCampos() {

    //OBTENER CAMPOS
    String id = idColectivo.getText().trim();
    String matricula = matriculaColectivo.getText().trim();
    String marca = marcaColectivo.getText().trim();
    String modelo = modeloColectivo.getText().trim();
    String capacidad = capacidadColectivo.getText().trim();

    // EXPRESIONES REGULARES PARA VALIDAR DOCUMENTO, NOMBRE Y APELLIDO
    String idRegex = "^\\d+$";
    String capacidadRegex = "^\\d{1,8}$";

    //VALIDAR CAMPOS
    boolean idValido = !id.isEmpty() && validarRegex(idRegex, id);
    boolean capacidadValido = !capacidad.isEmpty() && validarRegex(capacidadRegex, capacidad);

    boolean validado = idValido && capacidadValido;

    //HABILITAR BOTONES GUARDAR Y ELIMINAR SI TODOS LOS CAMPOS SON VALIDOS
    limpiar.setEnabled(true);
    guardar.setEnabled(validado);
    eliminar.setEnabled(validado && colectivoActivo != null);

    //MOSTRAR ERROR ESPECIFICO SEGUN EL CAMPO
    if (!id.isEmpty() && !idValido) {
      JOptionPane.showMessageDialog(this, "ID no valido, solo numeros enteros");
      idColectivo.requestFocus();
    } else if (!capacidad.isEmpty() && !capacidadValido) {
      JOptionPane.showMessageDialog(this, "Capacidad no valida, solo numeros enteros");
      capacidadColectivo.requestFocus();
    }

    //HABILITAR BOTON BUSCAR
    if ((idValido || !matricula.isEmpty()) && colectivoActivo == null) {
      buscar.setEnabled(true);
    } else {
      buscar.setEnabled(false);
    }

    //DESHABILITAR EL BOTON LIMPIAR SI LOS CAMPOS ESTAN VACIOS
    if (id.isEmpty() && matricula.isEmpty() && marca.isEmpty() && modelo.isEmpty() && capacidad.isEmpty()) {
      limpiar.setEnabled(false);
    }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField capacidadColectivo;
    private javax.swing.JButton eliminar;
    private javax.swing.JRadioButton estadoColectivo;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idColectivo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField marcaColectivo;
    private javax.swing.JTextField matriculaColectivo;
    private javax.swing.JTextField modeloColectivo;
    // End of variables declaration//GEN-END:variables
  ColectivoData colectivoData = new ColectivoData();
  Colectivo colectivoActivo = null;

}
