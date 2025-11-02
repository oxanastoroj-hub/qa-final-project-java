//p4. Creează Clasa BrowserConfig (2.0p) cu 3 variabile/campuri private

public class BrowserConfig
{
    private BrowserType browser;
    private String version;
    private boolean isHeadless;


    // CONSTUCTOR 1 (0,5p)
    // p4.1 Un constructor care primește toți cei 3 parametri (browser, version, isHeadless)
    // și inițializează câmpurile corespunzătoare folosind this.
    public BrowserConfig (BrowserType browserNew, String versionNew, boolean isHeadlessNew)
    {
        this.browser = browserNew;
        this.version = versionNew;
        this.isHeadless = isHeadlessNew;
    }

    // CONSTUCTOR 2 (0,5p)
    // p4.2 Un constructor care primește doar browser și version
    // Acesta trebuie să apeleze constructorul principal folosind this(), setând isHeadless la false.
    public BrowserConfig(BrowserType browserNew, String versionNew)
    {
        this(browserNew, versionNew, false); // Apelăm primul constructor (chaining)
    }

    // CONSTUCTOR 3 (0,5p)
    // p4.3 Un constructor care primește doar browser
    //  Acesta trebuie să apeleze al doilea constructor folosind this(), setând version la "latest" și isHeadless la false.

    public BrowserConfig(BrowserType browserNew)
    {
        this(browserNew, "latest", false); // Apelăm al doilea constructor (chaining)
    }


    //(0.5p) 4.4. Implementează Metoda Statică "Factory"
    public static BrowserConfig createDefaultChromeConfig()
    {
       return new BrowserConfig (BrowserType.CHROME, "latest", true);
    }

    // 4.5. Metoda statica de afisare
    public void afiseazaConfig()
    {
        System.out.println("Browser " + this.browser + " has version - " + this.version + ". Headless - " + this.isHeadless);
    }

}