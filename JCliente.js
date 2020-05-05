
/**
* @brief classe JCliente
* contiene tutti gli attributi e i metodi di un oggetto JCliente
*/
public class JCliente {

	/* Attributi */
    private String nome;
	private String cognome;
	private String indirizzo;
	private String email;
	private String password;
	private Date nascita;
	private Integer punti_fedelta;
	private String preferenze_prodotti;
	private Integer slot_occupati;
	private Integer telefono;
	private JLista listaSpesa;
	
	/* Metodi */
	
	/**
	* @brief costruttore senza parametri
	*/
	public JCliente(){}
	
	/**
	* @brief registra il cliente con tutti gli attributi necessari
	*/
	public void registra(String nome, String cognome, String indirizzo, String email, String password, Date nascita, Integer telefono){}
	
	/**
	* @brief ordina i clienti
	*/
	public void ordina(){}
	
	/**
	* @brief annulla l'ordine del cliente
	*/
	public void annullaOrdine(){}
	
	/**
	* @brief aggiunge un articolo al carrello
	*/
	public void aggiungiArticolo(JArticolo articolo){}
	
	/**
	* @brief aggiorna le stime 
	*/
	public void aggiornaStime(){}
}
