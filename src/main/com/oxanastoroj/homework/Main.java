public class Main {
    static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // User valid
        try {
            User user1 = new User("testuser", 25);
            userRepository.addUser(user1);
        } catch (InvalidUserDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // AdminUser valid
        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            userRepository.addUser(admin);
        } catch (InvalidUserDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // User cu username prea scurt
        try {
            User userNameScurt = new User("ab", 22);
            userRepository.addUser(userNameScurt);
        } catch (InvalidUserDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // User cu age negativ
        try {
            User ageNegative = new User("ERROR", -5);
            userRepository.addUser(ageNegative);
        } catch (InvalidUserDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        // Afisarea liste utilizatori finali
        System.out.println("\n Utilizatori validati cu succes:");
        for (User u : userRepository.getUsers()) {
            System.out.println(" - " + u);
        }
    }
}
