package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class UtilsTest {

    @Test
    void shouldMockStaticMethod() {

        try (MockedStatic<Utils> mockUtils = Mockito.mockStatic(Utils.class)) {

            mockUtils.when(Utils::generateUUID).thenReturn("2460c6d025d94e61a88636346e7bb637");

            System.out.println(Utils.generateUUID());

            Assertions.assertEquals("2460c6d025d94e61a88636346e7bb637", Utils.generateUUID());

        }

    }

}