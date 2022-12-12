package com.sparta.week02.controller;

import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.service.PersonService;
import com.sparta.week02.models.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person1 = new Person(requestDto);
        return personRepository.save(person1);
    }

    @GetMapping("/api/persons")
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long putPerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto){
        personService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}


