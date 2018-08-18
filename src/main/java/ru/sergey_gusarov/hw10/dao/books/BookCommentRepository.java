package ru.sergey_gusarov.hw10.dao.books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.sergey_gusarov.hw10.domain.books.BookComment;

import java.util.List;

@Transactional
public interface BookCommentRepository extends CrudRepository<BookComment, Long> {
    long count();

    BookComment getById(long id);

    List<BookComment> findAll();

    BookComment save(BookComment bookComment);

    void delete(BookComment bookComment);

    void deleteById(long id);
}
