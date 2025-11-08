//3 si 4 cu gestionarea exceptiilor
//clasa UserRepository

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    // metoda pentru a adauga userii in lista
    public void addUser(User user) throws InvalidUserDataException {
        if (user == null)
        {
            throw new InvalidUserDataException("Nume utilizator nu poate fi null.");
        }

        if (user.getUsername() == null || user.getUsername().length() < 3)
        {
            throw new InvalidUserDataException("Username trebuie sa aibe cel putin 3 caractere.");
        }

        if (user.getAge() < 0)
        {
            throw new InvalidUserDataException("Varsta nu nu poate fi valoarea negativa.");
        }

        users.add(user);
        System.out.println("Userul adaugat: " + user);
    }

    public List<User> getUsers()
    {
        return users;
    }

}