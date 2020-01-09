package com.iashinsergei.mylibrary.data.entity;

public class Book {

    private String genre;
    private String author;
    private String seriesName;
    private String name;
    private int year;

    private String description;


    public Book(String genre, String author, String seriesName, String name, int year) {
        this.genre = genre;
        this.author = author;
        this.seriesName = seriesName;
        this.name = name;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
