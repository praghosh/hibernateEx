import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserLoginTest {

    @Test
    public void testValidCredentials() {
        // Arrange
    	User user = new User("john_doe", "pass123");
        UserLogin userLogin = new UserLogin(user);
        String username = "john_doe";
        String password = "pass123";

        // Act
        boolean result = userLogin.login(username, password);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        // Arrange
    	User user = new User("invalid_user", "nopassword");
    	UserLogin userLogin = new UserLogin(user);
        String username = "invalid_user";
        String password = "pass123";

        // Act
        boolean result = userLogin.login(username, password);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    public void testInvalidPassword() {
        // Arrange
    	User user = new User("john_doe", "pass123");
        UserLogin userLogin = new UserLogin(user);
        String username = "john_doe";
        String password = "invalid_pass";

        // Act
        boolean result = userLogin.login(username, password);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    public void testEmptyCredentials() {
        // Arrange
    	User user = new User("john_doe", "pass123");
        UserLogin userLogin = new UserLogin(user);
        String username = "";
        String password = "";

        // Act
        boolean result = userLogin.login(username, password);

        // Assert
        Assertions.assertFalse(result);
    }
}
