
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
    private Integer punti_fedelta;
    private String preferenze_prodotti;
    private Integer telefono;
    private JLista listaSpesa;

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
        punti_fedelta=0;
        preferenze_prodotti="";
        telefono=0;
        listaSpesa= JLista();
        
        
    }

    public JCliente(String nome, String cognome, String email, String password, Date nascita, String preferenze_prodotti, Integer telefono, JLista listaSpesa) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.nascita = nascita;
        this.preferenze_prodotti = preferenze_prodotti;
        this.telefono = telefono;
        this.listaSpesa = listaSpesa;
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

    public Integer getPunti_fedelta() {
        return punti_fedelta;
    }

    public void setPunti_fedelta(Integer punti_fedelta) {
        this.punti_fedelta = punti_fedelta;
    }

    public String getPreferenze_prodotti() {
        return preferenze_prodotti;
    }

    public void setPreferenze_prodotti(String preferenze_prodotti) {
        this.preferenze_prodotti = preferenze_prodotti;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public JLista getListaSpesa() {
        return listaSpesa;
    }

    public void setListaSpesa(JLista listaSpesa) {
        this.listaSpesa = listaSpesa;
    }

}
