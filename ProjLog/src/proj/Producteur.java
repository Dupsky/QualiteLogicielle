package proj;

public class Producteur{
	
	private int idProd;
	
	public void produire(Stock s, int produit)
	{
		s.push(produit);
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	
	
	
	
	
	

	
	
}
