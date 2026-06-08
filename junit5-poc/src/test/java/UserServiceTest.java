import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserService service;

    @BeforeEach
    void setup() {
        service = new UserService();
    }

    @Nested
    class WhenUserExists {
        @Test
        void shouldReturnUser() {
            String result = service.findUser(1L);

            Assertions.assertEquals("Guilherme", result);
        }
    }

    @Nested
    class WhenUserDoesNotExist {
        @Test
        void shouldThrowException() {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> service.findUser(999L)
            );
        }
    }

}
