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
public class directorcuartel {
   private cuartelbuilder CuartelBuilder ;

    public void setCuartelBuilder(cuartelbuilder cb) {
        this.CuartelBuilder = cb;
    }
   public cuartel getCuartel(){
       return CuartelBuilder.getcuartel();
   }
   public void crearcuartel(){
       CuartelBuilder.crearnuevocuartel();
       CuartelBuilder.BuildNombre();
       CuartelBuilder.BuildTropasxturno();
       CuartelBuilder.BuildVida();
       CuartelBuilder.BuildOro();
       CuartelBuilder.BuildElixir();
       CuartelBuilder.BuildDark();
   }
}
