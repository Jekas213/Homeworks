package objectsAndClasses;

public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getAuthor() {
        return author.getFullName();
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
