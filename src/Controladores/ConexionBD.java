package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=PostaMedica;trustServerCertificate=true;";
    private static final String username = "Grupo04";
    private static final String password = "134330";
    private static Connection conn = null;

public static Connection conectar() {
    try {
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("¡Conexión establecida con éxito!");
    } catch (SQLException e) {
        System.out.println("Error al conectar a la base de datos: " + e.getMessage());
    }
    return conn;
}

    public static void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
