package src;

public class Movie {

    private String title;
    private String year;
    private String imdb_score;
    private String director;
    private String actors;
    private String country;


    public Movie() {
    }

    public Movie(String title, String year, String imdb_score, String director, String actors, String country) {
        this.title = title;
        this.year = year;
        this.imdb_score = imdb_score;
        this.director = director;
        this.actors = actors;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdb_score() {
        return imdb_score;
    }

    public void setImdb_score(String imdb_score) {
        this.imdb_score = imdb_score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", imdb_score='" + imdb_score + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
