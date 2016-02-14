package movie;

import java.util.ArrayList;

public class Game extends Product implements Buyable {
	private boolean preOrdered;
	private ArrayList<Person> staff;
	private int price;
	
	Game(String title, boolean preOrdered, ArrayList<Person> staff, int price, Person person) {
		this.title = title;
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = preOrdered ? (int)(0.8 * price) : price;
		this.person = person;
	}
	
	public boolean isPreOrdered() { return preOrdered; }
	public void setPreOrdered(boolean preOrdered) { this.preOrdered = preOrdered; }

	public ArrayList<Person> getStaff() { return staff; }
	public void setStaff(ArrayList<Person> staff) { this.staff = staff; }

	public void setPrice(int price) {
		this.price = preOrdered ? (int)(0.8 * price) : price; 
	}

	@Override
	public int getPrice() { return price; }

	@Override
	public long getInvestement() {
		long totalInvestement = 0;
		for (Person person : staff) {
			totalInvestement += person.getSalary();
		}
		return totalInvestement;
	}	
}
