package DAO;

import Modelos.Ciudad;
import Modelos.Horario;
import Modelos.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RutaData {

  private final Connection connection;
  private final CiudadData ciudadData;

  public RutaData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
    this.ciudadData = new CiudadData();
  }

  public List<Ruta> obtenerRutas() {
    List<Ruta> rutas = new ArrayList<>();

    try {
      String sql = "SELECT * FROM ruta;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idRuta = rs.getInt("id_ruta");
        int idOrigen = rs.getInt("id_origen");
        Ciudad origen = ciudadData.obtenerCiudadPorId(idOrigen);
        int idDestino = rs.getInt("id_destino");
        Ciudad destino = ciudadData.obtenerCiudadPorId(idDestino);
        LocalTime duracionEstimada = rs.getTime("duracion_estimada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Ruta ruta = new Ruta(idRuta, origen, destino, duracionEstimada, estado);
        rutas.add(ruta);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(rutas);

    return rutas;
  }

  public Ruta obtenerRutaPorId(int id) {
    Ruta ruta = null;

    try {
      String sql = "SELECT * FROM ruta WHERE id_ruta = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        int idRuta = rs.getInt("id_ruta");
        int idOrigen = rs.getInt("id_origen");
        Ciudad origen = ciudadData.obtenerCiudadPorId(idOrigen);
        int idDestino = rs.getInt("id_destino");
        Ciudad destino = ciudadData.obtenerCiudadPorId(idDestino);
        LocalTime duracionEstimada = rs.getTime("duracion_estimada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        ruta = new Ruta(idRuta, origen, destino, duracionEstimada, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return ruta;
  }

  public List<Ruta> obtenerRutasPorOrigen(Ciudad ciudad) {
    List<Ruta> rutas = new ArrayList<>();
    int id = ciudad.getIdCiudad();

    try {
      String sql = "SELECT * FROM ruta WHERE id_origen = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idRuta = rs.getInt("id_ruta");
        int idOrigen = rs.getInt("id_origen");
        Ciudad origen = ciudadData.obtenerCiudadPorId(idOrigen);
        int idDestino = rs.getInt("id_destino");
        Ciudad destino = ciudadData.obtenerCiudadPorId(idDestino);
        LocalTime duracionEstimada = rs.getTime("duracion_estimada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Ruta ruta = new Ruta(idRuta, origen, destino, duracionEstimada, estado);
        rutas.add(ruta);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    Collections.sort(rutas);

    return rutas;
  }

  public List<Ruta> obtenerRutasPorDestino(Ciudad ciudad) {
    List<Ruta> rutas = new ArrayList<>();
    int id = ciudad.getIdCiudad();

    try {
      String sql = "SELECT * FROM ruta WHERE id_destino = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idRuta = rs.getInt("id_ruta");
        int idOrigen = rs.getInt("id_origen");
        Ciudad origen = ciudadData.obtenerCiudadPorId(idOrigen);
        int idDestino = rs.getInt("id_destino");
        Ciudad destino = ciudadData.obtenerCiudadPorId(idDestino);
        LocalTime duracionEstimada = rs.getTime("duracion_estimada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Ruta ruta = new Ruta(idRuta, origen, destino, duracionEstimada, estado);
        rutas.add(ruta);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return rutas;
  }

  public Ruta obtenerRutaPorOrigenDestino(Ciudad ciudadOrigen, Ciudad ciudadDestino) {
    Ruta ruta = null;

    int idCiudadOrigen = ciudadOrigen.getIdCiudad();
    int idCiudadDestino = ciudadDestino.getIdCiudad();

    try {
      String sql = "SELECT * FROM ruta WHERE id_origen = ? AND id_destino = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, idCiudadOrigen);
      ps.setInt(2, idCiudadDestino);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        int idRuta = rs.getInt("id_ruta");
        int idOrigen = rs.getInt("id_origen");
        Ciudad origen = ciudadData.obtenerCiudadPorId(idOrigen);
        int idDestino = rs.getInt("id_destino");
        Ciudad destino = ciudadData.obtenerCiudadPorId(idDestino);
        LocalTime duracionEstimada = rs.getTime("duracion_estimada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        ruta = new Ruta(idRuta, origen, destino, duracionEstimada, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return ruta;
  }

  public boolean crearRuta(Ruta ruta) {
    boolean exito = false;

    try {
      String sql = "INSERT INTO ruta( id_origen, id_destino, duracion_estimada) VALUES (?,?,?);";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, ruta.getOrigen().getIdCiudad());
      ps.setInt(2, ruta.getDestino().getIdCiudad());
      ps.setString(3, ruta.getDuracionEstimada().toString());

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

  public boolean modificarRuta(Ruta ruta) {
    boolean exito = false;

    try {
      String sql = "UPDATE ruta SET id_origen = ?, id_destino = ?, duracion_estimada = ?, estado = ? WHERE id_ruta = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, ruta.getOrigen().getIdCiudad());
      ps.setInt(2, ruta.getDestino().getIdCiudad());
      ps.setString(3, ruta.getDuracionEstimada().toString());
      ps.setBoolean(4, ruta.isEstado());
      ps.setInt(5, ruta.getIdRuta());

      int filas = ps.executeUpdate();

      if (filas > 0) {
        exito = true;
      }

      // Actualiza la hora de llegada de la tabla horario
      HorarioData horarioData = new HorarioData();
      List<Horario> horarios = horarioData.obtenerHorariosPorIdRuta(ruta.getIdRuta());
      for (Horario horario : horarios) {
        LocalTime horaSalida = horario.getHoraSalida();
        LocalTime horaLlegada = horaSalida.plusHours(ruta.getDuracionEstimada().getHour()).plusMinutes(ruta.getDuracionEstimada().getMinute()).plusSeconds(ruta.getDuracionEstimada().getSecond());
        horario.setHoraLlegada(horaLlegada);
        horarioData.modificarHorario(horario);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return exito;
  }

  public boolean borrarRuta(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE ruta SET estado = 0 WHERE id_ruta = ?;";
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
