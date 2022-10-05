package homework;

import java.util.Objects;

public class Author {
    private String surname;
    private String name;
    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Имя: " + name +"," + " Фамилия: " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Author noname = (Author) obj;
        return (name == noname.name || (name != null && name.equals(noname.getName())))
                && (surname == noname.surname || (surname != null && surname.equals(noname.getSurname())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }
}