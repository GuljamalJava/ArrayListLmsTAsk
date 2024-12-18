package java16.service.impl;

import java16.dao.impl.BookDaoImpl;
import java16.models.Book;
import java16.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDaoImpl bookDaoImpl;


    public BookServiceImpl(BookDaoImpl bookDaoImpl) {
        this.bookDaoImpl = bookDaoImpl;

    }

    @Override
    public Book saveBook(Long libraryId, Book newBook) {
        bookDaoImpl.saveBook(libraryId, newBook);
        return newBook;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return bookDaoImpl.getAllBooks(libraryId);
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        return bookDaoImpl.getBookById(libraryId, bookId);
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        return bookDaoImpl.deleteBook(libraryId, bookId);
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        bookDaoImpl.clearBooksByLibraryId(libraryId);
    }
}
