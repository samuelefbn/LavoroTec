package progetto.iniziale;

import java.util.Date;

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
    private JCartaFedelta punti_fedelta;
    private JArticoli preferenze_prodotti;
    private String telefono;

    /* Metodi */
    /**
     * @brief costruttore senza parametri
     */
    public JCliente() {
        nome="";
        cognome="";
        indirizzo="";
        email="";
        password="";
        nascita= new Date();
        punti_fedelta=JCartaFedelta();
        preferenze_prodotti=JArticoli();
        telefono="";
        
        
    }

    public JCliente(String nome, String cognome, String email, String password, Date nascita, JArticoli preferenze_prodotti, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.nascita = nascita;
        this.preferenze_prodotti = preferenze_prodotti;
        this.telefono = telefono;
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
        return punti_fedelta;
    }

    public void setPunti_fedelta(JCartaFedelta punti_fedelta) {
        this.punti_fedelta = punti_fedelta;
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

}


