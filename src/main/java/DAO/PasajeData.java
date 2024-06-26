package DAO;

import Modelos.Colectivo;
import Modelos.Pasaje;
import Modelos.Pasajero;
import Modelos.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasajeData {

  private final Connection connection;
  private final PasajeroData pasajeroData;
  private final ColectivoData colectivoData;
  private final RutaData rutaData;

  public PasajeData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
    this.pasajeroData = new PasajeroData();
    this.colectivoData = new ColectivoData();
    this.rutaData = new RutaData();
  }

  public List<Pasaje> obtenerPasajes() {
    List<Pasaje> pasajes = new ArrayList<>();

    try {
      String sql = "SELECT * FROM pasaje;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idPasaje = rs.getInt("id_pasaje");
        int idPasajero = rs.getInt("id_pasajero");
        int idColectivo = rs.getInt("id_colectivo");
        int idRuta = rs.getInt("id_ruta");
        Pasajero pasajero = this.pasajeroData.obtenerPasajeroPorId(idPasajero);
        Colectivo colectivo = this.colectivoData.obtenerColectivoPorId(idColectivo);
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalDate fechaViaje = rs.getDate("fecha_viaje").toLocalDate();
        LocalTime horaViaje = rs.getTime("hora_viaje").toLocalTime();
        int asiento = rs.getInt("asiento");
        double precio = rs.getDouble("precio");
        boolean estado = rs.getBoolean("estado");

        Pasaje pasaje = new Pasaje(idPasaje, pasajero, colectivo, ruta, fechaViaje, horaViaje, asiento, precio, estado);
        pasajes.add(pasaje);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(pasajes);

    return pasajes;
  }

  public Pasaje obtenerPasajePorId(int id) {
    Pasaje pasaje = new Pasaje();

    try {
      String sql = "SELECT * FROM pasaje WHERE id_pasaje = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        int idPasaje = rs.getInt("id_pasaje");
        int idPasajero = rs.getInt("id_pasajero");
        Pasajero pasajero = this.pasajeroData.obtenerPasajeroPorId(idPasajero);
        int idColectivo = rs.getInt("id_colectivo");
        Colectivo colectivo = colectivoData.obtenerColectivoPorId(idColectivo);
        int idRuta = rs.getInt("id_ruta");
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalDate fechaViaje = rs.getDate("fecha_viaje").toLocalDate();
        LocalTime horaViaje = rs.getTime("hora_viaje").toLocalTime();
        int asiento = rs.getInt("asiento");
        double precio = rs.getDouble("precio");
        boolean estado = rs.getBoolean("estado");

        pasaje = new Pasaje(idPasaje, pasajero, colectivo, ruta, fechaViaje, horaViaje, asiento, precio, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return pasaje;
  }

  public List<Pasaje> obtenerPasajesPorIdPasajero(int id) {
    List<Pasaje> pasajes = new ArrayList<>();

    try {
      String sql = "SELECT * FROM pasaje WHERE id_pasajero = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idPasaje = rs.getInt("id_pasaje");
        int idPasajero = rs.getInt("id_pasajero");
        int idColectivo = rs.getInt("id_colectivo");
        int idRuta = rs.getInt("id_ruta");
        Pasajero pasajero = this.pasajeroData.obtenerPasajeroPorId(idPasajero);
        Colectivo colectivo = this.colectivoData.obtenerColectivoPorId(idColectivo);
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalDate fechaViaje = rs.getDate("fecha_viaje").toLocalDate();
        LocalTime horaViaje = rs.getTime("hora_viaje").toLocalTime();
        int asiento = rs.getInt("asiento");
        double precio = rs.getDouble("precio");
        boolean estado = rs.getBoolean("estado");

        Pasaje pasaje = new Pasaje(idPasaje, pasajero, colectivo, ruta, fechaViaje, horaViaje, asiento, precio, estado);
        pasajes.add(pasaje);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(pasajes);

    return pasajes;
  }

  public boolean crearPasaje(Pasaje pasaje) {
    boolean exito = false;

    try {
      String sql = "INSERT INTO pasaje(id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio) VALUES (?,?,?,?,?,?,?);";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, pasaje.getPasajero().getIdPasajero());
      ps.setInt(2, pasaje.getColectivo().getIdColectivo());
      ps.setInt(3, pasaje.getRuta().getIdRuta());
      ps.setString(4, pasaje.getFechaViaje().toString());
      ps.setString(5, pasaje.getHoraViaje().toString());
      ps.setInt(6, pasaje.getAsiento());
      ps.setDouble(7, pasaje.getPrecio());

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

  public boolean modificarPasaje(Pasaje pasaje) {
    boolean exito = false;

    try {
      String sql = "UPDATE pasaje SET id_pasajero = ?, id_colectivo = ?, id_ruta = ?, fecha_viaje = ?, hora_viaje = ?, asiento = ?, precio = ?, estado = ? WHERE id_pasaje = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, pasaje.getPasajero().getIdPasajero());
      ps.setInt(2, pasaje.getColectivo().getIdColectivo());
      ps.setInt(3, pasaje.getRuta().getIdRuta());
      ps.setString(4, pasaje.getFechaViaje().toString());
      ps.setString(5, pasaje.getHoraViaje().toString());
      ps.setInt(6, pasaje.getAsiento());
      ps.setDouble(7, pasaje.getPrecio());
      ps.setBoolean(8, pasaje.isEstado());
      ps.setInt(9, pasaje.getIdPasaje());

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

  public int obtenerLugaresLibres(int idRuta, String fecha, String horaViaje, int idColectivo) {
    int pasajesLibres = 0;

    try {
      String sql = """
                 SELECT
                        c.capacidad - COALESCE(o.pasajes_ocupados, 0) AS asientos_libres
                    FROM
                        colectivo c
                    LEFT JOIN (
                        SELECT
                            id_colectivo,
                            COUNT(id_pasaje) AS pasajes_ocupados
                        FROM
                            pasaje
                        WHERE
                            id_ruta = ? AND
                            fecha_viaje = ? AND
                            hora_viaje = ? AND
                            estado = 1
                        GROUP BY
                            id_colectivo
                    ) o ON c.id_colectivo = o.id_colectivo
                    WHERE
                        c.id_colectivo = ?;
                   """;
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, idRuta);
      ps.setString(2, fecha);
      ps.setString(3, horaViaje);
      ps.setInt(4, idColectivo);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        pasajesLibres = rs.getInt("asientos_libres");
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return pasajesLibres;
  }

  public List<Pasaje> consultarPasajesFiltrado(int idRutaBuscar, int idColectivoBuscar, String fechaBuscar, int idHorarioBuscar) {
    List<Pasaje> pasajes = new ArrayList<>();

    try {
      String sql = "SELECT pasaje.* FROM pasaje JOIN horario ON pasaje.id_ruta = horario.id_ruta WHERE pasaje.id_ruta = ? AND pasaje.id_colectivo = ? AND pasaje.fecha_viaje = ? AND horario.id_horario = ? ";

      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, idRutaBuscar);
      ps.setInt(2, idColectivoBuscar);
      ps.setString(3, fechaBuscar);
      ps.setInt(4, idHorarioBuscar);

      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idPasaje = rs.getInt("id_pasaje");
        int idPasajero = rs.getInt("id_pasajero");
        int idColectivo = rs.getInt("id_colectivo");
        int idRuta = rs.getInt("id_ruta");
        Pasajero pasajero = this.pasajeroData.obtenerPasajeroPorId(idPasajero);
        Colectivo colectivo = this.colectivoData.obtenerColectivoPorId(idColectivo);
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalDate fechaViaje = rs.getDate("fecha_viaje").toLocalDate();
        LocalTime horaViaje = rs.getTime("hora_viaje").toLocalTime();
        int asiento = rs.getInt("asiento");
        double precio = rs.getDouble("precio");
        boolean estado = rs.getBoolean("estado");

        Pasaje pasaje = new Pasaje(idPasaje, pasajero, colectivo, ruta, fechaViaje, horaViaje, asiento, precio, estado);
        pasajes.add(pasaje);
      }

      ps.close();
    } catch (SQLException ex) {
      System.err.println(ex);
    }

    Collections.sort(pasajes);

    return pasajes;
  }

  public boolean borrarPasaje(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE pasaje SET estado = 0 WHERE id_pasaje = ?;";
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

  public boolean borrarPasajeFisico(int id) {
    boolean exito = false;
    try {
      String sql = "DELETE FROM pasaje WHERE pasaje.id_pasaje = ?";
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
