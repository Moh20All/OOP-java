package ex01;
import java.util.Random;
public class comptebancaire {
	private double solde;
	private String numeroDeCompte;
	public comptebancaire(String a,double b) {
		this.numeroDeCompte=a;
		this.solde=b;
	}
	public String getNumeroDeCompte() {//return number account
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(String numeroDeCompte) { // set number account
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() { // return solde
		return solde;
	}
	public void setSolde(double solde) { // set solde
		this.solde = solde;
	} 
	public void deposer(double de) {
		this.solde=this.solde+de;
		System.out.println("Le depose avec success");
	}
	public void retirer(double drawl) {
		if(this.getSolde()==0) {
			System.out.println("Le solde en solde en dessous de zéro");
			return;
		}else {
			solde=solde-drawl;
			System.out.println("Le Retire avec success");
		}
	}
    public static String genererNumeroDeCompte(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
	public static void main(String[] args) {
		
		comptebancaire compte = new comptebancaire(genererNumeroDeCompte(3),2203.4);
		System.out.println("Le solde de numero compte "+compte.getNumeroDeCompte()+" : "+compte.getSolde()+" DA");
		compte.deposer(123.4);
		System.out.println("Le solde de numero compte "+compte.getNumeroDeCompte()+" : "+compte.getSolde()+" DA");
		compte.retirer(326.8);
		System.out.println("Le solde de numero compte "+compte.getNumeroDeCompte()+" : "+compte.getSolde()+" DA");

	}
}
