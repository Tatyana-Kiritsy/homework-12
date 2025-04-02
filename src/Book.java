class Book {
    private String title;
    private Author authorName;
    private int publicationYear;

    public Book(String bookTitle, Author bookAuthor, int bookYear) {
        title = bookTitle;
        authorName = bookAuthor;
        publicationYear = bookYear;
    }
    @Override
    public String toString() {
        return "'" + title + "'" + ", " + authorName + ", " + publicationYear;
    }

    public String getTitle() {
        return title;
    }


    public Author getAuthorName() {
        return authorName;
    }


    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
