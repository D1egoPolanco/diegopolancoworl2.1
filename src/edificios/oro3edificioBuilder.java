/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author Diego Polanco
 */
public class oro3edificioBuilder extends edificiosbuilder{
    @Override
    public void BuildVida (){
        Edificios.setVida(1900);
        
    }
    @Override
    public void BuildNombre (){
        Edificios.setNombre("recolector de oro nivel 3");
            }

    @Override
    public void BuilRazaConstructora() {
        Edificios.setRazaconstructora("LA RAZA QUE CONSTRUYE AQUI");
    }

    @Override
    public void BuildOro() {
       Edificios.setOro(3500);  }

    @Override
    public void BuildElixir() {
       Edificios.setElixir(2500);   }

    @Override
    public void BuildDark() {
       Edificios.setDark(0);  }

    @Override
    public void BuildGenerador() {
       Edificios.setGenerador(3000);}
}
