package ru.sergey_gusarov.hw10.dao.books.dict;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.sergey_gusarov.hw10.domain.books.Author;
import ru.sergey_gusarov.hw10.domain.books.Genre;

import java.util.List;

@Transactional
public interface DictGenreRepository extends CrudRepository<Genre, Long> {
    long count();

    Genre getById(long id);

    Genre getByName(String name);

    List<Genre> findAll();

    void delete(Genre genre);

    void deleteById(long id);

    Genre save(Genre genre);
}
