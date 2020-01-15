package com.iashinsergei.mylibrary.model.entity;

public class Book {

    private int id;
    private String genre;
    private String author;
    private String seriesName;
    private String name;
    private String description;
    private int seriesNumber;
    private int year;



    public Book(int id, String genre, String author, String seriesName, String name, String description, int seriesNumber, int year) {
        this.id = id;
        this.genre = genre;
        this.author = author;
        this.seriesName = seriesName;
        this.name = name;
        this.description = description;
        this.seriesNumber = seriesNumber;
        this.year = year;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
