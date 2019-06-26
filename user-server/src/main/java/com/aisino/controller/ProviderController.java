package com.aisino.controller;

import com.aisino.pojo.User;
import com.aisino.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：alfredzhang
 * @Description：
 * @Modified By：
 * @Version: :
 * @Date ：2019/6/21 8:46
 */
@RestController
@Slf4j
@RequestMapping("user")
public class ProviderController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User hello(@PathVariable("id")Long id) {
        log.debug("hello is running");
//        return userService.queryById(id);
        return userService.queryById(id);
    }
}
