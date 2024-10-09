package Exercice2;

public class Compte {

	private int numero;
	private float solde;
	public static int count =0;
	public Compte()
	{
		count ++;
		this.numero = count;
		this.solde = 0;
	}
	public void deposer(float m)
	{
		this.solde += m;
	}
	public void retirer(float m)
	{
		this.solde -= m;
	}
	public float avoirSolde()
	{
		return this.solde;
	}
	public void transferer(float m,Compte c)
	{
		this.retirer(m);
		c.solde = m;
		
	}
	
	
	
}
