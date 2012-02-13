package org.ldv.sio.getap.app;

import java.sql.Date;

public class DemandeConsoTempsAccPers {
	private Long id;
	private Integer anneeScolaire;
	private java.sql.Date dateAction;
	private Integer minutes;
	private User prof;
	private Integer idAccPers;
	private Integer idEleve;
	private int etat;

	public DemandeConsoTempsAccPers() {

	}

	public DemandeConsoTempsAccPers(Long id, Integer anneeScolaire, Date date,
	    Integer minutes, User prof, Integer idAccPers, Integer idEleve, int etat) {
		super();
		this.id = id;
		this.anneeScolaire = anneeScolaire;
		this.dateAction = date;
		this.minutes = minutes;
		this.prof = prof;
		this.idAccPers = idAccPers;
		this.idEleve = idEleve;
		this.etat = etat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(Integer anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	public java.sql.Date getDateAction() {
		return dateAction;
	}

	public void setDateAction(java.sql.Date date) {
		this.dateAction = date;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public User getProf() {
		return prof;
	}

	public void setProf(User prof) {
		this.prof = prof;
	}

	public Integer getIdAccPers() {
		return idAccPers;
	}

	public void setIdAccPers(Integer idAccPers) {
		this.idAccPers = idAccPers;
	}

	public Integer getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(Integer idEleve) {
		this.idEleve = idEleve;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
		    + ((anneeScolaire == null) ? 0 : anneeScolaire.hashCode());
		result = prime * result
		    + ((dateAction == null) ? 0 : dateAction.hashCode());
		result = prime * result + ((idEleve == null) ? 0 : idEleve.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemandeConsoTempsAccPers other = (DemandeConsoTempsAccPers) obj;
		if (anneeScolaire == null) {
			if (other.anneeScolaire != null)
				return false;
		} else if (!anneeScolaire.equals(other.anneeScolaire))
			return false;
		if (dateAction == null) {
			if (other.dateAction != null)
				return false;
		} else if (!dateAction.equals(other.dateAction))
			return false;
		if (idEleve == null) {
			if (other.idEleve != null)
				return false;
		} else if (!idEleve.equals(other.idEleve))
			return false;
		return true;
	}

}
