
package Controladores;

import Interfaz.Login;

public class LoginUser {

    public static void main(String[] args) {
      Login LoginFrame = new Login();
      LoginFrame.setVisible(true);
      LoginFrame.pack();
      LoginFrame.setLocationRelativeTo(null);
    }

    public LoginUser(Class<? extends Login> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
