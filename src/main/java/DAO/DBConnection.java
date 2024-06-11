package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  private final Connection connection;
  private static DBConnection dbCon;
  // Datos de conexión de MySQL/MariaDB
  private final String usuario = "root";
  private final String password = "";
  private final String baseDeDatos = "proyecto_final";
  private final String host = "localhost";
  private final String puerto = "3306";

  private DBConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.err.println("Error en el Driver de MySQL");
      System.err.println(e);
    }
    connection = DriverManager.getConnection("jdbc:mysql://" + usuario + ":" + password + "@" + host + ":" + puerto + "/" + baseDeDatos);
  }

  public static DBConnection getInstance() {
    if (dbCon == null) {
      try {
        dbCon = new DBConnection();
      } catch (SQLException e) {
        System.err.println(e);
      }
    }
    return dbCon;
  }

  public Connection getConnection() {
    return connection;
  }
}
