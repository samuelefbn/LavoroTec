/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progetto.iniziale;


/**
* @brief Classe main
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		JCliente cliente = new JCliente();
		
		cliente.registra(nome, cognome, indirizzo, email, password, nascita, telefono);
		cliente.aggiungiArticolo(articolo);
		cliente.ordina();
		
		//Extra
		cliente.annullaOrdine();
		
    }

}
