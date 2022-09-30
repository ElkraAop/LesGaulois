
package personnages;
import java.util.*;
public class Druide {
	
private String nom;
private int effetPotionMin;
private int effetPotionMax;
private int forcePotion = 1;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	this.parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller dune force " + effetPotionMin + " à "
			+ effetPotionMax + ".");
}

public String getNom() {
	return nom;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
}
private String prendreParole() {
	return "Le druide " + nom + " : ";
}
public void preparerPotion() {
	Random a = new Random();
	this.forcePotion =this.effetPotionMin + a.nextInt(this.effetPotionMax-this.effetPotionMin);
	if (this.forcePotion>7) {
		System.out.println("« J'ai préparé une super potion de force "+this.forcePotion);
	}else {
		System.out.println("« Je n ai pas trouvé tous les ingrédients, ma potion est seulement de force  " + this.forcePotion);
	}
}
public void booster(Gaulois villageois) {
	if (villageois.getNom().equals("Obélix")){
		System.out.println("« Non, Obélix !... Tu n’auras pas de potion magique ! »");
	}else {
		villageois.boirePotion(forcePotion);
	}
	
}
public static void main(String[] args) {
	Druide panoramix = new Druide("panoramix",5,10);
	panoramix.preparerPotion();
}
}
