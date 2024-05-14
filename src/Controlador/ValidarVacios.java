
package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ValidarVacios {
    public static boolean validarCampoLleno(JTextField campo, String nombreCampo) {
        if (campo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validarTodosLosCamposLlenos(JTextField... campos) {
        for (JTextField campo : campos) {
            if (!validarCampoLleno(campo, campo.getName())) {
                return false; // Si algún campo está vacío, retorna falso
            }
        }
        return true; // Si todos los campos están llenos, retorna verdadero
    }
}
