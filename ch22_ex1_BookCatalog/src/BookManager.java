import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookManager {
	private List<Book> bookList;

	public BookManager() {
		bookList = new BookCatalog().getCatalog();
	}

	// page 723 #4
	public List<Book> getBooks(Predicate<Book> condition) {
		List<Book> books = new ArrayList<>();
		for (Book b : bookList) {
			if (condition.test(b)) {
				books.add(b);
			}
		}
		return books;
	}

}
