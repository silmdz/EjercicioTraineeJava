/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concecionaria;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author PC MASTER
 */
public class Auto extends Vehiculo {
    
    public int Puerta;
DecimalFormat df=new DecimalFormat("#,###,##0.00");
   

    public Auto(int Puerta, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.Puerta = Puerta;
    }

    public void setPuerta(int Puerta) {
        this.Puerta = Puerta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuerta() {
        return Puerta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Puerta: "+getPuerta()+" // Precio: $"+df.format(getPrecio()); //To change body of generated methods, choose Tools | Templates.
    }

  
    


    
    

}
