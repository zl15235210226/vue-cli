package com.baizhi;

import com.baizhi.entity.Login;
import com.baizhi.service.LoginService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class VueCliApplicationTests {
@Resource
    private LoginService loginService;

    @Test
    void contextLoads() {
    }
    @Test
    void  query(){
        Login login =new Login();
        Login login1 = login.setUsername("吴").setPassword("126");
        int login2 = loginService.login(login1);
        System.out.println("用户名字"+login2);

    }

}
