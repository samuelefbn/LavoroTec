/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirola
 */
public class JSlotTempo {
    private JCliente clientePrenotato;
    private Date dataOraInizio;
    private Float durata; //minuti

    public JCliente getClientePrenotato() {
        return clientePrenotato;
    }

    public void setClientePrenotato(JCliente clientePrenotato) {
        this.clientePrenotato = clientePrenotato;
    }

    public Date getDataOraInizio() {
        return dataOraInizio;
    }

    public void setDataOraInizio(Date dataOraInizio) {
        this.dataOraInizio = dataOraInizio;
    }

    public Float getDurata() {
        return durata;
    }

    public void setDurata(Float durata) {
        this.durata = durata;
    }
    
    public JSlotTempo(JCliente clientePrenotato, Date dataOraInizio, Float durata) {
        this.clientePrenotato = clientePrenotato;
        this.dataOraInizio = dataOraInizio;
        this.durata = durata;
    }
    
    public JSlotTempo(String csv) {
        String[] attr = csv.split(",");
        try {
            clientePrenotato = new JCliente(Global.fileClienti.findString(0, attr[0]));
        } catch (IOException ex) {
            Logger.getLogger(JSlotTempo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataOraInizio = new SimpleDateFormat().parse(attr[1]);
        } catch (ParseException ex) {
            Logger.getLogger(JSlotTempo.class.getName()).log(Level.SEVERE, null, ex);
        }
        durata = Float.parseFloat(attr[2]);
    }
    
    public String toString() {
        return clientePrenotato.getEmail() + "," + dataOraInizio.toString() + "," + durata.toString();
    }
    
    public Date getDataOraFine() {
        return new Date(dataOraInizio.getTime() + durata.longValue() * 60 * 1000);
    }

}
