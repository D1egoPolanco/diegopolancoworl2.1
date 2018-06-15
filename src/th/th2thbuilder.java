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
public class th2thbuilder extends thbuilder{

    @Override
    public void buildVida() {
    TH.setVida(7000);
    }
  
 
    @Override
    public void buildNombre() {
        TH.setNombre("Centro de mando nive 2 "); }

    @Override
    public void buildAlmacenoro() {
        TH.setAlmacenoro(15000);
                }

    @Override
    public void buildAlmacenelixir() {
        TH.setAlmacenelixir(10000); }

    @Override
    public void buildAlmacendar() {
       
    TH.setAlmacendark(5000);
    }
    @Override
    public void buildVelConstruc() {
        TH.setVelconstruccion(2);
                }

    @Override
    public void buildoro() {
        TH.setOro(1000);  }

    @Override
    public void buildelixir() {
        TH.setElixir(1000);  }

    @Override
    public void builddark() {
       TH.setDark(3000);   }
    
}
