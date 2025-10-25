import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        boolean valid;

        do {
            System.out.print("Introdu un username: ");
            userName = scanner.nextLine();
            valid = true; // presupunem că e valid

            // Verificăm spațiile
            if (userName.contains(" "))
            {
                System.out.println("Eroare: username-ul nu trebuie sa conțina spații!");
                valid = false;
            }

            // Verificăm lungimea
            else if (userName.length() <= 6 || userName.length() >= 12)
            {
                System.out.println("Eroare: username-ul trebuie sa aiba între 6 și 12 caractere!");
                valid = false;
            }

            // are cel puțin o cifra
            else
            {
                boolean areCifra = false;
                for (char c : userName.toCharArray())
                {
                    if (Character.isDigit(c))
                    {
                        areCifra = true;
                        break;
                    }
                }
                if (!areCifra) {
                    System.out.println("Eroare: username-ul trebuie sa conțina cel puțin o cifra!");
                    valid = false;
                }
            }

        }
        while (!valid);

        System.out.println("Username valid: " + userName);
        scanner.close();
    }
}
