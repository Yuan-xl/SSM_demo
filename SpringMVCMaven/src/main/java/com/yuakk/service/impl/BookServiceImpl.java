package com.yuakk.service.impl;

import com.yuakk.dao.BookDao;
import com.yuakk.pojo.Book;
import com.yuakk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {
        ;
        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    @Override
    public Book getById(int id) {
        Book book = bookDao.getById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }
}
