package com.oakdalesoft.bootfaces.service;

import com.oakdalesoft.bootfaces.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    public void shoudlTrue() {
        bookController.getAllBooks();


        assertTrue(true);
    }

}