import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
        return publicationYear;
    }

    @Override
    public String toString() {
        return name + " " + getAuthor().getName() + " " + getAuthor().getLastName() + " " + publicationYear;
    }


    @Override
    public boolean equals(Object eq) {
        if (this == eq) return true;
        if (eq == null || getClass() != eq.getClass()) return false;
        Book book = (Book) eq;
        return publicationYear == book.publicationYear && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}
