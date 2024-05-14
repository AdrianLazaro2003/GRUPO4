package DAO;

import DTO.CitaDTO;
import DataBase.conexion;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CitaDAO implements Crud<CitaDTO>{
    
    PreparedStatement ps;//insert , update, delete
    ResultSet rs; //select
    conexion conex;
    
    public CitaDAO() {
        conex = new conexion();
    }
    
    @Override
    public List<CitaDTO> listar() {
        List<CitaDTO> lista = new ArrayList<>();
        try {
            ps = conex.conectar().prepareStatement("select * from Cita");
            rs = ps.executeQuery();
            while (rs.next()) {
                CitaDTO t = new CitaDTO();
                t.setID_CITA(rs.getInt(1));
                t.setTURNO(rs.getString(2));
                t.setFECHA_CITA(rs.getString(3));
                t.setFECHA_AGENDACION(rs.getString(4));
                t.setHORA(rs.getString(5));
                t.setESTADO(rs.getString(6));
                t.setID_RECEPCIONISTA(rs.getInt(7));
                t.setESPECIALIDAD(rs.getString(8));
                t.setID_PACIENTE(rs.getInt(9));
                t.setNOMBRE_PACIENTE(rs.getString(10));
                t.setAPELLIDO_PACIENTE(rs.getString(11));
                t.setID_DOCTOR(rs.getInt(12));
                t.setNOMBRE_DOCTOR(rs.getString(13));
                t.setAPELLIDO_DOCTOR(rs.getString(14));
                lista.add(t);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            conex.desconectar();
        }
        return lista;
    }

    @Override
    public boolean agregar(CitaDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(CitaDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(CitaDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CitaDTO buscar(CitaDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
