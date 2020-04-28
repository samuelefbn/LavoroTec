package progetto.iniziale;

import java.util.ArrayList;


/**
* @brief classe JLista
*/
public class JLista {

	/* Attributi */
    private String nomeCliente;
	private String cognomeCliente;
	private String indirizzoCliente;
	private Integer telefonoCliente;
	private ArrayList<JArticolo> lista;
	private Boolean consegnaDomicilio;
	
	/* Metodi */
	public JLista(String nomeCliente, String cognomeCliente, String indirizzoCliente, Integer telefonoCliente){}
	public void pushArticolo(JArticolo articolo){}
	public void popArticolo(){}
	public void rimuoviArticolo(JArticolo articolo){}
	public void cercaArticolo(String nome){}
}