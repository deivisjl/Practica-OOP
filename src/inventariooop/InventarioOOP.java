/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariooop;

/**
 *
 * @author deivisjl
 */
public class InventarioOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil BMW = new AutomovilGasolina("2010","azul","3.5cc");
        System.out.println("Automovil BMW");
        BMW.mostrarCaracteristicas();
        BMW.getModelo();
        BMW.getColor();
        BMW.mostrarStock();
        BMW.getPotencia();
        
        System.out.println("");
        BMW.aumentarStock();
        BMW.aumentarStock();
        BMW.mostrarStock();
        BMW.disminuirStock();
        BMW.mostrarStock();
        
        System.out.println("");
        Automovil Toyota = new AutomovilGasolina("2005","rojo","3.0cc");
        System.out.println("Automovil Toyota");
        Toyota.mostrarCaracteristicas();
        Toyota.getModelo();
        Toyota.getColor();
        Toyota.getPotencia();
        Toyota.mostrarStock();
        System.out.println("");
        Toyota.aumentarStock();
        Toyota.aumentarStock();
        Toyota.mostrarStock();
        Toyota.disminuirStock();
        Toyota.disminuirStock();
        Toyota.disminuirStock();
        Toyota.mostrarStock();
    }
    
}
