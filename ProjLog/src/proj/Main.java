package proj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans la création de votre Stock ! ");
		System.out.print("Saisissez la taille du stock : ");
		
		Stock S = new Stock(sc.nextInt());
		
		ArrayList<Producteur> prodList= new ArrayList<Producteur>();
		ArrayList<Consommateur> consList= new ArrayList<Consommateur>(); 
		
		String input="Rien";
		while (input!="stop") {
			System.out.println("êtes vous un producteur ou un consommateur (p/c) ");
			input=sc.next();
			System.out.println(input);
			if(input.equals("p")) { // nouveau producteur
				System.out.println("entrez votre identifiant");
				int id = sc.nextInt();
				int index =0;
				
				for (int i=0 ; i<prodList.size();i++) {
					if(prodList.get(i).getIdProd() == id) {
					
				}
				
			
				
			}
			
			if(input.equals("c")) {
				
			}
			
			/*if(sc.hasNext("c")) {
				
			}
			
			if(sc.hasNext("c")) {
				
			}
			
			if(sc.hasNext("c")) {
				
			}*/
			
		}
		
		
		sc.close();

}
	}}

