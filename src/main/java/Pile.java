
public class Pile {
	
	private int[] elements;
	private int indiceSommet;

	Pile(int pfTaille) {
	        this.elements = new int[pfTaille];
	        this.indiceSommet = -1;
	    }
	
	public static Pile CreerPile(int i) {
		// TODO Auto-generated method stub
        return new Pile(i);
	}

	public boolean est_vide() {
		// TODO Auto-generated method stub
        return indiceSommet < 0;
	}
	
	public void empiler(int i) throws Exception {
        elements[indiceSommet + 1] = i;
        indiceSommet++;
	}

	public int sommet() {
		// TODO Auto-generated method stub
        return elements[indiceSommet];
	}

	public boolean pilePleine() {
		// TODO Auto-generated method stub
        return indiceSommet + 1 == elements.length;
	}
	
	public int nbElements() {
		// TODO Auto-generated method stub
        return indiceSommet + 1;
	}

	public int depiler() {
		// TODO Auto-generated method stub
		indiceSommet--;
        return elements[indiceSommet+1];
        }

	
	public void vider() {
		// TODO Auto-generated method stub
		indiceSommet = -1;
	}
	
	public String toString() {
        String str = "|vide";
        for (int i = 0; i < indiceSommet + 1; i++) {
            str = "|" + elements[i] + str;
        }
        return str;
    }
	}
