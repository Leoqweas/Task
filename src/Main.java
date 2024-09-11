
public class Main
{
    //1. Класс "Человек"
    //Создайте класс Person с полями name, age, gender.
    // Реализуйте методы для вывода информации о человеке и увеличения его возраста.
    // Добавьте метод для изменения имени.
    public static class Person
    {
        String name;
        int age;
        char gender;
        public Person (String name, int age, char gender)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public void displayInfo()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        }
        public void increaseAge()
        {
            age++;
        }

        // Метод для изменения имени
        public void changeName(String newName)
        {
            this.name = newName;
        }
    }
    //2. Наследование: Класс "Работник" и "Менеджер"
    //Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
    // Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

}