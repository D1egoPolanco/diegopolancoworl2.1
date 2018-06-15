/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th;

/**
 *
 * @author Diego Polanco
 */
public class th1thbuilder extends thbuilder{

    @Override
    public void buildVida() {
    TH.setVida(5000);
    }
  
 
    @Override
    public void buildNombre() {
        TH.setNombre("Centro de mando nivel "); }

    @Override
    public void buildAlmacenoro() {
        TH.setAlmacenoro(10000);
                }

    @Override
    public void buildAlmacenelixir() {
        TH.setAlmacenelixir(5000); }

    @Override
    public void buildAlmacendar() {
       
    TH.setAlmacendark(3000);
    }
    @Override
    public void buildVelConstruc() {
        TH.setVelconstruccion(0);
                }

    @Override
    public void buildoro() {
        TH.setOro(5000);  }

    @Override
    public void buildelixir() {
        TH.setElixir(2500);  }

    @Override
    public void builddark() {
       TH.setDark(1250);   }
    
}
