/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concecionaria;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author PC MASTER
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       
        DecimalFormat df=new DecimalFormat("#,###,##0.00");
        
        Auto auto1 = new Auto(4,"Peugeot","206",200000.00);
        Auto auto2 = new Auto(5,"Peugeot","208",250000.00);
        
        Moto moto1 = new Moto("125c","Honda","Titan",60000.00);
        Moto moto2 = new Moto("160c","Yamaha","YBR",80500.50);
        
        List<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
        
        vehiculos.add(auto1);
        vehiculos.add(moto1);
        vehiculos.add(auto2);
        vehiculos.add(moto2);
        
        for(Vehiculo ve:vehiculos){
        System.out.println(ve);
        
    }
        System.out.println();
  
      
       Vehiculo veMayor=Collections.max(vehiculos, Comparator.comparing(c -> c.getPrecio()));
       System.out.println("Vehículo más caro: "+veMayor.marca+" "+veMayor.getModelo());
      Vehiculo veMenor=Collections.min(vehiculos, Comparator.comparing(c -> c.getPrecio()));
       System.out.println("Vehículo más barato: "+veMenor.marca+" "+veMenor.getModelo());
        
      
     for(Vehiculo ve:vehiculos){
         if(ve.modelo.contains("y")||ve.modelo.contains("Y")){
         System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+ve.marca+" "+ve.modelo+" $"+df.format(ve.precio));
                 }
             }
      System.out.println();
      
     vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
            for(Vehiculo ve:vehiculos){
        System.out.println(ve.marca+" "+ve.modelo);
        
    }
   
    
    }
    
}
