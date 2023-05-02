package bankaccount;

import java.util.ArrayList;

public class CompteBancaire {
	private double solde;
	private String numeroDeCompte;
	public static long lastCreated=(int) (Math.random()*Math.pow(9, 10));
	static ArrayList<String> list=new ArrayList<String>();
	public CompteBancaire(double solde) {
		this.solde = solde;
		this.numeroDeCompte=genererNumeroDeCompte();
	}
	
	public boolean deposer(double amount) {
		this.solde=+amount;
		return true;
	}
	public boolean retirer(double amount) {
		if(this.solde-amount<0) {
			return false;
		}else {
			this.solde=-amount;
			return true;
		}
		
	}
	
	public String getNumeroDeCompte() {
		return ""+this.numeroDeCompte;
	}
	
	public static String genererNumeroDeCompte() {
		long h=0;
		do {
		for(int i=0;i<10;i++) {
			h=(long) ((h+Math.random())*10);
		}
		}while(list.contains("DZ"+h));
		list.add("DZ"+h);
		return "DZ"+h;
		
	}
	public String toString() {
		return "Account Number : "+getNumeroDeCompte()+" \nSold : "+this.solde;
	}


}

//add a list of accounts to avoid duplicates