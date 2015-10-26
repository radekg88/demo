package com.example;

import com.example.entity.Demo;
import com.example.repository.DemoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    DemoRepository demoRepository;

    @Test
    public void testRepo() {
        Demo demo = new Demo();
        demo.setName("name");
        demo.setValue("val");
        demoRepository.save(demo);

        assertTrue(demoRepository.findAll().size() == 1);

    }

}
