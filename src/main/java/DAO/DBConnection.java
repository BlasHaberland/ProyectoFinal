package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  private final Connection connection;
  private static DBConnection dbCon;

  private DBConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.err.println("Error en el Driver de MySQL");
      System.err.println(e);
    }
    connection = DriverManager.getConnection("jdbc:mysql://root:@localhost:3306/proyecto_final"); // Cadena de conexión a la base de datos
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
