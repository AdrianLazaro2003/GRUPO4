package BussinessObject;

import java.util.List;
import javax.swing.JOptionPane;
import DAO.CitaDAO;
import DTO.CitaDTO;

public class Cita {
    
    private CitaDAO citaDAO;
    private CitaDTO citaDTO;
    
    public Cita() {
        citaDAO = new CitaDAO();
    }
    
    public List<CitaDTO> listar() {
        if (citaDAO.listar() != null) {
            List<CitaDTO> lista = citaDAO.listar();
            return lista;
        }
        return null;
    }
}
