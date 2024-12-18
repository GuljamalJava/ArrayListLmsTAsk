package java16.dao.impl;

import java16.dao.LibraryDao;
import java16.db.Database;
import java16.models.Book;
import java16.models.Library;

import java.util.List;

public class LibraryDaoImpl implements LibraryDao {

private final Database database = new Database();

    @Override
    public List<Library> saveLibrary(List <Library> library) {
         database.LibraryList.addAll(library);
        return database.LibraryList;
    }

    @Override
    public List<Library> getAllLibraries() {
        return  database.LibraryList;
    }

    @Override
    public Library getLibraryById(Long id) {
        boolean is = false;
        Library findLibrary = null;
        for (Library library : database.LibraryList) {
            if(library.getId().equals(id)){
                findLibrary = library;
                is = true;
            }
        }
       if (!is) {
           System.out.println("not found " + id);

       }
        return findLibrary;
    }



    @Override
    public Library updateLibrary(Long id, Library library) {
        for (Library library1 : database.LibraryList) {
            if (library1.getId().equals(id)) {
                library1.setId(id);
                library1.setName(library.getName());
                library1.setBooks(library.getBooks());
                library1.setAddress(library.getAddress());
                library1.setReaders(library.getReaders());
                return library1;
            }
        }
        System.out.println("Library not found by " + id);
        return null;
    }



    @Override
    public void deleteLibrary(Long id) {
     boolean  foundLibrary = false;
        for (int i = 0; i < database.LibraryList.size(); i++) {
            if (database.LibraryList.get(i).getId() == id) {
                database.LibraryList.remove(i);
                foundLibrary = true;
                System.out.println("Success deleted library by" + id);
            }
        }
        if(!foundLibrary){
            System.out.println("Library not found with " + id);
        }
    }




}
