/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

/**
 *
 * @author Coso
 */
public class JArticolo {
    private String nome;
    private String descrizione;
    private String codiceBarre;
    private Float prezzo;

    public JArticolo(String nome, String descrizione, String codiceBarre, Float prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCodiceBarre(String codiceBarre) {
        this.codiceBarre = codiceBarre;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }
}
