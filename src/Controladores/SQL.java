package Controladores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {

    public static void main(String[] args) {
        // Datos de conexión
       String url = "jdbc:sqlserver://localhost:1433;databaseName=PostaMedica;trustServerCertificate=true;";


        String username = "Grupo04";
        String password = "134330";

        // Intento de conexión
        try {
            // Cargar el driver de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("¡Conexión establecida con éxito!");
            
            // Cierra la conexión
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC de SQL Server: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
        }
    }
}
