package java16.dao;

import java16.models.Reader;

import java.util.List;

public interface ReaderDao {

        void saveReader (Reader reader);

        List<Reader> getAllReaders();

        Reader getReaderById (Long id);

        Reader updateReader (Long id, Reader reader);

        void assignReaderToLibrary (Long readerId, Long libraryId);



}