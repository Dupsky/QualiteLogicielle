package proj;
//import java.util.ArrayList;
import java.util.Stack;

public class Stock {
	
	private Stack<Integer> produit;
	private int tailleTot; // taille total du stock
	
	
	
	public Stock(int tailleTot) {
		this.tailleTot = tailleTot;
		this.produit = new Stack<Integer>();
	}
 	
	public void clear()
	{
		this.produit.clear();
	}
	
	public void push(int produit)
	{
		if (this.tailleTot != this.produit.size()) {
			if(this.produit.size() >= this.tailleTot-3) {
				Alerte alerte = new Alerte();
				alerte.alerteSature(); // alerte stock
			}
			this.produit.add(produit);
		}
		else {
			System.err.println("Impossible de produire, le stock est plein");
		}
	}
	
	
	
	public void pop()
	{
		if (this.produit.size() != 0) {
			if(this.produit.size() < 4) {
				Alerte alerte = new Alerte();
				alerte.alerteVide(); // le stock est presque vide
			}
		  this.produit.remove(this.produit.size()-1);
		}
		else {
			System.err.println("Impossible de consommer, le stock est vide");
		}
	}

	public void Afficher()
	{

		for( int i = 0; i< this.produit.size(); i++) {
			System.out.println(this.produit.elementAt(i));
		}
	}
	
	
	public int gettailleTot() {
		return tailleTot;
	}
	public void settailleTot(int tailleTot) {
		this.tailleTot = tailleTot;
	}
	
	
		
		
}
