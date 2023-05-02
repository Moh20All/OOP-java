package bankaccount;

public class MainClass {

	public static void main(String[] args) {
		CompteBancaire C1;
		C1=new CompteBancaire(200);
		System.out.println("\n"+C1);
		CompteBancaire C2=new CompteBancaire(400);;
		System.out.println("\n"+C2);
		CompteBancaire C3=new CompteBancaire(500);;
		System.out.println("\n"+C3);
		if(C3.retirer(800)) {
			System.out.println("800$ has been retired from C3");
		}else {
			System.out.println("Not enough Balance to do the operation");
		}
		C3.deposer(800);
		if(C3.retirer(800)) {
			System.out.println("800$ has been retired from C3");
		}else {
			System.out.println("Not enough Balance to do the operation");
		}
		System.out.println(CompteBancaire.list);
	}

}
