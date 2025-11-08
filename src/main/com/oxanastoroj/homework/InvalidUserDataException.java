// 1
//O excepție proprie (Checked Exception) utilizată pentru a semnala că datele introduse
// de utilizator sunt invalide.

public class InvalidUserDataException extends Exception
{
     //-----------  Constructor care primește un mesaj de eroare.
    public InvalidUserDataException(String message)
    {        super(message);    }
}