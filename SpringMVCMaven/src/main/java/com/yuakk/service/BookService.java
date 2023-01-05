package com.yuakk.service;

import com.yuakk.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(int id);

    public List<Book> getAll();


}
