/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<String>(); //when assigning a variable can leave out type
    }

    /**
     * @deprecated Use publishedBooks instead
     */
//    @SuppressWarnings({"deprecation", "unchecked"})
    public List<String> getBooks() {
        return books;
    }
//    @SuppressWarnings("unchecked") //pass in unchecked warning to remove error
    public List<String> publishedBooks() {
        return books;
    }
//    @SuppressWarnings("unchecked")
    public void addBook(String book) {
        books.add(book);
    }

    @Deprecated
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}

//run main method -- javac -d out/ src/* -Xlint:unchecked