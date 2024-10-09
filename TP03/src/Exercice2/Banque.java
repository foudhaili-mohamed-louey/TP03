package Exercice2;

public class Banque {

	public static void main(String[] args) {
		
		Compte co1  =new Compte();
		Compte co2  =new Compte();
		
		System.out.println("Before deposer :\n");
		System.out.println("le solde de "+co1+" = "+co1.avoirSolde());
		System.out.println("le solde de "+co2+" = "+co2.avoirSolde());
		
		co1.deposer(1200);
		co2.deposer(500);
		
		System.out.println("\nAfter deposer :\n");
		System.out.println("le solde de "+co1+" = "+co1.avoirSolde());
		System.out.println("le solde de "+co2+" = "+co2.avoirSolde());
		
		System.out.println("\nBefore Transfer :\n");
		System.out.println("le solde de "+co1+" = "+co1.avoirSolde());
		System.out.println("le solde de "+co2+" = "+co2.avoirSolde());
		
		co2.transferer(700, co1);
		
		System.out.println("\nAfter Transfer :\n");
		System.out.println("le solde de "+co1+" = "+co1.avoirSolde());
		System.out.println("le solde de "+co2+" = "+co2.avoirSolde());
		
		if(co2.avoirSolde() < 0)
		{
			System.out.println("co2 en rouge !!!");
		}
		else
		{
			System.out.println("co2 n\' est pas en rouge !!!");
		}
		
		if(co1.avoirSolde() < 0)
		{
			System.out.println("co1 en rouge !!!");
		}
		else
		{
			System.out.println("co1 n\' est pas en rouge !!!");
		}
	}

}
