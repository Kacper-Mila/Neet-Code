package com.m1064.arrays_and_hashing;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeTest {

    @Test
    public void shouldReturnStringFromListOfStrings() {
        List<String> list = List.of("This", "is", "a", "test");
        String encoded = EncodeAndDecode.encode(list);
        assertEquals("This is a test", encoded);
    }

    @Test
    public void shouldReturnListOfStringsFromString() {
        String str = "This also is a test";
        List<String> decoded = EncodeAndDecode.decode(str);
        assertEquals(List.of("This", "is", "a", "test"), decoded);
    }
}
