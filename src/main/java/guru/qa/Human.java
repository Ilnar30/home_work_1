package guru.qa;

public class Human {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void goToSchool() {
        if (age <= 17) {
            System.out.println("Я хожу в школу");
        } else if( age >= 18 && age <= 23 ) {
            System.out.println("Я учусь в университете");
        } else if ( age >=25 && age <= 65 ) {
            System.out.println("Я работаю");
        } else {
            System.out.println("Я на пенсии");


            }
        }


    void sayAge() {
        System.out.println("Мой возраст:" + age);
    }
}
