public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1870);
        System.out.println(warAndPeace);

        warAndPeace.setPublicationYear(1867);
        System.out.println(warAndPeace);


        Author donatoCarrisi = new Author("Донато", "Карризи");
        Book theWhisperer = new Book("Подсказчик", donatoCarrisi, 2009);
        Book theLostGirlsOfRome = new Book("Потерянные девушки Рима",
                donatoCarrisi, 2015);
        System.out.println(theWhisperer);
        System.out.println(theWhisperer.getAuthor().equals(theLostGirlsOfRome.
                getAuthor()));
        System.out.println(donatoCarrisi.getSurname().hashCode());
        System.out.println(theLostGirlsOfRome.getAuthor().hashCode());
    }
}