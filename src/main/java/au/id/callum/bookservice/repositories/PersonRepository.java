package au.id.callum.bookservice.repositories;

import au.id.callum.bookservice.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
