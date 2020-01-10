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
public abstract class Vehiculo implements Comparable<Vehiculo>{
    
    public String marca;
    public String modelo;
    public double precio;
    DecimalFormat df=new DecimalFormat("#,###,##0.00");

   
    
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Precio: "+df.format(getPrecio());
    }
    @Override
    public int compareTo(Vehiculo e){
        if(e.getPrecio()>precio){
            return -1;
        }else if(e.getPrecio()>precio){
            return 0;
        }else{
            return 1;
        }


    
    }
    
    
}
