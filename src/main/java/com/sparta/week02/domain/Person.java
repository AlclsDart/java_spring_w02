package com.sparta.week02.domain;

import com.sparta.week02.models.PersonRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;

    @Column
    private String job;

    @Column
    private String tel1;

    @Column
    private String tel2;



    public Person() {
        System.out.println("Person Class 기본생성자");
    }

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
        this.tel1 = requestDto.getTel1();
        this.tel2 = requestDto.getTel2();
    }

    public void Person(String name, int age, String address, String job, String tel1, String tel2) {
        System.out.println("Person Class 파라미터 초기화");
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
        this.tel1 = requestDto.getTel1();
        this.tel2 = requestDto.getTel2();
    }
}