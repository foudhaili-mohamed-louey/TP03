package Exercice3;

public class Maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float surface;
	
	public Maison(String adr, String t, int n)
	{
		this.adr=adr;
		this.type = t;
		this.nbchambre =n;
		
	}
	public Maison(String a, String t, int n, float s)
	{
		this.adr=a;
		this.type = t;
		this.nbchambre =n;
		this.surface = s;
	}
	public float calculPrix(float pmc)
	{
		float resultat = pmc * this.surface;
		return resultat;
	}
	public float calculPrix()
	{
		float resultat = 2100 * this.surface;
		return resultat;
	}
	public String toChaine()
	{
		
		return "Un appartement de "+this.surface+" à Sousse avec "+this.nbchambre;
		
	}
public static void main (String args[]){
		
		Maison m1 = new Maison("un duplex","Tunis",4,210f);
		Maison m2 = new Maison("une Villa","Nabeul",5);
		
		System.out.println(m1.type+" "+m1.adr+" "+m1.nbchambre+" "+m1.surface+"\n");
		System.out.println(m2.type+" "+m2.adr+" "+m2.nbchambre+" "+m2.surface+"\n");
		
		System.out.println("Méthode 1 : \n");
		m2.surface = 230;
		System.out.println("prix de m2 :"+m2.calculPrix());
		System.out.println("prix de m2 :"+m2.calculPrix(2000));
		
		System.out.println("prix de m1 :"+m1.calculPrix());
		System.out.println("prix de m1 :"+m1.calculPrix(2000));
		
		
		
		
	}
}

