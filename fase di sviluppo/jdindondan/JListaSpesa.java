/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdindondan;

/**
 *
 * @author menga_francesco
 */
public class JListaSpesa{
    
     /**
      * @brief Array di oggetti \c JSpesa contenente le liste della spesa
      */
     public JSpesa[] lista;
     /**
      * @brief Intero contenente il numero di elementi
      */
     public int numEl;
     
     /**
      * @brief Costruttore di default
      * @details Inizializza l'attributo \c numEl a 0
      */
     public JListaSpesa(){
         numEl=0;
     }
     
     /**
      * @brief metodo che inserisce un oggetto \c JSpesa nel vettore
      */
     public void push(JSpesa nuova){
         lista[numEl]=nuova;
         numEl++;
     }
     /**
      * @brief metodo che rimuove l'ultimo elemento dell'attributo \c vettore
      */
     public void pop(){
         if(numEl>0){
             numEl--;
         }
     }
     /**
      * @brief Metodo che aggiorna un oggetto \c JSpesa dalla lista
      * @param aggiornata oggetto \c JSpesa contenente la lista aggiornata
      * @param indice intero contenente la posizione della lista da aggiornare 
      */
     public void modifica(JSpesa aggiornata, int indice){
         if(indice<=numEl  && numEl>0){
             lista[indice]=aggiornata;
         }
     }
     /**
      * @brief Metodo che ritorna oggetto \c JLista ad una certa posizione
      * @param indice intero contenente la posizione della lista
      * @return oggetto \c JSpesa contenente la spesa cercata
      */
     public JSpesa getElement(int indice){
         if(indice<=numEl && numEl>0){
             return lista[indice];
         }
         else
             return null;
     }
     /**
      * @brief Metodo che ritorna l'attributo \c numEl
      * @return intero contenente il valore di \c numEl
      */
     public int getNumEl() {
        return numEl;
     }
     
     
     
     
}
