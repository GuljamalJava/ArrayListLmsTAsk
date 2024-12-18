package java16.models;

import java16.enums.Genre;

import java.util.Collection;
import java.util.Iterator;

public class Book extends Library {
    private Long id;
    private String name;
    private String author;
    private Genre genre;

    public Book() {
    }

    public Book(Long id, String author, Genre genre, String name) {
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
         return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }

}