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
public class directorvehiculo {
    private vehiculosbuilder VehiculoBuilder;
      public void setVehiculoBuilder (vehiculosbuilder vb){
        VehiculoBuilder= vb;
            }
    public vehiculos getVehiculo(){
        return VehiculoBuilder.getVehiculo();
            }
    public void crearRaza(){
        VehiculoBuilder.crearnuevovehiculo();
        VehiculoBuilder.BuildVida();
        VehiculoBuilder.BuildNombre();
        VehiculoBuilder.BuildOro();
        VehiculoBuilder.BuildElixir();
        VehiculoBuilder.BuildDark();
    }
            
}
