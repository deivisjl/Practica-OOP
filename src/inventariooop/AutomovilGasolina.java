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
public class AutomovilGasolina extends Automovil{

    private int stock;
    
    public AutomovilGasolina(String modelo, String color, String potencia) {
        super(modelo, color, potencia);
        this.stock = 0;
    }
    
    @Override
    public void aumentarStock()
    {
        this.stock++;
    }
    
    @Override
    public void disminuirStock()
    {
        if(this.stock > 0){
            this.stock--;   
        }
    }
    
    @Override
    public void mostrarStock(){
        System.out.println("Stock: " + stock);
    }
    
    @Override
    public void getModelo(){
        System.out.println("Vehículo modelo " + modelo);
    }
    
    @Override
    public void getColor(){
        System.out.println("Vehículo color " + color);
    }
    
    @Override
    public void getPotencia(){
        System.out.println("Vehículo con potencia de " + potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Automovil gasolina modelo: " + modelo + " color: " + color + " potencia: " + potencia
        );
    }
    
}
