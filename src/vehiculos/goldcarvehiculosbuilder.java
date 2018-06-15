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
public class goldcarvehiculosbuilder extends vehiculosbuilder{
     @Override
    public void BuildVida() {
        Vehiculos.setVida(40000);
            }

    @Override
    public void BuildNombre() {
        Vehiculos.setNombre("Gold CAR");
    }

    @Override
    public void BuildOro() {
        Vehiculos.setOro(2000);
           }

    @Override
    public void BuildElixir() {
        Vehiculos.setElixir(1000);
           }

    @Override
    public void BuildDark() {
        Vehiculos.setDark(0);
    }
    
}
