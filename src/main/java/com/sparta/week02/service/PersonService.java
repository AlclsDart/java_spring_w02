package com.sparta.week02.service;

import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.models.CourseRequestDto;
import com.sparta.week02.models.PersonRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    @Transactional
    public Long update(Long id, PersonRequestDto requestDto){
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );

        person1.update(requestDto);
        return id;
    }
}
