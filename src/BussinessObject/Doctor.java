package BussinessObject;

import java.util.List;
import javax.swing.JOptionPane;
import DAO.DoctorDAO;
import DTO.DoctorDTO;

public class Doctor {
    
    private DoctorDAO doctorDAO;
    private DoctorDTO doctorDTO;
    
    public Doctor() {
        doctorDAO = new DoctorDAO();
    }
    
    public List<DoctorDTO> listar() {
        if (doctorDAO.listar() != null) {
            List<DoctorDTO> lista = doctorDAO.listar();
            return lista;
        }
        return null;
    }

   public List<DoctorDTO> buscarPorApellido(String APELLIDO) {
        if (doctorDAO.buscarPorApellido(APELLIDO) != null) {
            List<DoctorDTO> lista = doctorDAO.buscarPorApellido(APELLIDO);
            return lista;
        }
        return null;
    }

}
