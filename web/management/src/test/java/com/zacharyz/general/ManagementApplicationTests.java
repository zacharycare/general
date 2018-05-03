package com.zacharyz.general;

import com.zacharyz.general.bean.User;
import com.zacharyz.general.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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

    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void redisTest(){
//        stringRedisTemplate.opsForValue().set("name","zhou1234");
        System.out.println(stringRedisTemplate.opsForValue().get("name"));

        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin1");
        user.setTel("17366186521");
//        System.out.println(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
