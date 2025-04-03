class Author {
    private String name;
    private String surname;

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

