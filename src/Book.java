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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) &&
                publicationYear == book.publicationYear;
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

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
}
