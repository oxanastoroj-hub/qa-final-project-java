//Creează Clasa de Test TestConfigRunner (1.0p)
public class TestConfigRunner {
    public static void main(String[] args)
    {
        //Creează cel puțin o instanță BrowserConfig folosind fiecare dintre cei 3 constructori.
        BrowserConfig config1 = new BrowserConfig(BrowserType.EDGE, "latest", true );
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "previous" );
        BrowserConfig config3 = new BrowserConfig(BrowserType.FIREFOX );

        //Creează o instanță BrowserConfig folosind metoda statică createDefaultChromeConfig().
        BrowserConfig defaultChrome = BrowserConfig.createDefaultChromeConfig();

        // Pentru fiecare instanță creată, apelează metoda afiseazaConfig()
        // pentru a demonstra vizual în consolă că obiectele au fost configurate corect.

        System.out.println("Se incepe analiza ...  \n");

        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        defaultChrome.afiseazaConfig();

        System.out.println("\nAnaliza funalizata.");

    }

}