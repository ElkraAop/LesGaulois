package personnages;

public class Romain {
private String nom;
private int force;
	
	public Romain(String nom, int force) /*throws IllegalArgumentException*/ {
		//if(force<0) 
		//	throw new IllegalArgumentException("Force d'un rommain ne peut �tre n�gative");
		assert(force>0);
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert(force>0);
		int a= force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert(force<a);
	}
}


