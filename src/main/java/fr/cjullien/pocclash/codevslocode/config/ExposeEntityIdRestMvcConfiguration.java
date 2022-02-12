package fr.cjullien.pocclash.codevslocode.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import fr.cjullien.pocclash.codevslocode.dto.Person;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdRestMvcConfiguration implements RepositoryRestConfigurer {

  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
    config.exposeIdsFor(Person.class);
  }
}