package DAO;

import Modelos.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CiudadData {

  private final Connection connection;

  public CiudadData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
  }

  public List<Ciudad> obtenerCiudades() {
    List<Ciudad> ciudades = new ArrayList<>();

    try {
      String sql = "SELECT * FROM ciudad;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while (rs.next()) {
        int idCiudad = rs.getInt("id_ciudad");
        String nombre = rs.getString("nombre");
        String provincia = rs.getString("provincia");
        boolean estado = rs.getBoolean("estado");

        Ciudad ciudad = new Ciudad(idCiudad, nombre, provincia, estado);
        ciudades.add(ciudad);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(ciudades);

    return ciudades;
  }

  public Ciudad obtenerCiudadPorId(int id) {
    Ciudad ciudad = null;

    try {
      String sql = "SELECT * FROM ciudad WHERE id_ciudad = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idCiudad = rs.getInt("id_ciudad");
        String nombre = rs.getString("nombre");
        String provincia = rs.getString("provincia");
        boolean estado = rs.getBoolean("estado");

        ciudad = new Ciudad(idCiudad, nombre, provincia, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return ciudad;
  }

  public Ciudad obtenerCiudadPorNombre(String nombreCiudad) {
    Ciudad ciudad = null;

    try {
      String sql = "SELECT * FROM ciudad WHERE nombre LIKE ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, "%" + nombreCiudad + "%");
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idCiudad = rs.getInt("id_ciudad");
        String nombre = rs.getString("nombre");
        String provincia = rs.getString("provincia");
        boolean estado = rs.getBoolean("estado");

        ciudad = new Ciudad(idCiudad, nombre, provincia, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return ciudad;
  }

  public boolean crearCiudad(Ciudad ciudad) {
    boolean exito = false;

    try {
      String sql = "INSERT INTO ciudad( nombre, provincia, estado) VALUES (?,?,?);";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, ciudad.getNombre());
      ps.setString(2, ciudad.getProvincia());
      ps.setBoolean(3, ciudad.isEstado());

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

  public boolean modificarCiudad(Ciudad ciudad) {
    boolean exito = false;

    try {
      String sql = "UPDATE ciudad SET nombre = ?, provincia = ?, estado = ? WHERE id_ciudad = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, ciudad.getNombre());
      ps.setString(2, ciudad.getProvincia());
      ps.setBoolean(3, ciudad.isEstado());
      ps.setInt(4, ciudad.getIdCiudad());

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

  public boolean borrarCiudad(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE ciudad SET estado = 0 WHERE id_ciudad = ?;";
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
