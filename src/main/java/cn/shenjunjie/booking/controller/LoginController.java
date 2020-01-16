package cn.shenjunjie.booking.controller;

import cn.shenjunjie.booking.common.rest.RestBody;
import cn.shenjunjie.booking.dto.request.LoginRequest;
import cn.shenjunjie.booking.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Junjie.Shen
 * @version 1.0
 * @date 2020/1/12 15:09
 */
@Slf4j
@RestController
public class LoginController {

    @Value("${shiro.login.expiredtime}")
    private Long expiredTime;

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public RestBody login(@RequestBody LoginRequest request) {
        if (Objects.isNull(request)) {
            return RestBody.fail("Empty Account");
        }
        log.info("login request:{}", request);
        return loginService.login(request, expiredTime);
    }

    @PostMapping("/logout")
    public RestBody logOut() {
        return loginService.logout();
    }

    @GetMapping("/tologin")
    public RestBody toLogin() {
        log.info("toLogin!");
        return RestBody.fail("You haven't signed in yet, Please login first!");
    }

}
