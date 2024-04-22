package ait.cohort34.person.dao;

import ait.cohort34.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    // @Query("select p from Person p where p.name=?1")
    Stream<Person> findByNameIgnoreCase(String name);

    @Query("select p from Person p where p.address.city=:cityName")
    Stream<Person> findByAddressCityIgnoreCase(@Param("cityName") String city);

    Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);
}
