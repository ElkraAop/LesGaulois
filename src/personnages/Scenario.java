package personnages;

import java.util.Iterator;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("panoramix",5,10);
		panoramix.parler("� Je vais aller pr�parer une petite potion...�");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("� Par B�l�nos, ce n'est pas juste !�");
		panoramix.booster(asterix);
		asterix.parler("� Bonjour�");
		minus.parler("Un GAU... UN GAUGAU...");
		for (int i = 0; i<3;i++){
			asterix.frapper(minus);
		}
	}

}
