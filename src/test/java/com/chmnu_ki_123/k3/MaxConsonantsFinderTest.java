package com.chmnu_ki_123.k3;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxConsonantsFinderTest {

    @Test
    public void testFindMaxConsonants() {
        String[] strings = {"hello", "world", "java", "programming"};
        assertEquals("programming", MaxConsonantsFinder.findMaxConsonants(strings));
    }

    @Test
    public void testFindMaxConsonantsWithEmptyArray() {
        String[] strings = {};
        assertThrows(IllegalArgumentException.class, () -> MaxConsonantsFinder.findMaxConsonants(strings));
    }

    @Test
    public void testFindMaxConsonantsWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> MaxConsonantsFinder.findMaxConsonants(null));
    }

    @Test
    public void testFindMaxConsonantsWithEqualConsonants() {
        String[] strings = {"cat", "dog"};
        assertTrue(Arrays.asList("cat", "dog").contains(MaxConsonantsFinder.findMaxConsonants(strings)));
    }
}
