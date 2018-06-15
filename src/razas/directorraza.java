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
public class directorraza {
    private razabuilder RazaBuilder;
    
    public void setRazaBuilder (razabuilder rb){
        RazaBuilder= rb;
            }
    public razas getRaza(){
        return RazaBuilder.getrazas();
            }
    public void crearRaza(){
        RazaBuilder.crearnuevaraza();
        RazaBuilder.buildFortaleza();
        RazaBuilder.buildNombre();
        RazaBuilder.buildVelConstruc();
        RazaBuilder.buildVida();
    }
    
    
}
