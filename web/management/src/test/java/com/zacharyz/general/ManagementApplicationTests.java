package com.zacharyz.general;

import com.zacharyz.general.bean.User;
import com.zacharyz.general.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ManagementApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setTel("17366186521");
        boolean flag = userService.insert(user);
        System.out.println("insert operation is success?  " + flag);
    }
}
