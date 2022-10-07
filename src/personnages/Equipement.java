package personnages;

public enum Equipement {
	CASQUE("casque"),BOUCLIER("boubouclier");
	
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return(this.nom);
	}


}
