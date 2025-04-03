public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир",levTolstoy, 1870);
        System.out.println(warAndPeace);

        warAndPeace.setPublicationYear(1867);
        System.out.println(warAndPeace);

        Author donatoCarrisi = new Author("Донато", "Карризи");
        Book theWhisperer = new Book ("Подсказчик", donatoCarrisi, 2009);
        System.out.println(theWhisperer);
    }
}