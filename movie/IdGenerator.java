package movie;

public class IdGenerator {
	public static String idGenerator(Product product) {
		if (product instanceof Movie) {
			return "MOV" + product.hashCode();
		}
		else if (product instanceof Game) {
			return "GAM" + product.hashCode();
		}
		else if (product instanceof Book) {
			return "BOO" + product.hashCode();
		}
		return null;
	}
}
