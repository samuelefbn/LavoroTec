/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

/**
 *
 * @author Fabiano
 */
public class JCartaFedelta {
    private String carta; 
    private Integer punti; 
    private String Nome;
    private String Cognome;
    JCartaFedelta(Integer punti,String Nome,String Cognome,String carta){
        this.punti = punti;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.carta = carta;
        
    }
    
     private Integer getPunti(){
     return punti;
     }
      private void setPunti(Integer punti){
         this.punti=punti;    
     }

 
    
         private void AddPunti(JCartaFedelta carta ,Integer PuntiAggiungere){ 
         Integer PuntiSullaCarta = carta.getPunti();
         PuntiSullaCarta +=  PuntiAggiungere; 
         carta.setPunti(PuntiSullaCarta);
       
    }
    
}


