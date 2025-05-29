package com.m1064.arrays_and_hashing;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeTest {
    @Test
    void testEncodeAndDecode_basic() {
        List<String> input = List.of("hello", "world", "!");
        String encoded = EncodeAndDecode.encode(input);
        List<String> decoded = EncodeAndDecode.decode(encoded);
        assertEquals(input, decoded);
    }

    @Test
    void testEncodeAndDecode_emptyList() {
        List<String> input = List.of();
        String encoded = EncodeAndDecode.encode(input);
        List<String> decoded = EncodeAndDecode.decode(encoded);
        assertEquals(input, decoded);
    }
}
