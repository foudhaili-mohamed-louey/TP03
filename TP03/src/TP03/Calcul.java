package TP03;

public class Calcul {

public static void main(String[] args) {
		int n = 5;
		int x = -5;
		int e1 = 7;
		int e2 = 6;
		int y = 7;
		boolean resultat ;
		
		System.out.println("Méthode 1 :\n");
		System.out.println(Entier.factoriel(n));
		System.out.println(Entier.absolu(x));
		Entier.camparer(e1,e2);
		resultat = Entier.premier(y);
		if(resultat == false)
			System.out.println(y+" n\'est pas un nombre premier !!!");
		else
			System.out.println(y+" est un nombre premier !!!");
		
		System.out.println("\nMéthode 2 :\n");
		 Entier k = new Entier(5);
		System.out.println(k.factoriel(5));
		System.out.println(k.absolu(6));
		k.camparer(7, 8);
		resultat = Entier.premier(7);
		if(resultat == false)
			System.out.println(y+" n\'est pas un nombre premier !!!");
		else
			System.out.println(y+" est un nombre premier !!!");
		
		
	}

}
