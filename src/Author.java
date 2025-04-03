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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}

