class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String bookTitle, Author bookAuthor, int bookYear) {
        title = bookTitle;
        author = bookAuthor;
        publicationYear = bookYear;
    }

    @Override
    public String toString() {
        return "'" + title + "'" + ", " + author + ", " + publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }


    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
