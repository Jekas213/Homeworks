package objectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book theTaleOfTsarSaltan = new Book("Сказка о царе Салтане", pushkin, 2017);
        Book masquerade = new Book("Маскарад", lermontov, 2002);

        System.out.println(theTaleOfTsarSaltan.getBookName() + "-" + theTaleOfTsarSaltan.getAuthor() + "-" + theTaleOfTsarSaltan.getYearOfPublication());
        System.out.println(masquerade.getBookName() + "-" + masquerade.getAuthor() + "-" + masquerade.getYearOfPublication());

        masquerade.setYearOfPublication(2010);

        System.out.println(masquerade.getBookName() + "-" + masquerade.getAuthor() + "-" + masquerade.getYearOfPublication());
    }

}
