package DAO;

import Modelos.Colectivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColectivoData {

  private final Connection connection;

  public ColectivoData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
  }

  public List<Colectivo> obtenerColectivos() {
    List<Colectivo> colectivos = new ArrayList<>();

    try {
      String sql = "SELECT * FROM colectivo;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idColectivo = rs.getInt("id_colectivo");
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        int capacidad = rs.getInt("capacidad");
        boolean estado = rs.getBoolean("estado");

        Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, estado);
        colectivos.add(colectivo);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(colectivos);

    return colectivos;
  }

  public List<Colectivo> obtenerColectivosActivos() {
    List<Colectivo> colectivos = new ArrayList<>();

    try {
      String sql = "SELECT * FROM colectivo WHERE estado = 1;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idColectivo = rs.getInt("id_colectivo");
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        int capacidad = rs.getInt("capacidad");
        boolean estado = rs.getBoolean("estado");

        Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, estado);
        colectivos.add(colectivo);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(colectivos);

    return colectivos;
  }

  public Colectivo obtenerColectivoPorId(int id) {
    Colectivo colectivo = null;

    try {
      String sql = "SELECT * FROM colectivo WHERE id_colectivo = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idColectivo = rs.getInt("id_colectivo");
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        int capacidad = rs.getInt("capacidad");
        boolean estado = rs.getBoolean("estado");

        colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return colectivo;
  }

  public Colectivo obtenerColectivoPorRutaHorarioFecha(int idRuta, String horaViaje, String fechaViaje) {
    Colectivo colectivo = null;

    try {
      String sql = """
                    SELECT
                      colectivo.*
                    FROM
                      colectivo
                    JOIN
                      pasaje ON colectivo.id_colectivo = pasaje.id_colectivo
                    JOIN
                      horario ON pasaje.id_ruta = horario.id_ruta
                    WHERE
                      pasaje.id_ruta = ? AND
                      pasaje.hora_viaje = ? AND
                      pasaje.fecha_viaje = ? AND
                      pasaje.id_colectivo = colectivo.id_colectivo
                    LIMIT 1;
                   """;
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, idRuta);
      ps.setString(2, horaViaje);
      ps.setString(3, fechaViaje);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idColectivo = rs.getInt("id_colectivo");
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        int capacidad = rs.getInt("capacidad");
        boolean estado = rs.getBoolean("estado");

        colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return colectivo;
  }

  public List<String> obtenerAsientosOcupados(int idColectivo, int idRuta, String fechaViaje, String horaViaje) {
    List<String> asientosOcupados = new ArrayList<>();

    try {
      String sql = "SELECT asiento FROM pasaje WHERE id_colectivo = ? AND id_ruta = ? AND fecha_viaje = ? AND hora_viaje = ? AND estado = 1;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, idColectivo);
      ps.setInt(2, idRuta);
      ps.setString(3, fechaViaje);
      ps.setString(4, horaViaje);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int asiento = rs.getInt("asiento");

        asientosOcupados.add(String.valueOf(asiento));
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return asientosOcupados;
  }

  public Colectivo obtenerColectivoPorMatricula(String matriculaColectivo) {
    Colectivo colectivo = null;

    try {
      String sql = "SELECT * FROM colectivo WHERE matricula = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, matriculaColectivo);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idColectivo = rs.getInt("id_colectivo");
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        int capacidad = rs.getInt("capacidad");
        boolean estado = rs.getBoolean("estado");

        colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return colectivo;
  }

  public boolean crearColectivo(Colectivo colectivo) {
    boolean exito = false;

    try {
      String slq = "INSERT INTO colectivo(matricula,marca,modelo,capacidad,estado) VALUES (?,?,?,?,?);";
      PreparedStatement ps = connection.prepareStatement(slq);
      ps.setString(1, colectivo.getMatricula());
      ps.setString(2, colectivo.getMarca());
      ps.setString(3, colectivo.getModelo());
      ps.setInt(4, colectivo.getCapacidad());
      ps.setBoolean(5, colectivo.isEstado());

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

  public boolean modificarColectivo(Colectivo colectivo) {
    boolean exito = false;

    try {
      String sql = "UPDATE colectivo SET matricula = ?, marca = ?, modelo = ?, capacidad = ?, estado = ? WHERE id_colectivo = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, colectivo.getMatricula());
      ps.setString(2, colectivo.getMarca());
      ps.setString(3, colectivo.getModelo());
      ps.setInt(4, colectivo.getCapacidad());
      ps.setBoolean(5, colectivo.isEstado());
      ps.setInt(6, colectivo.getIdColectivo());

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

  public boolean borrarColectivo(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE colectivo SET estado = 0 WHERE id_colectivo = ?;";
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
