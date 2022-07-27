package guru.qa;

public class Information {
    int home;
    String city;

    public Information(int home, String city) {
        this.home = home;
        this.city = city;
    }
    void sayCity() {
        System.out.println("Мой город:" + city);
    }
    void sayHome() {
        System.out.println("Мой дом:" + home);
    }

}
