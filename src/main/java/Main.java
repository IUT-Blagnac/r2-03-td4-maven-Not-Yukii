
public class Main {

	public static void main(String argv[]) {
        Pile maPile = Pile.CreerPile(1);
        if (!maPile.est_vide()) System.out.println("NOK");

        try {
            maPile.empiler(5);
            if (maPile.est_vide()) System.out.println("NOK");

            if (maPile.sommet() != 5) System.out.println("NOK");

            if (!maPile.pilePleine()) System.out.println("NOK");
            
            if (maPile.nbElements() != 1) System.out.println("NOK");

            if (!maPile.toString().equals("vide")) System.out.println("NOK");
            System.out.println(maPile);
            
            int element = maPile.depiler();
            if (!maPile.est_vide()) System.out.println("NOK");
            if (element != 5) System.out.println("NOK");
            
            maPile.vider();
            if (!maPile.est_vide()) System.out.println("NOK");
        } catch (Exception e) {
        	System.out.println("NOK: " + e);
        }
	}

}