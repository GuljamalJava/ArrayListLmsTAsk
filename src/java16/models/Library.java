package java16.models;

import java.util.List;

public class Library {
  private Long  id;
  private String name;
  private String address;
  private List <Book> books;
  private List<Reader> readers;

    public Library() {
    }
    public Library(Long id,String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;

    }

    public Library(Long id,String address, List<Book> books,  String name, List<Reader> readers) {
        this.id = id;
        this.address = address;
        this.books = books;
        this.name = name;
        this.readers = readers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Library{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                ", readers=" + readers +
                '}'+"\n";
    }
}
