package java16.dao.impl;

import java16.dao.ReaderDao;
import java16.db.Database;
import java16.models.Library;
import java16.models.Reader;

import java.util.ArrayList;
import java.util.List;

public class ReaderDaoImpl implements ReaderDao {

    Database database = new Database();

    private final LibraryDaoImpl libraryDaoImpl;


    public ReaderDaoImpl(LibraryDaoImpl libraryDaoImpl) {
        this.libraryDaoImpl = libraryDaoImpl;
    }


    @Override
    public void saveReader(Reader reader) {
        database.LibraryList.add(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
     List<Reader> readersBox= new ArrayList<>();
        for (Library library : database.LibraryList) {
            readersBox.addAll(library.getReaders());
        }
        return  readersBox;
    }

    @Override
    public Reader getReaderById(Long id) {
        List<Reader> readers = new ArrayList<>();
        for (Reader reader : readers) {
            if (reader.getId().equals(id)) {
                System.out.println("found Reader by id:" + id);
            } else {
                System.out.println("not fount!");
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        List<Reader> readers = new ArrayList<>();
        for (Reader reader1 : readers) {
            if (reader1.getId().equals(id)) {
                reader1.setFullName(reader.getFullName());
                reader1.setEmail(reader.getEmail());
                reader1.setGender(reader.getGender());
                reader1.setPhoneNumber(reader.getPhoneNumber());


            }
            System.out.println(reader1);

        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (Library library : database.LibraryList) {
            if (library.getId().equals(libraryId)) {
                for (Reader reader : library.getReaders()) {
                    if (reader.getId().equals(readerId)) {
                        library.getReaders().add(reader);
                    }else {
                        System.out.println("not found reader id"+ readerId);
                    }
                }
            }else{
                System.out.println("not found library id"+ libraryId);
            }
        }
    }


}

