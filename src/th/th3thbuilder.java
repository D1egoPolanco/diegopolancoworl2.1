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
public class th3thbuilder extends thbuilder{

    @Override
    public void buildVida() {
    TH.setVida(9000);
    }
  
 
    @Override
    public void buildNombre() {
        TH.setNombre("Centro de mando nive 3 "); }

    @Override
    public void buildAlmacenoro() {
        TH.setAlmacenoro(20000);
                }

    @Override
    public void buildAlmacenelixir() {
        TH.setAlmacenelixir(15000); }

    @Override
    public void buildAlmacendar() {
       
    TH.setAlmacendark(9000);
    }
    @Override
    public void buildVelConstruc() {
        TH.setVelconstruccion(2);
                }

    @Override
    public void buildoro() {
        TH.setOro(1100);  }

    @Override
    public void buildelixir() {
        TH.setElixir(1100);  }

    @Override
    public void builddark() {
       TH.setDark(6000);   }
    
}