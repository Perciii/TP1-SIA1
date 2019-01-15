package ex3;

public class Employe {
	protected int plafondDepense ;
	protected String nom ;
	protected Decideur decideurs;
	public Employe(int plafondDepense, String nom) {
		super() ;
		this.plafondDepense = plafondDepense ;
		this.nom = nom ;
	}
	public int getPlafondDepense() {
		return plafondDepense ;
	}
	public void setPlafondDepense(int plafondDepense) {
		this.plafondDepense = plafondDepense ;
	}
	public String getNom() {
		return nom ;
	}
	public void setNom(String nom) {
		this.nom = nom ;
	}
	public void ajouteDecideur(Decideur d1) {
		decideurs = d1;
	}
	
	protected boolean accordImmediatDepense(int montant) {
		if (montant <= plafondDepense) {
			System.out.println(nom + " a donné son accord pour + une dépense de "+ montant) ;
			return true ;
		}
		return false ;
	}

	public boolean accordDepense (int montant) {
		if (this.accordImmediatDepense(montant))
			return true ;
		System.out.println("n+1");
		return decideurs.accord(montant);
	}
}
