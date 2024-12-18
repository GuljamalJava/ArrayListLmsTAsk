package java16.service.impl;

import java16.dao.impl.ReaderDaoImpl;
import java16.models.Reader;
import java16.service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
     ReaderDaoImpl readerDaoImpl;

    public ReaderServiceImpl(ReaderDaoImpl readerDaoImpl) {
        this.readerDaoImpl = readerDaoImpl;
    }

    @Override
    public void saveReader(Reader reader) {
        readerDaoImpl.saveReader(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return readerDaoImpl.getAllReaders();
    }


    @Override
    public Reader getReaderById(Long id) {
        return readerDaoImpl.getReaderById(id);
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        return readerDaoImpl.updateReader(id,reader);
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
     readerDaoImpl.assignReaderToLibrary(readerId,libraryId);
    }

}
