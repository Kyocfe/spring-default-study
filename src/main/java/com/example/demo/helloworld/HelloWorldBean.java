package com.example.demo.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 은 기본적인 코드를 자동적으로 생성해주는 기능이 있다.
// Setter, Getter, toString() 등
// 아래와 같이 설정하게 되면 알아서 json 형태의 response body로 리턴 할 수 있도록
// 처리된다.
// { "message": "${message}" }
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
