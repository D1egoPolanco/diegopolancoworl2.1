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
public abstract class edificiosbuilder {
    protected edificios Edificios;
    public edificios getedificios (){
       return Edificios; 
}
    public void crearnuevoedificio(){
        Edificios= new edificios ();
    }
    public abstract void BuildVida();
    public abstract void BuildNombre();
    public abstract void BuilRazaConstructora();
    public abstract void BuildOro();
    public abstract void BuildElixir();
    public abstract void BuildDark();
    public abstract void BuildGenerador();
}
