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
public abstract class razabuilder {
    protected razas Raza;
    public razas getrazas (){
       return Raza; 
}
    public void crearnuevaraza(){
        Raza= new razas ();
    }
    public abstract void buildVida();
    public abstract void buildFortaleza();
    public abstract void buildVelConstruc();
    public abstract void buildNombre();
}
