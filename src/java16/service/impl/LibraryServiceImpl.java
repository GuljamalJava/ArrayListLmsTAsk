package java16.service.impl;

import java16.dao.impl.LibraryDaoImpl;
import java16.models.Library;
import java16.service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
  private  final LibraryDaoImpl libraryDaoImpl;

    public LibraryServiceImpl(LibraryDaoImpl libraryDaoImpl) {
        this.libraryDaoImpl = libraryDaoImpl;
    }


    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
      return libraryDaoImpl.saveLibrary(libraries) ;
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryDaoImpl.getAllLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
        return libraryDaoImpl.getLibraryById(id);
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        return libraryDaoImpl.updateLibrary(id,library);
    }

    @Override
    public String deleteLibrary(Long id) {
        libraryDaoImpl.deleteLibrary(id);
        return "successfully deleted!";
    }



}
