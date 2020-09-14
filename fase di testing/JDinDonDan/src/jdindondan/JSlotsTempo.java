/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Pirola
 */
public class JSlotsTempo {
    private Vector<JSlotTempo> v;
    
    public JSlotsTempo() {
        v = new Vector<JSlotTempo>();
    }
    
    public Date stimaTempo() {
        return new Date(2020, 06, 02, 16, 0); //mette tutti il 2 giugno alle 4, per ora
    }
    
    public void addSlotPagamento(JCliente c) {
        v.add(new JSlotTempo(c, stimaTempo(), 5.0f)); //5 minuti
    }
    
    public void addSlotSpesa(JCliente c) {
        v.add(new JSlotTempo(c, stimaTempo(), 45.0f)); //45 minuti
    }
    
    public void modificaOrario(JSlotTempo s) {
        v.set(v.indexOf(s), new JSlotTempo(s.getClientePrenotato(), stimaTempo(), s.getDurata())); //"modifica" orario
    }
    
    public Vector<JSlotTempo> getCopy() {
        return v;
    }
}
