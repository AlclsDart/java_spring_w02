package com.sparta.week02.domain;

import com.sparta.week02.models.CourseRequestDto;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;

@NoArgsConstructor // 기본생성자를 대신 생성해줍니다.
@Entity // 테이블임을 나타냅니다.
public class Course {

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String title;

    @Column(nullable = false)
    private String tutor;

    public Course(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }

    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public Long getId() {
        return id;
    }

    public void update(CourseRequestDto reqeustDto) {
        this.title = reqeustDto.getTitle();
        this.tutor = reqeustDto.getTutor();
    }

    public void deleteCourse(@PathVariable Long id){

    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}