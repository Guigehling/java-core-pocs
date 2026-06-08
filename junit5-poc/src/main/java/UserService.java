public class UserService {

    public String findUser(Long id) {

        if (id == 1L) {
            return "Guilherme";
        }

        throw new IllegalArgumentException("User not found");
    }

}
