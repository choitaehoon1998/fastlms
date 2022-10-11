package com.zerobase.fastlms.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member/register")
    public String register(){
        return "/member/register";
    }

    @GetMapping("/member/login")
    public String login() {
        return "/member/login";
    }

    @GetMapping("/member/logout")
    public String logout() {
        return "/member/logout";
    }
}
