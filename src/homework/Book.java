package homework;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publisherYear;

    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        if (publisherYear < 1950 || publisherYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publisherYear);
            return;
        }
        this.publisherYear = publisherYear;
    }

    public void getBookInfo() {
        System.out.println("Книга «" + getBookName() + "» (Автор — " + author.toString() + ")" + " издана в " + getPublisherYear() + " году.");
    }

    @Override
    public String toString() {
        return "Книга «" + bookName + "»" + " издана в " + publisherYear + " году.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book sourceText = (Book) obj;
        return (bookName == sourceText.bookName || (bookName != null && bookName.equals(sourceText.getBookName())))
                && publisherYear == sourceText.publisherYear && author.equals(sourceText.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publisherYear);
    }
}