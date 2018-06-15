/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Diego Polanco
 */
public abstract class vehiculosbuilder {
      protected vehiculos Vehiculos;
    public vehiculos getvehiculo (){
       return Vehiculos; 
}
    public void crearnuevovehiculo(){
       Vehiculos = new vehiculos ();
    }
    public abstract void BuildVida();
    public abstract void BuildNombre();
    public abstract void BuildOro();
    public abstract void BuildElixir();
    public abstract void BuildDark();   

    vehiculos getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
