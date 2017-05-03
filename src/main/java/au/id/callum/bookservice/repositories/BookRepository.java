package au.id.callum.bookservice.repositories;

import au.id.callum.bookservice.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
