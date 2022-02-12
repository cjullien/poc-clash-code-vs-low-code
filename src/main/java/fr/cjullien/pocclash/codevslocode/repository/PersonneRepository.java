package fr.cjullien.pocclash.codevslocode.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.cjullien.pocclash.codevslocode.dto.Person;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "users", path = "users", itemResourceRel = "user")
public interface PersonneRepository extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByLastname(@Param("lastname") String lastname);
    List<Person> findByEmail(String email);
}