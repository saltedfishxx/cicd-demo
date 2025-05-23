package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.Controller.DataController;
import org.junit.jupiter.api.Test; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest public class DataControllerTest {
    @Autowired
    DataController dataController;
    @Test void health() {
        assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }
    @Test void version() {
        assertEquals("The actual version is 1.0.0", dataController.version());
    }
    @Test void nationsLength() {
        Integer nationsLength = dataController.getRandomNations().size(); assertEquals(10, nationsLength);
    }
    @Test void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }
}