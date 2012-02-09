package org.ldv.sio.getap.app;

/**
 * A User with role
 */
public class User {

	private Long id;
	private String nom;
	private String prenom;
	private String classe;
	private String role;

	public User() {
	}

	public User(Long id, String firstName, String lastName, String classe,
	    String role) {
		this.id = id;
		this.prenom = firstName;
		this.nom = lastName;
		this.classe = classe;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User(" + prenom + ":" + nom + "," + role + "," + classe + ")";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
