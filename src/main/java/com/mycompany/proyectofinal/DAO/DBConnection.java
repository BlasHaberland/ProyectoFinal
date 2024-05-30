package com.mycompany.proyectofinal.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  private final Connection connection;
  private static DBConnection dbCon;

  private DBConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
      System.err.println("Error en el Driver de MySQL");
      System.err.println(ex);
    }
    connection = DriverManager.getConnection("jdbc:mysql://root:@localhost:3306/proyecto_final"); // Cadena de conexión a la base de datos
  }

  public static DBConnection getInstance() {
    if (dbCon == null) {
      try {
        dbCon = new DBConnection();
      } catch (SQLException ex) {
        System.err.println("Error en MySQL");
        System.err.println(ex);
      }
    }
    return dbCon;
  }

  public Connection getConnection() {
    return connection;
  }
}
