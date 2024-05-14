package BussinessObject;

import java.util.List;
import javax.swing.JOptionPane;
import DAO.PacienteDAO;
import DTO.PacienteDTO;

public class Paciente {
    
    private PacienteDAO pacienteDAO;
    private PacienteDTO pacienteDTO;
    
    public Paciente() {
        pacienteDAO = new PacienteDAO();
    }
    
    public List<PacienteDTO> listar() {
        if (pacienteDAO.listar() != null) {
            List<PacienteDTO> lista = pacienteDAO.listar();
            return lista;
        }
        return null;
    }
}
