package demos;

public class Main {
    public static void main(String[] args) {
        HumanResources hr = new HumanResources();
        hr.addPerson(new Student(null, "John", "Doe", 5));
        hr.addPerson(new Person(null, "Jane", "Doe"));
        hr.addPerson(new Worker(null, "Bratt", "Pitt", 20, 8));
        hr.addPerson(new Worker(null, "Jack", "Nickolson", 500, 2));

        hr.generateReport();
    }
}
