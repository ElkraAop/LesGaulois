package personnages;

public class Village {

	private String nom;
	private Chef chef;
	private Gaulois[] tabVillageois;
	private int nbVillageois;

	public Village(String nom,int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.nbVillageois = 0;
		this.tabVillageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois resident) {
		this.tabVillageois[this.nbVillageois++]=resident;
	}
	
	public Gaulois trouverHabitant(int i) throws IllegalArgumentException{
		if (i>this.tabVillageois.length-1) {
			throw new IllegalArgumentException(" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30");
		}
		return this.tabVillageois[i];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef"+this.chef.getNom()+ "vivent les légendaires gaulois");
		for(int i = 0; i<this.nbVillageois;i++) {
			System.out.println(trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village ville = new Village("Village des Irreductibles", 30);
		//Gaulois gaulois = ville.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",6,ville);
		ville.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		ville.ajouterHabitant(asterix);
		//Gaulois gaulois = ville.trouverHabitant(1); // revoie nul car on compte a 0 
		//System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix",25);
		ville.ajouterHabitant(obelix);
		ville.afficherVillageois();
	}
}
