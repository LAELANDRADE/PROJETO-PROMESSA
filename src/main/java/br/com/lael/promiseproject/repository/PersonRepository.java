package br.com.lael.promiseproject.repository;

import br.com.lael.promiseproject.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Caio Fabio on 09/11/19.
 * www.c410.com.br | caiofaar@gmail.com
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    /**
     * Utiliza a anotação <code>Query</code> do Spring Data JPA para definir o código SQL
     *
     * @param name Filtro da pesquisa de pessoas
     * @return Lista de pessoas com o filtro em nome
     */
    @Query("SELECT p FROM Person p where p.name like ?1")
    List<Person> getPersonByName(String name);

}
