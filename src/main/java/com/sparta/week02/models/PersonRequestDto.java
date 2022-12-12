package com.sparta.week02.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class PersonRequestDto {
    private final String name;
    private final int age;
    private final String address;
    private final String job;
    private final String tel1;
    private final String tel2;
}
