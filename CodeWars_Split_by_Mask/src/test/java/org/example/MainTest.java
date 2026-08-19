package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MainTest {
    @Test
    void splitByMask() {
        Main main = new Main();
        ArrayList<Integer> mask = new ArrayList<>();
        mask.add(2);
        mask.add(3);
        mask.add(4);
        ArrayList<String> response = new ArrayList<>();
        response.add("12");
        response.add("345");
        response.add("6789");
        assertEquals(response, main.splitByMask("123456789", mask));
    }
}