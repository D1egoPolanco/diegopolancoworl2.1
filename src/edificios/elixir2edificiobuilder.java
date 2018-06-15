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
 public class elixir2edificiobuilder extends edificiosbuilder{
    @Override
    public void BuildVida (){
        Edificios.setVida(1700);
        
    }
    @Override
    public void BuildNombre (){
        Edificios.setNombre("recolector de elixir nivel 2");
            }

    @Override
    public void BuilRazaConstructora() {
        Edificios.setRazaconstructora("LA RAZA QUE CONSTRUYE AQUI");
    }

    @Override
    public void BuildOro() {
        Edificios.setOro(2000);
    }

    @Override
    public void BuildElixir() {
      Edificios.setElixir(3000);    }

    @Override
    public void BuildDark() {
        Edificios.setDark(0);  }

    @Override
    public void BuildGenerador() {
      Edificios.setGenerador(2000);   }
}