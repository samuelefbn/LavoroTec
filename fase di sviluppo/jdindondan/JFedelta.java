/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.ArrayList;
/**
 *
 * @author Fabiano
 */
public class JFedelta /*:: JCLiente*/{
   private String nome;
   private String cognome;
   private String codice;
   private float punti;
   JFedelta(String nome, String cognome){
           this.nome = nome;
           this.cognome = cognome;
           punti = 0;
           codice = "12345678";
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public float getPunti() {
        return punti;
    }

    public void setPunti(float punti) {
        this.punti = punti;
    }
        public void pushPunti(/*JCliente numeroCarta*/float PuntiDaDggiungere){
        float punti = 0 /*getPunti_fedelta*/;// get ereditata dal JCliente
        punti += PuntiDaDggiungere;
        
        }
	public void rimuoviPunti(/*JCliente numeroCarta*/float PuntiDatogliere){
         float punti = 0;// get ereditata dal JCliente
        punti -= PuntiDatogliere;
        
        
        }
	public void VisualizzaPunti(/*JCliente numeroCarta*/){
             System.out.print(punti);
        }  
}


