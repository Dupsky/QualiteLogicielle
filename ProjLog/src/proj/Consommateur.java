package proj;

public class Consommateur {

	

	private int idCons;
	
	

	
	public void consommer(Stock s)
	{
		s.pop();
	}
	
	
	
	public int getIdCons() {
		return idCons;
	}

	public void setIdCons(int idCons) {
		this.idCons = idCons;
	}
	
	
	
	
	
	
}
