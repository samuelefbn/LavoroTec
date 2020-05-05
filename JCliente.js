
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
	public JCliente(){}
	public void registra(String nome, String cognome, String indirizzo, String email, String password, Date nascita, Integer telefono){}
	public void ordina(){}
	public void annullaOrdine(){}
	public void aggiungiArticolo(JArticolo articolo){}
	public void aggiornaStime(){}
}
