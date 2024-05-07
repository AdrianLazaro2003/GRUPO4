/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.agendar;
import vista.citas;
import vista.dashboard;
import vista.doctores;
import vista.especialidades;
import vista.menuSidebar;

public class controladorSidebar implements  ActionListener, MouseListener, KeyListener {

    private menuSidebar vista;
    
//    esta es una nueva linea
//      esta es otra linea
    public controladorSidebar(menuSidebar vista){
        this.vista = vista;
        
        vista.BTN_DASHBOARD.addMouseListener(this);
        vista.BTN_ESPECIALIDAD.addMouseListener(this);
        vista.BTN_CITAS.addMouseListener(this);
        vista.BTN_DOCTORES.addMouseListener(this);
        vista.BTN_AGENDAR.addMouseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.BTN_DASHBOARD) {
            dashboard dash = new  dashboard();
            vista.ventanaInicial.removeAll();
            vista.ventanaInicial.add(dash).setVisible(true);
        }else if (e.getSource() == vista.BTN_ESPECIALIDAD) {
            especialidades espe = new especialidades();
            vista.ventanaInicial.removeAll();
            vista.ventanaInicial.add(espe).setVisible(true);
        }else if (e.getSource() == vista.BTN_CITAS) {
            citas cita = new citas();
            vista.ventanaInicial.removeAll();
            vista.ventanaInicial.add(cita).setVisible(true);
        }else if (e.getSource() == vista.BTN_DOCTORES) {
            doctores doctor = new doctores();
            vista.ventanaInicial.removeAll();
            vista.ventanaInicial.add(doctor).setVisible(true);
        }else if (e.getSource() == vista.BTN_AGENDAR) {
            agendar agen = new agendar();
            vista.ventanaInicial.removeAll();
            vista.ventanaInicial.add(agen).setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
