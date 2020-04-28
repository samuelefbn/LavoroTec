package progetto.iniziale;

import java.util.ArrayList;
import java.util.Date;

/**
* @brief classe JDipendente
*/
public class JDipendente {

	/* Attributi */
    private String nome;
	private String cognome;
	private String indirizzo;
	private String email;
	private String password;
	private Date nascita;
	private Integer telefono;
	private ArrayList<JArticolo> magazzino;
	
	/* Metodi */
	public JDipendente(String nome, String cognome, String indirizzo, String email, String password, Integer telefono, ArrayList<JArticolo> magazzino){}
	public void inserisciArticolo(JArticolo articolo){}
	public void rimuoviArticolo(JArticolo articolo){}
	public void aggiornaInfo(JArticolo articolo){}
}