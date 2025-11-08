//2
// clasa adminUser care mosteneste User

public class AdminUser extends User {
    private String permissionLevel;

    // Constructor pentru clasa AdminUser
    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    // Getter pentru permissionLevel
    public String getPermissionLevel()
    {
        return permissionLevel;
    }

    // Setter pentru permissionLevel
    public void setPermissionLevel(String permissionLevel)
    {
        this.permissionLevel = permissionLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", permisiuni: " + permissionLevel;
    }

}
