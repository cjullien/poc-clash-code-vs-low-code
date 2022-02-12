package fr.cjullien.pocclash.codevslocode.config;

import org.springframework.context.annotation.Component;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import fr.cjullien.pocclash.codevslocode.Person;


@Component
public class ExposeEntityIdRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Person.class);
  }
}