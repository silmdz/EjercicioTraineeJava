/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concecionaria;

import java.text.DecimalFormat;

/**
 *
 * @author PC MASTER
 */
public class Moto extends Vehiculo {
    
    private String cilindrada;
DecimalFormat df=new DecimalFormat("#,###,##0.00");
 

    public Moto(String cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
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

    public String getCilindrada() {
        return cilindrada;
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
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Cilindrada: "+getCilindrada()+" // Precio: $"+df.format(getPrecio()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
