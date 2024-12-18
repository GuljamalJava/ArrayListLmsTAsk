package java16.dao;

import java16.models.Library;

import java.util.List;

public interface LibraryDao {


    List <Library> saveLibrary (List < Library > libraries);

    List <Library> getAllLibraries ();

    Library getLibraryById (Long id);

    Library updateLibrary (Long id, Library library);

    void deleteLibrary (Long id);
}
