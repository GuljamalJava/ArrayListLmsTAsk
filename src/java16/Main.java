package java16;

import java16.dao.impl.BookDaoImpl;
import java16.dao.impl.LibraryDaoImpl;
import java16.dao.impl.ReaderDaoImpl;
import java16.db.Database;
import java16.enums.Gender;
import java16.enums.Genre;
import java16.models.Book;
import java16.models.Library;
import java16.models.Reader;
import java16.service.impl.BookServiceImpl;
import java16.service.impl.LibraryServiceImpl;
import java16.service.impl.ReaderServiceImpl;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// todo          Models
//        Library(id, name, address, List < Book > books, List < Reader > readers)
//        Book(id, name, author, Genre genre)
//        Reader(id, fullName, email, phoneNumber, Gender gender)
//        Database(List < Library > libraries, List < Book > books, List < Reader > readers)
//
//
//  todo      2. Methods
//        LibraryService
//        List<Library> saveLibrary (List < Library > libraries);
//        List<Library> getAllLibraries ();
//        Library getLibraryById (Long id);
//        Library updateLibrary (Long id, Library library);
//        String deleteLibrary (Long id);
//
//
// todo       BookService
//        Book saveBook (Long libraryId, Book book);
//        List<Book> getAllBooks (Long libraryId);
//        Book getBookById (Long libraryId, Long bookId);
//        String deleteBook (Long libraryId, Long bookId);
//        void clearBooksByLibraryId (Long libraryId);
//
//
// todo       ReaderService
//        void saveReader (Reader reader);
//        List<Reader> getAllReaders ();
//        Reader getReaderById (Long id);
//        Reader updateReader (Long id, Reader reader);
//        void assignReaderToLibrary (Long readerId, Long libraryId);
//  Бардык методдор Main класска чакырылып, switch case аркылуу ирээттуу турдо консольго чыксын.
//
        Database database = new Database();
        LibraryDaoImpl libraryDao = new LibraryDaoImpl();
        LibraryServiceImpl libraryService = new LibraryServiceImpl(libraryDao);
        ReaderDaoImpl readerDao = new ReaderDaoImpl(libraryDao);
        ReaderServiceImpl readerService = new ReaderServiceImpl(readerDao);
        BookDaoImpl bookDao = new BookDaoImpl(libraryDao);
        BookServiceImpl bookService = new BookServiceImpl(bookDao);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println(""" 
                     Library method!!!                Book method!!!                 Readers methods!!!
                    1.Save Library:                  6.Save Book:                   11.Save Reader: 
                    2.get All Libraries:             7.Get All Books:               12.Get All Readers:
                    3.getLibraryById                 8.Get books by Id:             13.Get Reader by Id:
                    4.Update Library:                9.Delete Books :               14.Update Reader:
                    5.Delete Library:                10.Clear Books By LibraryId:   15.Assing Reader:
                    """);

            int command = scanner.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("Save Library: ");
                    List<Book> books = getFullBooks();
                    List<Reader> readers = getFullReaders();

                    List<Library> savedLibrary1 = new LinkedList<>(List.of(
                            new Library(1L, "ul.Beishenalieva 123", "Bishkek gorodskaya biblioteka"),
                            new Library(2L,"Lininskiy str 45","NAtional Library")

                    ));

                    System.out.println(libraryService.saveLibrary(savedLibrary1));
                }
                case 2 -> {
                    System.out.println("Get All Libraries:");
                    System.out.println("Get All Libraries: " + libraryService.getAllLibraries());
                }
                case 3 -> {
                    System.out.println(" getLibraryById ");
                    System.out.println(libraryService.getLibraryById(1L));
                }
                case 4 -> {
                    System.out.println("Delete Library:");

                    libraryService.deleteLibrary(1L);
                }
                case 5 -> {
                    System.out.println("Update Library by id:");

                    System.out.println(libraryService.updateLibrary(1L, new Library(3L,"chyi", "alykul osmonov")));
                }
                case 6 -> {
                    System.out.println("Book methods:");
                    System.out.println("Save book:");
                    var savenBook1 =bookService.saveBook(2L,new Book(1L,"Ketty Sierra",Genre.LEARNING,"Head First Java"));
                    var savenBook2=bookService.saveBook(2L, new Book(2L,"Kasymaly Jantoshev",Genre.POVEST,"Syngan Kylych"));
                    System.out.println("save books "+ savenBook1);
                    System.out.println(savenBook2);
                }
                case 7 -> {
                    System.out.println("Get All Books:");
                    System.out.println(bookService.getAllBooks(scanner.nextLong()));
                }
               case 8 ->{
                   System.out.println("Get Books by id:");
                   System.out.println(bookService.getBookById(2L, 1L));
               }

                }

            }


        }



    public static List<Book> getFullBooks() {
        Book book1 = new Book(3L, "Roberto Kiossaky", Genre.MOTIVATION, "Bogatyinpapa i Bednyi Papa");
        Book book2 = new Book(4L, "Chyngyz Aitmatov", Genre.ROMAN, "Jamilia");
        Book book3 = new Book(5L, "Марк Мэнсон", Genre.MOTIVATION,"Тонкое искусство пофигизма");
        List<Book> books = new ArrayList<>(List.of(book1, book2, book3));
        return books;
    }

    public static List<Reader> getFullReaders() {
        Reader reader1 = new Reader(1L, "Aigul@gmail.com", "Aigul Aidarova", Gender.FEMALE, "0771453345");
        Reader reader2 = new Reader(2L, "Aitbu@gmail.com", "Aitbubu Nurlanova", Gender.FEMALE, "0755045355");
        Reader reader3 = new Reader(3L, "Adilet@gmail.com", "Adilet Bektursunov", Gender.MALE, "0990003345");
        List<Reader> readers = new ArrayList<>(List.of(reader1, reader2, reader3));
        return readers;
    }
}