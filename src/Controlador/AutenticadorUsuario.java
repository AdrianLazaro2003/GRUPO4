package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.menuSidebar;

public class AutenticadorUsuario {
    public static void autenticarUsuario(String usuario, String contraseña) {
        Connection conn = null;
        try {
            conn = ConexionBD.conectar(); // Establecer conexión
            String query = "SELECT NOMBRE, APELLIDO FROM Recepcionista WHERE CORREO = ? AND CONTRASENA = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, usuario);
            statement.setString(2, contraseña);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String nombreCompleto = rs.getString("NOMBRE") + " " + rs.getString("APELLIDO");
                JOptionPane.showMessageDialog(null, "¡Bienvenido, " + nombreCompleto + "!", "Centro Médico Esperanza", JOptionPane.INFORMATION_MESSAGE);
                menuSidebar.main(null);// Aquí podrías abrir una nueva ventana o realizar alguna otra acción
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            if (conn != null) {
                ConexionBD.cerrarConexion(); // Cerrar conexión
            }
        }
    }
}
