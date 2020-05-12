package progetto.iniziale;


/**
* @brief classe JSpesa
*/
public class JSpesa {

	/* Attributi */
    private ArrayList<JArticolo> listaArticoliDisponibili;
	private ArrayList<JArticolo> listArticoliSelezionati;
	
	
	/* Metodi */
	/**
 @brief costruttore vuoto

 */
	JSpesa(){}
	
	/**
 @brief Permette di aggiungere un articolo nella spesa.

 
 @param  selezionato parametro di tipo JArticolo
 
 */
	public void pushArticolo(JAricolo selezionato){}
	
	/**
 @brief Permette di modificare la quantita di  un articolo nella spesa.

 
 @param  selezionato parametro di tipo JArticolo
 
 */
	public void modificaQuantita(JArticolo selezionato){}
	
	/**
 @brief Permette di eliminare un articolo nella spesa.

 
 @param  selezionato parametro di tipo JArticolo
 
 */
	public void eliminaArticolo(JAricolo selezionato){}
	
	/**
 @brief Permette di aggiornare  il costo della spesa, verra richiamato ogni volta che ci sara un inserimento.

 
 @param  prezzo attributo di tipo float, che rappresenta il costo di un articolo
 
 */
	public float aggiornaConto(float prezzo){}
	
	/**
 @brief Permette di inviare un e-mail ogni volta che sara confermato un ordine.

 
 @param  email parametro di tipo string, rappresenta l'email del destinatario della spesa
 
 */
	public void inviaSMS(String email){}
	
	/**
 @brief Permette di modificare qualcosa (articolo,quantita) prima della conferma della spesa.
        Sarà presente un bottone nell'interfaccia grafica, al clik verrà richiamato questo metodo

 

 
 */
	public void modificaSpesa(){} //sara gestito da interfaccia grafica
	
	/**
 @brief Permette di confermare la spesa.
        Sarà presente un bottone nell'interfaccia grafica, al clik verrà richiamato questo metodo

 

 
 */
	public void confermaSpesa(){} //sara gestito da interfaccia grafica
	
	
	/**
 @brief Permette di eliminare totalmente la spesa.
        Sarà presente un bottone nell'interfaccia grafica, al clik verrà richiamato questo metodo

 

 
 */
	public void eliminaSpesa(){} //sara gestito da interfaccia grafica
	
	
	
	
