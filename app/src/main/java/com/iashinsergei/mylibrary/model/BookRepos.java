package com.iashinsergei.mylibrary.model;

import com.iashinsergei.mylibrary.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepos {

    private static BookRepos instance;

    private List<Book> bookList;

    private BookRepos() {
        bookList = new ArrayList<>();
        bookList.add(new Book(0,"war novel","Erich Maria Remarque","","Three Comrades", "",1,1936));
        bookList.add(new Book(1,"drama","William Shakespeare","", "Hamlet","", 1, 1602));
        bookList.add(new Book(2,"historical fiction","Margaret Mitchell","","Gone with the Wind","", 1, 1936));
    }

    public static synchronized BookRepos getInstance() {
        if (instance == null) {
            instance = new BookRepos();
        }
        return instance;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public int getBookListSize() {
        return bookList.size();
    }
}
