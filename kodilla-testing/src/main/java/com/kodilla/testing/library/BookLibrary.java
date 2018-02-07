package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    Book book = new Book("Title", "Author", 2000);

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> rentedBooks = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(rentABook(libraryUser, book)){
            rentedBooks.add(book);
        }
        return rentedBooks;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book){
        return true;
    }
}
