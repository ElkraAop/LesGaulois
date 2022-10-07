package personnages;

public class Romain {
private String nom;
private int force;
private Equipement[] tabEquipement;
private int nbEquipement;
	
	public Romain(String nom, int force) /*throws IllegalArgumentException*/ {
		//if(force<0) 
		//	throw new IllegalArgumentException("Force d'un rommain ne peut être négative");
		assert(force>0);
		this.nom = nom;
		this.force = force;
		this.nbEquipement = 0;
		this.tabEquipement = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert(force>0);
		int a= force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert(force<a);
	}
	
	public void sEquiper(Equipement stuff ) {
		switch(this.nbEquipement) {
		case 0:
			this.tabEquipement[this.nbEquipement++] = stuff;
			this.parlerEquipement("s'équipe avec un "+stuff.toString());
			break;
		case 1:
			if (this.tabEquipement[0].toString().equals(stuff.toString())){
				this.parlerEquipement("posséde déja un "+stuff.toString());
			}else {
				this.tabEquipement[this.nbEquipement++] = stuff;
				this.parlerEquipement("s'équipe avec un "+stuff.toString());
			}
			break;
		default : //2
			this.parlerEquipement("Est déja bien protégé");
		}
		
	}
	public void parlerEquipement(String contexte) {
		System.out.println("Le soldat "+this.getNom()+" "+contexte);
		
	}
		
	}


