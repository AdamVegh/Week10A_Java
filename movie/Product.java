package movie;

public abstract class Product {
	protected String id = IdGenerator.idGenerator(this);
	protected String title;
	protected Person person;
	
	public String getTitle() { return title; }
	public Person getPerson() { return person; }
	public abstract long getInvestement();
}
