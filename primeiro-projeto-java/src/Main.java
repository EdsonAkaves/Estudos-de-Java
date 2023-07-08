public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);

        boolean includedInSubscription = true;
        double filmRating = 8.1;
        double filmAverageRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(filmAverageRating);

        String synopsis = """
               Filme Top Gun
               Filme de aventura com galã dos anos 80
               Muito bom!
               Ano de lançamento:                
               """ + releaseYear;
        System.out.println(synopsis);

        int starRating = (int) (filmAverageRating / 2);
        System.out.println(starRating);
    }
};