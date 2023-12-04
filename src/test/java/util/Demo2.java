package util;

public class Demo2 {
    public static void main(String[] args) {
        System.setProperty("browser", "firefox");
        Config.initialize();

        System.out.println(Config.get("selenium.grid.hubHost"));
    }
}
