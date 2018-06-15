/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartel;

/**
 *
 * @author Diego Polanco
 */
public class nivel1cuartelbuilder extends cuartelbuilder {

    @Override
    public void BuildVida() {
        Cuartel.setVida(1000);    }

    @Override
    public void BuildNombre() {
    Cuartel.setNombre("Generador de guerreros");
    }

    @Override
    public void BuildTropasxturno() {
       Cuartel.setTropasxturno(1000);  }

    @Override
    public void BuildOro() {
        Cuartel.setOro(1000);   }

    @Override
    public void BuildElixir() {
       Cuartel.setElixir(1000);  }

    @Override
    public void BuildDark() {
        Cuartel.setDark(0);    }

    @Override
    public void BuildNombretropa() {
        Cuartel.setNombretropa("soldados");
    }
    
}
