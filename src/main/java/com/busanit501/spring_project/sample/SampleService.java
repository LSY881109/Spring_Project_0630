package com.busanit501.spring_project.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
public class SampleService {

    // 필드 주입,
    // 루트 컨텍스트 의 파일 위치를 인식를 못해서, 컴파일러 오류상황

//    @Autowired
    private SampleDAO sampleDAO;
}
