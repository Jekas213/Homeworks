package objectsAndClasses;

public class Author {
    private String firsName;
    private String lastName;

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firsName + " " + this.lastName;
    }


}
