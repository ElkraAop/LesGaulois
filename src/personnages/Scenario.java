package personnages;

import java.util.Iterator;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("panoramix",5,10);
		panoramix.parler("« Je vais aller préparer une petite potion...»");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("« Par Bélénos, ce n'est pas juste !»");
		panoramix.booster(asterix);
		asterix.parler("« Bonjour»");
		minus.parler("Un GAU... UN GAUGAU...");
		for (int i = 0; i<3;i++){
			asterix.frapper(minus);
		}
	}

}
