//2
// Clasa de baza User cu getter si afisarea

public class User {
    private String username;
    private int age;

    // Constructor pentru clasa User
    public User(String username, int age)
    {
        this.username = username;
        this.age = age;
    }

    // Getters pentru age si username
    public String getUsername()
    {        return username;    }

    public int getAge()
    {        return age;    }

    @Override
    public String toString() {
        return "User: " + username + ", varsta: " + age;
    }

 }