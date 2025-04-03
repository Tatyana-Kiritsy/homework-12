class Author {
    private final String name;
    private final String surname;

    public Author(String authorName, String authorSurname) {
        name = authorName;
        surname = authorSurname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}

