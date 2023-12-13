package ru.netology.films;

public class Film {
    private String name;
    private String genre;
    private String ageLimit;

    public Film() {
    }

    public Film(String name, String genre, String ageLimit) {
        this.name = name;
        this.genre = genre;
        this.ageLimit = ageLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }
}
