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

    @Test
    public void royalFlush() {
        String expected = "🃎🂸🃅🃋🃍";
        assertEquals(expected, microBlog.truncate("🃎🂸🃅🃋🃍🃁🃊"));
    }

    @Test
    public void englishAndEmojiShort() {
        String expected = "Fly 🛫";
        assertEquals(expected, microBlog.truncate("Fly 🛫"));
    }

    @Test
    public void emojiLong() {
        String expected = "❄🌡🤧🤒🏥";
        assertEquals(expected, microBlog.truncate("❄🌡🤧🤒🏥🕰😀"));
    }

}