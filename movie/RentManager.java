package movie;

import java.util.ArrayList;
import java.util.List;

import movie.Movie.Genre;
import movie.Person.Gender;

public class RentManager {
	
	public static long totalIncome(List<Buyable> products) {
		long income = 0;
		for (Buyable buyable : products) {
			income += buyable.getPrice();
		}
		return income;
	}
	
	public static void main(String[] args) {
		
		// customers
		Person me = new Person("Adam", "Vegh", Gender.MALE);
		Person lukacs = new Person("Lukacs", "Zsori", Gender.MALE);
		Person danci = new Person("Daniel", "Koics", Gender.MALE);
		Person balazs = new Person("Balazs", "Benedek", Gender.MALE);
		Person anna = new Person("Anna", "Zsorine", Gender.FEMALE);
		
		
		
		// authors
		Person stroustrup = new Person("Bjarne", "Stroustrup", Gender.MALE, 10000);
		Person sierra = new Person("Kathy", "Sierra", Gender.FEMALE, 5000);
		
		// books
		Book cpp = new Book(stroustrup, "The C++ Programming Language", me);
		Book java = new Book(sierra, "Head First Java", danci);
		
		
		
		// stuff
		ArrayList<Person> stuffOfMortal = new ArrayList<>();
		Person boon = new Person("Ed", "Boon", Gender.MALE, 2000);
		Person edwards = new Person("John", "Edwards", Gender.MALE, 1600);
		Person garcia = new Person("Paulo", "Garcia", Gender.MALE, 1500);
		stuffOfMortal.add(boon);
		stuffOfMortal.add(edwards);
		stuffOfMortal.add(garcia);
		
		ArrayList<Person> stuffOfF12015 = new ArrayList<>();
		Person jeal = new Person("Paul", "Jeal", Gender.MALE, 1800);
		Person rDarling = new Person("Richard", "Darling", Gender.MALE, 1700);
		Person dDarling = new Person("David", "Darling", Gender.MALE, 1700);
		Person jDarling = new Person("Jim", "Darling", Gender.MALE, 1700);
		Person ambani = new Person("Anil", "Ambani", Gender.MALE, 1600);
		stuffOfF12015.add(jeal);
		stuffOfF12015.add(rDarling);
		stuffOfF12015.add(dDarling);
		stuffOfF12015.add(jDarling);
		stuffOfF12015.add(ambani);
		
		// games
		Game mortalKombatX = new Game("Mortal Kombat X", true, stuffOfMortal, 100, balazs);
		Game f12015 = new Game("F1 2015", false, stuffOfF12015, 80, me);
		
		
		
		// cast
		ArrayList<Person> castOfTitanic = new ArrayList<>();
		Person dicaprio = new Person("Leonardo", "Dicaprio", Gender.MALE, 2000000);
		Person winslet = new Person("Kate", "Winslet", Gender.FEMALE, 1000000);
		castOfTitanic.add(dicaprio);
		castOfTitanic.add(winslet);
		
		ArrayList<Person> castOfMatrix = new ArrayList<>();
		Person reeves = new Person("Keanu", "Reeves", Gender.MALE, 100000000);
		Person moss = new Person("Carrie-Anne", "Moss", Gender.FEMALE, 10000000);
		castOfMatrix.add(reeves);
		castOfMatrix.add(moss);
		
		// movies
		Movie titanic = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8, castOfTitanic, 300, anna);
		Movie theMatrix = new Movie("The Matrix", Genre.SCI_FI, 140, 5.0, castOfMatrix, 250, lukacs);
		
		
		
		// list of products
		List<Product> products = new ArrayList<>();
		products.add(cpp);
		products.add(java);
		products.add(mortalKombatX);
		products.add(f12015);
		products.add(titanic);
		products.add(theMatrix);
		
		// list of buyable products
		List<Buyable> buyable = new ArrayList<>();
		for (Product product : products) {
			if (product instanceof Buyable) {
				Buyable buyableProduct = (Buyable) product;
				buyable.add(buyableProduct);
			}
		}
		
		System.out.println("Let's print out the investement of every product:");
		for (Product product : products) {
			System.out.println("\t- " + product.getTitle() + " : " + product.getInvestement() + " $(USD)");
		}
		System.out.println("\nThe total income by buyable products: " + totalIncome(buyable) + " $(USD)");
		
	}
}
