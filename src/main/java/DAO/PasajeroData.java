package DAO;

import Modelos.Pasajero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PasajeroData {

  private final Connection connection;

  public PasajeroData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
  }

  public List<Pasajero> obtenerPasajeros() {
    List<Pasajero> pasajeros = new ArrayList<>();

    try {
      String sql = "SELECT * FROM pasajero;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idPasajero = rs.getInt("id_pasajero");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apeliido");
        int dni = rs.getInt("dni");
        String correo = rs.getString("correo");
        String telefono = rs.getString("telefono");
        boolean estado = rs.getBoolean("estado");

        Pasajero pasajero = new Pasajero(idPasajero, nombre, apellido, dni, correo, telefono, estado);
        pasajeros.add(pasajero);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return pasajeros;
  }

  public Pasajero obtenerPasajeroPorId(int id) {
    Pasajero pasajero = null;

    try {
      String sql = "SELECT * FROM pasajero WHERE id_pasajero = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idPasajero = rs.getInt("id_pasajero");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apeliido");
        int dni = rs.getInt("dni");
        String correo = rs.getString("correo");
        String telefono = rs.getString("telefono");
        boolean estado = rs.getBoolean("estado");

        pasajero = new Pasajero(idPasajero, nombre, apellido, dni, correo, telefono, estado);

      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return pasajero;
  }

  public Pasajero obtenerPasajeroPorDni(int dniPasajero) {
    Pasajero pasajero = null;

    try {
      String sql = "SELECT * FROM pasajero WHERE dni = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, dniPasajero);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idPasajero = rs.getInt("id_pasajero");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apeliido");
        int dni = rs.getInt("dni");
        String correo = rs.getString("correo");
        String telefono = rs.getString("telefono");
        boolean estado = rs.getBoolean("estado");

        pasajero = new Pasajero(idPasajero, nombre, apellido, dni, correo, telefono, estado);

      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return pasajero;
  }

  public boolean crearPasajero(Pasajero pasajero) {
    boolean exito = false;

    try {
      String sql = "INSERT INTO pasajero( nombre, apeliido, dni, correo, telefono, estado) VALUES (?,?,?,?,?,?);";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, pasajero.getNombre());
      ps.setString(2, pasajero.getApellido());
      ps.setInt(3, pasajero.getDni());
      ps.setString(4, pasajero.getCorreo());
      ps.setString(5, pasajero.getTelefono());
      ps.setBoolean(6, pasajero.isEstado());

      int filas = ps.executeUpdate();

      if (filas > 0) {
        exito = true;
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return exito;
  }

  public boolean modificarPasajero(Pasajero pasajero) {
    boolean exito = false;

    try {
      String sql = "UPDATE pasajero SET nombre = ?, apeliido = ?, dni = ?, correo = ?, telefono = ?, estado = ? WHERE id_pasajero = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, pasajero.getNombre());
      ps.setString(2, pasajero.getApellido());
      ps.setInt(3, pasajero.getDni());
      ps.setString(4, pasajero.getCorreo());
      ps.setString(5, pasajero.getTelefono());
      ps.setBoolean(6, pasajero.isEstado());
      ps.setInt(7, pasajero.getIdPasajero());

      int filas = ps.executeUpdate();

      if (filas > 0) {
        exito = true;
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return exito;
  }

  public boolean borrarPasajero(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE pasajero SET estado = 0 WHERE id_pasajero = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);

      int filas = ps.executeUpdate();

      if (filas > 0) {
        exito = true;
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return exito;
  }
}
