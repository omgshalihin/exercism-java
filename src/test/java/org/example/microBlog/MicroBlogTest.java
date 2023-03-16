package org.example.microBlog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicroBlogTest {
    MicroBlog microBlog = new MicroBlog();

    @Test
    void hiShouldReturnHi() {
        String input = "Hi";
        assertEquals(microBlog.truncate(input), "Hi");
    }

    @Test
    void goodbyeShouldReturnGoodb() {
        String input = "Goodbye";
        assertEquals(microBlog.truncate(input), "Goodb");
    }

}