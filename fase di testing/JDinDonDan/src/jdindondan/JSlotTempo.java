/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.Date;

/**
 *
 * @author Coso
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

}
