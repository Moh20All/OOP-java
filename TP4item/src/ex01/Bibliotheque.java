package ex01;
import java.util.ArrayList;

public class Bibliotheque {
	private ArrayList<livre> livres;
	private ArrayList<membre> membres;
	private ArrayList<pret> prets;
	
	public Bibliotheque() {
		membres = new ArrayList<membre>();
		livres = new ArrayList<livre>();
		setPrets(new ArrayList<pret>());
	}
	
	public void ajouterlivre(livre lvre) {
		this.livres.add(lvre);
	}
	public void supprimerlivre(livre lvre) {
		this.livres.remove(lvre);
	}
	public void ajoutermembre(membre mem) {
		this.membres.add(mem);
	}
	public void supprimermembre(membre mem) {
		this.membres.remove(mem);
	}
	public void emprunterLivre(String titre, String emprunteur) {
		for (int i = 0; i < this.livres.size(); i++) {
			if(this.livres.get(i).getName().equals(titre) && this.livres.get(i).isAvailble()) {
				this.livres.get(i).setAvailble(false);
				break;
			}
		}
	}
	
	
	
	public ArrayList<membre> getmembre(){
		return this.membres;
	}
	
	public ArrayList<livre> getPrets() {
		return this.livres;
	}

	public void setPrets(ArrayList<pret> prets) {
		this.prets = prets;
	}





	class livre{
		private String name;
		private int prix;
		private boolean availble;
		public livre(String nom,int prix) {
			this.name=nom;
			this.prix=prix;
			this.availble=true;
		}
		public int getPrix() {
			return prix;
		}
		public void setPrix(int prix) {
			this.prix = prix;
		}
		public boolean isAvailble() {
			return availble;
		}
		public void setAvailble(boolean availble) {
			this.availble = availble;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	class membre{
		private String nom;
		private String prenom;
		private int age;
		public membre(String nom,String prenom,int age) {
			this.nom=nom;
			this.age=age;
			this.prenom=prenom;
		}
		public String getprenom() {
			return prenom;
		}
		public void setprenom(String pr) {
			this.prenom = pr;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
	public class pret {
		private membre emprenteur;
		private livre livre;

		public pret(livre livre, membre membre) {
			this.emprenteur = membre;
			this.livre = livre;
		}

		public String toString() {
			return this.livre + "";
		}

	}
	public static void main(String[] args) {
		Bibliotheque be = new Bibliotheque();
		Bibliotheque.livre l1 =be.new livre("Electronics", 250);
		Bibliotheque.livre l2 =be.new livre("Immune system", 150);
		be.ajouterlivre(l1);
		be.ajouterlivre(l2);
		Bibliotheque.membre m1 =be.new membre("Allali","Mohamed",19);
		Bibliotheque.membre m2 =be.new membre("Walter","White",52);
		be.ajoutermembre(m1);
		be.ajoutermembre(m2);
		System.out.println("Le livre : "+l1.getName()+" emprunteur :" +l1.isAvailble());
		System.out.println("Le livre : "+l2.getName()+" emprunteur :" +l2.isAvailble());
		be.emprunterLivre("Electronics","Allali");
		System.out.println(be.getPrets());
		
	}

}
