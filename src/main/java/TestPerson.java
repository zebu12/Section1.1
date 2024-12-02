public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person();

        person.age = 41;
        person.name = "Ingrid";

        Person person2 = new Person();
        person2.age = 42;
        person2.name = "Mary";

        person2.showDetails();
        person.showDetails();
    }
}
