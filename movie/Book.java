package movie;

public class Book extends Product {
	private Person author;
	
	Book(Person author, String title, Person person) {
		this.author = author;
		this.title = title;
		this.person = person;
	}
	
	public Person getAuthor() { return author; }
	public void setAuthor(Person author) { this.author = author; }
	
	@Override
	public long getInvestement() {
		return author.getSalary();
	}
}
