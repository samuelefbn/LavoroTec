/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabiano
 */
public class JCartaFedelta {
    
    private MyFile fileCarte;

    private String codice;
    private Integer punti;
    private String Nome;
    private String Cognome;

    public JCartaFedelta(Integer punti, String Nome, String Cognome, String codice) {
        fileCarte = new MyFile("src/jdindondan/filecsv/fedelta.csv");
        this.punti = punti;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.codice = codice;

    }

    public JCartaFedelta(String Nome, String Cognome) {
        fileCarte = new MyFile("src/jdindondan/filecsv/fedelta.csv");
        this.Nome = Nome;
        this.Cognome = Cognome;
        punti = 0;
        codice = Long.toString(Math.round(Math.random() * 1000000000));
        try {
            fileCarte.writeString(this.toString());
        } catch (IOException ex) {
            Logger.getLogger(JCartaFedelta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JCartaFedelta() {
        fileCarte = new MyFile("src/jdindondan/filecsv/fedelta.csv");
        punti = 0;
        Nome = "";
        Cognome = "";
        codice = "";
    }

    public Integer getPunti() {
        return punti;
    }

    private void setPunti(Integer punti) {
        this.punti = punti;
    }

    private void AddPunti(JCartaFedelta carta, Integer PuntiAggiungere) {
        Integer PuntiSullaCarta = carta.getPunti();
        PuntiSullaCarta += PuntiAggiungere;
        carta.setPunti(PuntiSullaCarta);

    }
    
    public String getCodice() {
        return codice;
    }
    
    public String toString() {
        String s = "";
        s += punti.toString();
        s += ",";
        s += Nome;
        s += ",";
        s += Cognome;
        s += ",";
        s += codice;
        return s;
    }

}
