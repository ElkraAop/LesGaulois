package personnages;

import java.util.Iterator;

public class Gaulois {
private String nom;
private int force;
private int effetPotion = 1;

public Gaulois(String nom, int force) {
	super();
	this.nom = nom;
	this.force = force;
}

public String getNom() {
	return nom;
}

@Override
public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
}

public String prendreParole() {
	return "Le gaulois " + nom + " : ";
	
}
public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
	
}
public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la m�choire de "
			+ romain.getNom());
	romain.recevoirCoup(force / 3);
}
public void boirePotion(int forcePotion) {
	this.effetPotion = forcePotion;
	parler("� Merci Druide, je sens que ma force est "+ forcePotion +" fois d�cupl�e. �");
}
public static void main(String[] args) {
// TODO tester la classe gaulois.
	Gaulois asterix = new Gaulois("Ast�rix",8);
	asterix.boirePotion(3);
	System.out.println(asterix.getNom());
	System.out.println(asterix);
}


}
