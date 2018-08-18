package ru.sergey_gusarov.hw10.dao.books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.sergey_gusarov.hw10.domain.books.Book;

import java.util.List;

@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {
    long count();

    Book getById(long id);

    Book getByTitle(String title);

    List<Book> findAll();

    Book save(Book book);

    void delete(Book book);

    void deleteById(long id);
}
