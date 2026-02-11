package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1; Seller findByIdd ===");
		Seller seller = sellerDao.findById(9);
		
		System.out.println(seller);		
		
		System.out.println("\n=== Test 2; Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sellerObj : list) {
			System.out.println(sellerObj);
		}
		
		System.out.println("\n=== Test 3; Seller findAll ===");
		List<Seller> list02 = sellerDao.findAll();
		for(Seller sellerObj : list02) {
			System.out.println(sellerObj);
		}
		
		System.out.println("\n=== Test 4; Seller Insert ===");
		Seller newSeller = new Seller(null, "Victor Hugo", "victorh@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Id = " + newSeller.getId());

	}

}
