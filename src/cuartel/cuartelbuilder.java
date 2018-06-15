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
public abstract class cuartelbuilder {
    protected cuartel Cuartel;
    public cuartel getcuartel(){
        return Cuartel;
       
    }
     public void crearnuevocuartel(){
         Cuartel=new cuartel();
             }
     public abstract void BuildVida();
     public abstract void BuildNombre();
     public abstract void BuildTropasxturno();
     public abstract void BuildOro();
     public abstract void BuildElixir();
     public abstract void BuildDark();
     public abstract void BuildNombretropa();
}
