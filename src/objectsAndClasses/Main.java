package objectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book theTaleOfTsarSaltan = new Book("Сказка о царе Салтане", pushkin, 2017);
        Book masquerade = new Book("Маскарад", lermontov, 2002);

        System.out.println(pushkin);
        System.out.println(lermontov);

        System.out.println(theTaleOfTsarSaltan);
        System.out.println(masquerade);

        masquerade.setYearOfPublication(2010);

        System.out.println(masquerade);

        printCheckBook(theTaleOfTsarSaltan,masquerade);
        printCheckAuthor(pushkin,lermontov);

        if (pushkin.hashCode()!=lermontov.hashCode()) {
            System.out.println("это разные писатели");
        } else {
            System.out.println("Это один и то же писатель");
        }

    }

    public static void printCheckBook(Book bookOne, Book bookTwo) {
        if (bookOne.equals(bookTwo)) {
            System.out.println("Это одинаковы книги");
        } else {
            System.out.println("Это разные книги");
        }
    }

    public static void printCheckAuthor(Author authorOne, Author authorTwo ) {
        if (authorOne.equals(authorTwo)) {
            System.out.println("Это один и тот же автор");
        } else {
            System.out.println("Это разные авторы");
        }
    }

}
