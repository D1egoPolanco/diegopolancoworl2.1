/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author Diego Polanco
 */
public class sayayingrazabuilder extends razabuilder {
    @Override
    public void buildVida (){
        Raza.setVida(100);
        
    }
    @Override
    public void buildFortaleza(){
    Raza.setFortaleza("ataca mas fuerte pero tiene poca vida");
}
    @Override
    public void buildVelConstruc(){
        Raza.setVelconstruccion (1);
    }
    @Override
    public void buildNombre (){
        Raza.setNombre("goku y sus amigos");
    }
}
