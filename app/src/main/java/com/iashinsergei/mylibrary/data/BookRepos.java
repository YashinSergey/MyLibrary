package com.iashinsergei.mylibrary.data;

import com.iashinsergei.mylibrary.data.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepos {

    private static BookRepos instance;

    private List<Book> bookList;

    private BookRepos() {
        bookList = new ArrayList<>();
        bookList.add(new Book("war novel","Erich Maria Remarque","","Three Comrades",1936));
        bookList.add(new Book("drama","William Shakespeare","","Hamlet",1602));
        bookList.add(new Book("historical fiction","Margaret Mitchell","","Gone with the Wind",1936));
    }

    public static BookRepos getInstance() {
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
