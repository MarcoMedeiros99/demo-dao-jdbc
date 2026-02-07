package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		

		Department obj = new Department(1, "book");
		Seller seller = new Seller(1, "marco", "marco@gmail.com", new Date(), 2.650, obj);
		
		System.out.println(obj);
		System.out.println(seller);
		
		
		
	}

}
