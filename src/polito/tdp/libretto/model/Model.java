package polito.tdp.libretto.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List <Esame> esami;
	
	public Model(){
		this.esami= new LinkedList <Esame>();
	}
	/**
	 * aggiunge un esame all'elenco degli esami presenti
	 * verificando che non ci sia già
	 * @param e
	 */
	public boolean addEsame(Esame e){
		if (!esami.contains(e)){  //funzione perchè ho implementato equals in esame!!
			esami.add(e);
			return true;          //se l'operazione è andata buon fine
		}else
			return false;		 // se l'operazione non è andata a buon fine
	 
	}
	/**
	 * ricerca se esiste un esame col codice specificato
	 * se esiste restituisce l'esame
	 * se non esiste restituisce nulll
	 * @param codice esame da ricercare
	 * @return l'esame trovato oppure null
	 */
	public Esame trovaEsame (String codice){
		int pos = esami.indexOf(new Esame (codice, null, null));
		if (pos==-1)
			return null;
		else
			return esami.get(pos);
	}

}
