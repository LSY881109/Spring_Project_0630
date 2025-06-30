package com.busanit501.spring_project.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    // 필드 주입,
    // 루트 컨텍스트 의 파일 위치를 인식를 못해서, 컴파일러 오류상황

//    @Autowired
//    private SampleDAO sampleDAO;

    // 방법2,
    // 생성자 주입 방식. -> 롬복 이용하기. ->@RequiredArgsConstructor
    private final  SampleDAO sampleDAO;
}
