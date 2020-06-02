/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.Vector;

/**
 *
 * @author Coso
 */
public class JArticoli {
    private Vector<JArticolo> v;

    public JArticoli() {
        v = new Vector<JArticolo>();
    }
    
    public JArticoli(String jsonPath) {
        v = new Vector<JArticolo>();
        //simula import da json
        v.add(new JArticolo("Carote", "Ottime carote arancioni", "874356263", 1.99f));
        v.add(new JArticolo("Patate", "Ottime patate gialle", "4358765234", 0.99f));
        v.add(new JArticolo("Aspirapolvere", "Ottimo aspirapolvere verde", "133252346", 99.99f));
    }
    
    public Vector<JArticolo> getCopy() {
        return v;
    }
    
}
