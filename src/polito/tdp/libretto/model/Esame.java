package polito.tdp.libretto.model;

import java.time.LocalDate;

/**
 * oggetto semplice che contiene i dati relativi ad un singolo esame.
 * dati provati (propriet�)
 * metodi getter e setter
 * metodi di servizio (toString, equals, hashCode, compareTo)
 * @author Rebecca
 *
 */

public class Esame {
	private String codice;
	private String titolo;
	private String docente;
	//private Docente docente;
	private boolean superato;
	private int voto;
	private LocalDate dataSuperamento;
	
	/**
	 * Nuovo esame
	 * @param codice: codice esame
	 * @param titolo: nome corso
	 * @param docente: cognome nome docente titolare del corso
	 */
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		
		this.superato=false;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}

	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}

	/**
	 * @return the superato
	 */
	public boolean isSuperato() {
		return superato;
	}

	/**
	 * @param superato the superato to set
	 */
	private void setSuperato(boolean superato) {
		this.superato = superato;
	}

	/**
	 * restituisce il voto solo se l'esame � stato superato
	 * altrimenti ECCEZIONE
	 * @return the voto
	 */
	public int getVoto() {
		if (this.superato){
			return voto;
		}
		else{
			throw new IllegalStateException("Esame non ancora superato");
			}
			
	}

	/**
	 * @param voto the voto to set
	 */
	private void setVoto(int voto) {
		this.voto = voto;
	}

	/**
	 * @return the dataSuperamento
	 */
	public LocalDate getDataSuperamento() {
		if (this.superato){
		return dataSuperamento;
		}
		else{
			throw new IllegalStateException("Esame non ancora superato");
			}
	}

	/**
	 * @param dataSuperamento the dataSuperamento to set
	 */
	private void setDataSuperamento(LocalDate dataSuperamento) {
		this.dataSuperamento = dataSuperamento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", superato=" + superato
				+ ", voto=" + voto + ", dataSuperamento=" + dataSuperamento + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {     //due esami sono uguali se hanno lo stesso CODICE
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	/**
	 * se l'esae non � ancora superato , lo considera
	 * superato con il voto e la data specificati.
	 * Se invece � gi� stato superato, genera un'eccezione.
	 * @param voto
	 * @param data
	 */
	public void supera (int voto, LocalDate data){
		if (!this.superato){
			this.superato=true;
			this.voto=voto;
			this.dataSuperamento=data;
		}else {
			throw new IllegalStateException("Esame "+this.codice+" gi� superato");
		}
		
	}

	
	
	
	
	
}
