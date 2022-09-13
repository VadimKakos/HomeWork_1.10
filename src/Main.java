public class Main {
    public static void main(String[] args) {
        var author = new Author("Лев", "Толстой");
        var book = new Book("Война и мир", author, 1865);
        var author1 = new Author("Стивен", "Кинг");
        var book1 = new Book("Чужак", author1, 2018);



        System.out.println(book);
        System.out.println(book1);

        System.out.println(author);
        System.out.println(author1);

        System.out.println(book.equals(book));
        System.out.println(author.equals(author1));
    }
}