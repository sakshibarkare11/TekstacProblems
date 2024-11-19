package book.com;
import java.util.*;
import java.util.stream.Stream;


public class BookUtility {
	public List<Book> retrieveBookDetails_ByYearPublished(Stream<Book> bookStream , int year){
		//fill the code
		bookStream.filter(p->p.getYear().equals(year)).toList();
		return null;
	}
	public Stream<Book> retrieveBookDetails_ByGenre(Stream<Book> bookStream , String genre){
		//fill the code
		return null;
	}
	public List<Book> getTheTitlesOfCheapestBooks(Stream<Book> bookStream , double price, int number){
		//fill the code
		bookStream.filter(p->p.getPrice() > price).limit(number).toList();

		return null;
	}
	
}
