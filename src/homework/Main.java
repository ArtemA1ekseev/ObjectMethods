package homework;

public class Main {
    public static void main(String[] args) {
        Author authorHollyBlack = new Author("Блэк", "Холли");
        Author authorPenelopeDouglas = new Author("Дуглас", "Пенелопа");
        Book book1 = new Book("Книга ночи", authorHollyBlack, 2011);
        Book book2 = new Book("Конклав", authorPenelopeDouglas, 2019);
        book1.getBookInfo();
        book2.getBookInfo();
        book1.setPublisherYear(2021);
        book1.getBookInfo();
        /*
        //test
        System.out.println(book1.toString());
        System.out.println(authorPenelopeDouglas.toString());
        System.out.println(authorHollyBlack.equals(authorPenelopeDouglas));
        System.out.println(book1.equals(book2));
        */
    }
}