package TP03;

public class Entier {
	private int n;
	public Entier(int n)
	{
		this.n=n;
	}
	public static int factoriel(int n) {
		int resultat = 1;
		for(int i =1 ;i<=n;i++)
		{
			resultat = resultat *i;
		}
		return resultat;
	}
	public static int absolu(int n)
	{
		return Math.abs(n);
	}
	public static void camparer(int e1 , int e2)
	{
		if(e1 > e2)
		{
			System.out.println(e1+" > "+e2);
		}
		else if(e1 < e2)
		{
			System.out.println(e1+" < "+e2);
		}
		else
		{
			System.out.println(e1+" = "+e2);
		}
	}
	public static boolean premier(int n)
	{
		
		    if (n < 2)
		    {
		        return false;
		    }
		    for (int i = 2; i <= n / 2; i++)
		    {
		        if (n % i == 0)
		        {
		            return false;
		        }
		    }
		    
		    return true;
		}
}
