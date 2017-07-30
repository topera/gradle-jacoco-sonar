package com.topera.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by topera on 30/07/17.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Message greeting() {
        return new Message("foobar");
    }

}
