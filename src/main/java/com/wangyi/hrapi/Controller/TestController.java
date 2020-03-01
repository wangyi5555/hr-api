package com.wangyi.hrapi.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/2/2713:23
 * @Version 1.0
 **/
@RestController
@Slf4j
//@RequestMapping("api")
public class TestController {
    //    @CrossOrigin(origins = "*")
    @DeleteMapping("/test")
    public Map<String, String> test(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie c :
                cookies) {
            log.info(c.getName());
        }
        System.out.println(cookies.length);
        Map<String, String> map = new HashMap<>();
        map.put("success", "hello world!!!");
        return map;
    }
}
