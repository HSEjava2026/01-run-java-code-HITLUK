package src.ru.hse.lab1.second;

/**
 * @author Кузнецов Кирилл Вадимович
 * @version 1.0
 * @since 2026
 */

public class Person {
    String name = "";
    int age = 0;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

public String getName() {
    return name;
}
public int getAge() {
    return age;
}
}
