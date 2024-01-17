package com.es.programacion.tema5.proyectoPeliculas.clases;

public class Pelicula {

    /**
     * id de la pelicula
     */
    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imdBRatingCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setFullTitle();
    }

    public String getFullTitle() {
        return fullTitle;
    }

    private void setFullTitle() {

        if (this.year.length() > 0) {
            this.fullTitle = this.title + " ("+this.year+")";
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {

        try {
            if(Integer.parseInt(year) > 0){
                this.year = year;
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            this.year = "1900";
        }

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String director, String actor1, String actor2) {

        this.crew = director + " (dir.), "+actor1+", "+actor2;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(String imDbRating) {
        try {

            if(Double.parseDouble(imDbRating) > 0.0) {
                this.imDbRating = imDbRating;
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            this.imDbRating = "0.0";
        }

    }

    public String getImdBRatingCount() {
        return imdBRatingCount;
    }

    public void setImdBRatingCount(String imdBRatingCount) {
        this.imdBRatingCount = imdBRatingCount;
    }
}
