package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManipulation {

    String line = "";
    List<Movie> SearchedMovies = new ArrayList();


    public void findMovieInfosDic(String director) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/movie_metadata_500.csv"));
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                String[] holder = line.split(",");
                if (holder[1].contains(director)) {
                    System.out.println(count+" - Filmtitel: "+holder[11]+", Årstal: "+holder[23]+",IMDB-score: "+holder[25]+" , Intruktør: "+holder[1]+" , Skuespillere: "+holder[6]+", "+holder[10]+" country: "+holder[20]+".");
                    SearchedMovies.add(new Movie(holder[11], holder[23], holder[25], holder[1], holder[6] + holder[10], holder[20]));
                    count++;

                    try (FileWriter fileWriter = new FileWriter("src/main/java/movie.csv")) {
                        for (Movie tempMovie: SearchedMovies) {
                            fileWriter.write(tempMovie.getTitle()+","+tempMovie.getYear()+","+tempMovie.getImdb_score()+","+tempMovie.getDirector()+","+tempMovie.getActors()+"\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Error " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void findMovieInfosCountry(String country) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/movie_metadata_500.csv"));
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                String[] holder = line.split(",");
                if (holder[20].contains(country.toUpperCase())) {
                    System.out.println(count+" - Filmtitel: "+holder[11]+", Årstal: "+holder[23]+",IMDB-score: "+holder[25]+" , Intruktør: "+holder[1]+" , Skuespillere: "+holder[6]+", "+holder[10]+" country: "+holder[20]+".");
                    SearchedMovies.add(new Movie(holder[11], holder[23], holder[25], holder[1], holder[6] + holder[10], holder[20]));
                    count++;
                    try (FileWriter fileWriter = new FileWriter("src/main/java/movie.csv")) {
                        for (Movie tempMovie: SearchedMovies) {
                            fileWriter.write(tempMovie.getTitle()+","+tempMovie.getYear()+","+tempMovie.getImdb_score()+","+tempMovie.getDirector()+","+tempMovie.getActors()+"\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Error " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


