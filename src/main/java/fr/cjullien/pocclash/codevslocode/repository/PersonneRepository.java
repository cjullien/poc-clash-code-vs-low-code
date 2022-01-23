package fr.cjullien.pocclash.codevslocode.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.cjullien.pocclash.codevslocode.dto.Person;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface PersonneRepository extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByName(@Param("name") String name);
    List<Person> findByEmail(String email);
}