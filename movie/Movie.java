package movie;

import java.util.ArrayList;

public class Movie extends Product implements Buyable {
	enum Genre { ACTION, THRILLER, HORROR, SCI_FI, ROMANTIC, COMEDY, DRAMA };
	Genre genre;
	private long duration;
	private double rate;
	private ArrayList<Person> cast;
	private int price;
	
	Movie(String title, Genre genre, long duration, double rate, ArrayList<Person> cast, int price, Person person) {
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		this.price = price;
		this.person = person;
	}
	
	public Genre getGenre() { return genre; }
	public void setGenre(Genre genre) { this.genre = genre; }

	public long getDuration() { return duration; }
	public void setDuration(long duration) { this.duration = duration; }

	public double getRate() { return rate; }
	public void setRate(double rate) { this.rate = rate; }

	public ArrayList<Person> getCast() { return cast; }
	public void setCast(ArrayList<Person> cast) { this.cast = cast; }

	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	
	@Override
	public long getInvestement() {
		long totalInvestement = 0;
		for (Person person : cast) {
			totalInvestement += person.getSalary();
		}
		return totalInvestement;
	}
	
}
