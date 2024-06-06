package DAO;

import Modelos.Horario;
import Modelos.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HorarioData {

  private final Connection connection;
  private final RutaData rutaData;

  public HorarioData() {
    DBConnection instance = DBConnection.getInstance();
    this.connection = instance.getConnection();
    this.rutaData = new RutaData();
  }

  public List<Horario> obtenerHorarios() {
    List<Horario> horarios = new ArrayList<>();

    try {
      String sql = "SELECT * FROM horario;";
      Statement st = this.connection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
        int idHorario = rs.getInt("id_horario");
        int idRuta = rs.getInt("id_ruta");
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalTime horaSalida = rs.getTime("hora_salida").toLocalTime();
        LocalTime horaLlegada = rs.getTime("hora_llegada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Horario horario = new Horario(idHorario, ruta, horaSalida, horaLlegada, estado);
        horarios.add(horario);
      }

      st.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
    return horarios;
  }

  public Horario obtenerHorarioPorId(int id) {
    Horario horario = null;

    try {
      String sql = "SELECT * FROM horario WHERE id_horario = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        int idHorario = rs.getInt("id_horario");
        int idRuta = rs.getInt("id_ruta");
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalTime horaSalida = rs.getTime("hora_salida").toLocalTime();
        LocalTime horaLlegada = rs.getTime("hora_llegada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        horario = new Horario(idHorario, ruta, horaSalida, horaLlegada, estado);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return horario;
  }

  public List<Horario> obtenerHorariosPorIdRuta(int id) {
    List<Horario> horarios = new ArrayList<>();

    try {
      String sql = "SELECT * FROM horario WHERE id_ruta = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idHorario = rs.getInt("id_horario");
        int idRuta = rs.getInt("id_ruta");
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalTime horaSalida = rs.getTime("hora_salida").toLocalTime();
        LocalTime horaLlegada = rs.getTime("hora_llegada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Horario horario = new Horario(idHorario, ruta, horaSalida, horaLlegada, estado);
        horarios.add(horario);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return horarios;
  }

  public List<Horario> obtenerHorariosActivosPorIdRuta(int id) {
    List<Horario> horarios = new ArrayList<>();

    try {
      String sql = "SELECT * FROM horario WHERE estado = 1 AND id_ruta = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idHorario = rs.getInt("id_horario");
        int idRuta = rs.getInt("id_ruta");
        Ruta ruta = this.rutaData.obtenerRutaPorId(idRuta);
        LocalTime horaSalida = rs.getTime("hora_salida").toLocalTime();
        LocalTime horaLlegada = rs.getTime("hora_llegada").toLocalTime();
        boolean estado = rs.getBoolean("estado");

        Horario horario = new Horario(idHorario, ruta, horaSalida, horaLlegada, estado);
        horarios.add(horario);
      }

      ps.close();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return horarios;
  }

  public boolean crearHorario(Horario horario) {
    boolean exito = false;

    try {
      String sql = "INSERT INTO horario( id_ruta, hora_salida, hora_llegada) VALUES (?,?,?);";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, horario.getRuta().getIdRuta());
      ps.setString(2, horario.getHoraSalida().toString());
      ps.setString(3, horario.getHoraLlegada().toString());

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

  public boolean modificarHorario(Horario horario) {
    // TODO (Blas): La hora de llegada no debe setearse directamente. Debería obtener
    // la duración de la ruta y, a partir de esa duración y del horario de
    // salida, setear la hora de llegada.

    boolean exito = false;

    try {
      String sql = "UPDATE horario SET id_ruta = ?, hora_salida = ?, hora_llegada = ?, estado = ? WHERE id_horario = ?;";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, horario.getRuta().getIdRuta());
      ps.setString(2, horario.getHoraSalida().toString());
      ps.setString(3, horario.getHoraLlegada().toString());
      ps.setBoolean(4, horario.isEstado());
      ps.setInt(5, horario.getIdHorario());

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

  public boolean borrarHorario(int id) {
    boolean exito = false;

    try {
      String sql = "UPDATE horario SET estado = 0 WHERE id_horario = ?;";
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
