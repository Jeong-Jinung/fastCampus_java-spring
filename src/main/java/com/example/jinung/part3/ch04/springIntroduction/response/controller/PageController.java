package com.example.jinung.part3.ch04.springIntroduction.response.controller;

import com.example.jinung.part3.ch04.springIntroduction.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    /**
     * api를 내려줘야 할때는 아래의 방식보다는 따로 ApiController를 작성하는게 좋음
     * @return
     */
    @ResponseBody
    @RequestMapping("/user")
    public User user() {
        var user = new User();
        user.setName("jinung");
        user.setAddress("패스트 캠퍼스");
        return user;
    }

}
