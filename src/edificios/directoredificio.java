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
public class directoredificio {
    private edificiosbuilder EdificioBuilder;

    public void setEdificioBuilder(edificiosbuilder ed) {
        EdificioBuilder = ed;
    }
    
    public edificios getEdificios(){
        return EdificioBuilder.getedificios();
    }
    public void crearedificio(){
        EdificioBuilder.crearnuevoedificio();
        EdificioBuilder.BuildVida();
        EdificioBuilder.BuildNombre();
        EdificioBuilder.BuildOro();
        EdificioBuilder.BuildElixir();
        EdificioBuilder.BuildDark();
        EdificioBuilder.BuilRazaConstructora();
        EdificioBuilder.BuildGenerador();
    }
   
    
}
