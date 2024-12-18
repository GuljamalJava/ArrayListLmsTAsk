package java16.dao.impl;

import java16.dao.BookDao;
import java16.db.Database;
import java16.models.Book;
import java16.models.Library;
import java16.models.Reader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BookDaoImpl  implements  BookDao {

    Database database = new Database();

    private final LibraryDaoImpl libraryDaoImpl;


    public BookDaoImpl(LibraryDaoImpl libraryDaoImpl) {
        this.libraryDaoImpl = libraryDaoImpl;

    }

    @Override
    public Book saveBook(Long libraryId, Book newBook) {
        for (Library library : database.LibraryList) {
            if (library.getId().equals(libraryId)) {
              library.getBooks().add(newBook);
                System.out.println(library.getBooks());
            }
        }
     return newBook;
    }

    @Override
//    public List<Book> getAllBooks(Long libraryId) {
//        List<Book> books = new ArrayList<>();
//        for (Library library : database.LibraryList) {
//            if (library.getId().equals(libraryId)) {
//                for (Book book : library.getBooks()) {
//                    books.add(book);
//                }
//            }
//        }
//    }
//        return books;
    public List<Book> getAllBooks(Long libraryId) {
        List<Book> bookList = new ArrayList<>();
        for (Library library : database.LibraryList) {
            if (library.getId().equals(libraryId)) {
                bookList.addAll(library.getBooks());
                System.out.println(library.getBooks());
            }
        }
        return bookList;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        Library library = libraryDaoImpl.getLibraryById(libraryId);
        if (library == null) {
            System.out.println("Library id:" + libraryId);
            for (Book book : library.getBooks()) {
                if (book.getId().equals(bookId)) {
                    System.out.println("find book by id: " + bookId);
                    System.out.println(book);
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        Library library = libraryDaoImpl.getLibraryById(libraryId);
        if (library == null) {
            System.out.println("Library id:" + libraryId);
            for (Book book : library.getBooks()) {
                if (book.getId().equals(bookId)) {
                    database.LibraryList.remove(book);
                }
            }
        }
        return "successfully deleted!";
    }


    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        Library library = libraryDaoImpl.getLibraryById(libraryId);
        if (library == null) {
            System.out.println("Library id:" + libraryId);
            library.getBooks().clear();
            System.out.println("all books " + libraryId + "successfully cleared");
        }
    }
}




