/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_git;

import javax.swing.JOptionPane;

/**
 *
 * @author ivantc
 */
public class HOLA_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="";
        nombre=JOptionPane.showInputDialog("Dime tu  nombre: ");
        JOptionPane.showMessageDialog(null, "Hola "+nombre+" BIENVENIDO A  GIT HUB");
    }
    
}
