package jdindondan;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriele
 */
public class JCliente {

    /* Attributi */
    private String nome;
    private String cognome;
    private String indirizzo;
    private String email;
    private String password;
    private Date nascita;
    private JCartaFedelta carta_fedelta;
    private JArticoli preferenze_prodotti;
    private String telefono;

    /* Metodi */
    /**
     * @brief costruttore senza parametri
     */
    public JCliente() {
        nome = "";
        cognome = "";
        indirizzo = "";
        email = "";
        password = "";
        nascita = new Date();
        carta_fedelta = new JCartaFedelta();
        preferenze_prodotti = new JArticoli();
        telefono = "";

    }

    public JCliente(String nome, String cognome, String email, String password, Date nascita, JArticoli preferenze_prodotti, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        indirizzo = "";
        this.email = email;
        this.password = password;
        this.nascita = nascita;
        carta_fedelta = new JCartaFedelta(nome, cognome);
        this.preferenze_prodotti = preferenze_prodotti;
        this.telefono = telefono;
    }

    public JCliente(String nome, String cognome, String email, String password, Date nascita, JCartaFedelta carta_fedelta, JArticoli preferenze_prodotti, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        indirizzo = "";
        this.email = email;
        this.password = password;
        this.nascita = nascita;
        this.carta_fedelta = carta_fedelta;
        this.preferenze_prodotti = preferenze_prodotti;
        this.telefono = telefono;
    }
    
    public JCliente(String csv) {
        MyFile fileCarte = new MyFile("src/jdindondan/filecsv/fedelta.csv");
        String[] attr = csv.split(",");
        nome = attr[0];
        cognome = attr[1];
        indirizzo = attr[2];
        email = attr[3];
        password = attr[4];
        try {
            this.nascita = new SimpleDateFormat().parse(attr[5]);
        } catch (ParseException ex) {
            Logger.getLogger(JCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String carta = fileCarte.findString(3, attr[6]);
            carta_fedelta = new JCartaFedelta(carta);
        } catch (IOException ex) {
            Logger.getLogger(JCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        //preferenze_prodotti = attr[7]; da fare: jarticoli da csv
        telefono = attr[8];
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNascita() {
        return nascita;
    }

    public void setNascita(Date nascita) {
        this.nascita = nascita;
    }

    public JCartaFedelta getPunti_fedelta() {
        return carta_fedelta;
    }

    public void setPunti_fedelta(JCartaFedelta punti_fedelta) {
        this.carta_fedelta = punti_fedelta;
    }

    public JArticoli getPreferenze_prodotti() {
        return preferenze_prodotti;
    }

    public void setPreferenze_prodotti(JArticoli preferenze_prodotti) {
        this.preferenze_prodotti = preferenze_prodotti;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString() {
        String s = "";
        
        s += nome;
        s += ",";
        s += cognome;
        s += ",";
        s += indirizzo;
        s += ",";
        s += email;
        s += ",";
        s += password;
        s += ",";
        s += nascita.toString();
        s += ",";
        s += carta_fedelta.getCodice();
        s += ",";
        s += telefono;
        
        return s;
    }

}
