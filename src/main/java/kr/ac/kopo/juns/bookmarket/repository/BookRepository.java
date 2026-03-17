package kr.ac.kopo.juns.bookmarket.repository;

import kr.ac.kopo.juns.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
