package com.sparta.week02.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CourseRequestDto {
    private String title;
    private String tutor;

    public CourseRequestDto(){

    }
    public CourseRequestDto(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}
