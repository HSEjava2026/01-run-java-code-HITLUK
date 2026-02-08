package src.ru.hse.lab1;

import src.ru.hse.lab1.second.Person;
/**
 * @author Кузнецов Кирилл Вадимович
 * @version 1.0
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("kirill",19);
        System.out.print("Имя: "+person.getName() +"\nВозраст: "+person.getAge());
    }
}
