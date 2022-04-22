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
public abstract class Automovil {
    
    protected String modelo;
    protected String color;
    protected String potencia;
    
    public Automovil (String modelo, String color, String potencia){
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }
    
    public abstract void aumentarStock();
    public abstract void disminuirStock();
    public abstract void mostrarStock();
    public abstract void getModelo();
    public abstract void getPotencia();
    public abstract void getColor();
    public abstract void mostrarCaracteristicas();
}
