package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class RestApiController {

    @Resource
    private UserService userService;

    //@RequestMapping(value = "findAll")
    @GetMapping("findAll")
    public List<User> findAllUser(){

        return  userService.findAll();
    }
    @PostMapping("insert") //代表当前方法只能post请求
    public String  insert(){
        System.out.println("插入一条数据");
        return "post请求访问成功";
    }
    @PutMapping("update/{userId}")
    public String Update(@PathVariable("userId") Integer id, @RequestBody Map<String,String> map){
        System.out.println(id);
        System.out.println(map.get("username"));
        System.out.println("修改自己");
        return "put请求访问成功";
    }

    /*
         @PathVariable("id")
    * 接受路径中的id*/
    @DeleteMapping("delete/{id}") //符合restful风格的要求
    public String delete(@PathVariable("id") Integer id){
        System.out.println(id);
        System.out.println("删除自己");
        return "Delete 请求访问成功";
    }
}
