package ait.cohort34.person.service;

import ait.cohort34.person.dao.PersonRepository;
import ait.cohort34.person.dto.AddressDto;
import ait.cohort34.person.dto.CityPopulationDto;
import ait.cohort34.person.dto.PersonDto;
import ait.cohort34.person.model.Person;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    final PersonRepository personRepository;
    final ModelMapper modelMapper;

    @Override
    public Boolean addPerson(PersonDto personDto) {
        if(personRepository.existsById(personDto.getId())){
            return false;
        }
        personRepository.save(modelMapper.map(personDto, Person.class));
        return true;
    }

    @Override
    public PersonDto findPersonById(Integer id) {
        return null;
    }

    @Override
    public PersonDto removePerson(Integer id) {
        return null;
    }

    @Override
    public PersonDto updatePersonName(Integer id, String name) {
        return null;
    }

    @Override
    public PersonDto updatePersonAddress(Integer id, AddressDto addressDto) {
        return null;
    }

    @Override
    public PersonDto[] findPersonsByCity(String city) {
        return new PersonDto[0];
    }

    @Override
    public PersonDto[] findPersonsByName(String name) {
        return new PersonDto[0];
    }

    @Override
    public PersonDto[] findPersonsBetweenAge(Integer minAge, Integer maxAge) {
        return new PersonDto[0];
    }

    @Override
    public Iterable<CityPopulationDto> getCitiesPopulation() {
        return null;
    }
}
