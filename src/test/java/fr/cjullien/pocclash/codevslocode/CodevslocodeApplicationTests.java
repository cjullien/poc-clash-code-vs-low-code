package fr.cjullien.pocclash.codevslocode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import fr.cjullien.pocclash.codevslocode.dto.Person;
import fr.cjullien.pocclash.codevslocode.repository.PersonneRepository;

@SpringBootTest
class CodevslocodeApplicationTests {

	@MockBean
	PersonneRepository personneRepository;

	@Test
	void emptyRepository() {
		assertTrue(personneRepository.count() == 0);
	}
	
	@Test
	void save_nonValidPerson() {
		try {
			Person p = new Person();
			personneRepository.save(p);
		} catch (Exception e) {
			fail("Contraintes Violation");
		}		
	}
}
