package progetto.iniziale;

import java.util.ArrayList;


/**
* @brief classe JLista
*/
public class JLista {

	/**
         * @brief stringa contenente il nome del cliente
         */
        private String nomeCliente;
        
	/**
         * @brief stringa contenente il cognome del cliente
         */
	private String cognomeCliente;
        
        
	/**
         * @brief stringa contenente l'indirizzo del cliente
         */
	private String indirizzoCliente;
                
	/**
         * @brief intero contenente il numero di telefono del cliente
         */
	private Integer telefonoCliente;
        
        /**
         * @brief Oggetto \c ArrayList contenente l'elenco degli articoli
         */
	private ArrayList<JArticolo> lista;
        
        /**
         * @brief Booleano che indica se è presente la consegna a domicilio
         */
	private Boolean consegnaDomicilio;
	
	/**
         * @brief Costruttore con parametri
         * @param nomeCliente stringa contenente il nome del cliente
         * @param cognomeCliente stringa contenente il cognome del cliente
         * @param indirizzoCliente stringa contenete l'indirizzo del cliente
         * @param telefonoCliente intero contenente il telefono del cliente
         * @details Imposta il valore degli attributi \c nomeCliente, 
         *          \c cognomeCliente, \c indirizzoCliente e \c telefonoCliente
         */
	public JLista(String nomeCliente, String cognomeCliente, String indirizzoCliente, Integer telefonoCliente){}
        
        /**
         * @brief Inserisce un articolo nella lista
         * @param articolo oggetto \c JArticolo conenente il valore da inserire
         * @details Inserisce l'articolo dato come parametro nella lista
         */
	public void pushArticolo(JArticolo articolo){}
        
        /**
         * @brief Rimuove ultimo articolo presente nella lista
         * @details Il metodo rimuove l'ultimo articolo dalla lista
         */
	public void popArticolo(){}
        
        /**
         * @brief Rimuove un articolo specifico dalla lista
         * @param articolo oggetto \c JArticolo contenente l'articolo da rimuovere
         * @details Rimuove un determinato articolo dalla lista utilizzando il
         *          parametro
         */
	public void rimuoviArticolo(JArticolo articolo){}
        
        /**
         * @brief Cerca un articolo nella lista in base al nome
         * @param nome stringa contenente il nome dell'articolo da cercare
         * @return oggetto \c JArticolo contenente l'articolo trovato nella lista
         */
	public JArticolo cercaArticolo(String nome){}
}