/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirola
 */
public class JSlotsTempo {
    private List<JSlotTempo> v;
    
    public JSlotsTempo() {
        v = new ArrayList<>();
    }
    
    public JSlotsTempo(List<String> fromFile) {
        v = new ArrayList<>();
        for (int i = 0; i < fromFile.size(); i++) {
            v.add(new JSlotTempo(fromFile.get(i)));
        }
    }
    
    public void salvaSuFile() {
        for (int i = 0; i < v.size(); i++) {
            try {
                Global.fileSlot.writeString(v.get(i).toString());
            } catch (IOException ex) {
                Logger.getLogger(JSlotsTempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    public Date stimaTempo(Date d) {
        while (getClientiOrario(d) >= 4) //capienza massima: 4 CLIENTI
            d = new Date(d.getTime() + 60 * 1000); //slitta avanti 1 minuto
        
        return d;
    }
    
    public Integer getClientiOrario(Date d) {
        Integer nClienti = 0;
        for (int i = 0; i < v.size(); i++) {
            if (d.after(v.get(i).getDataOraInizio()) && d.before(v.get(i).getDataOraFine())) {
                nClienti++;
            }
        }
        return nClienti;
    }
    
    public void addSlotPagamento(JCliente c, Date d) {
        v.add(new JSlotTempo(c, stimaTempo(d), 5.0f)); //5 minuti
    }
    
    public void addSlotSpesa(JCliente c, Date d) {
        v.add(new JSlotTempo(c, stimaTempo(d), 45.0f)); //45 minuti
    }
    
    public void modificaOrario(JSlotTempo s, Date d) {
        v.set(v.indexOf(s), new JSlotTempo(s.getClientePrenotato(), stimaTempo(d), s.getDurata()));
    }
    
    public List<JSlotTempo> getCopy() {
        return v;
    }
}
