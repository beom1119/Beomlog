package com.Beomlog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     /// 그냥 컨트롤러도 가능한데 데이터 기반으로 사용하기 때문에 restController 사용
public class PostController {

    @GetMapping("/posts")
    public String get()
    {
        return "hello world";
    }

}
