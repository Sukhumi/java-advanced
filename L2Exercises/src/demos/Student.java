package demos;

public class Student extends Person{

    private int grade;

    public Student(String id, String firstName, String lastName, int grade) {
        super(id, firstName, lastName);
        this.grade = grade;
    }

    @Override
    public String personalDetails() {
        return String.format("Student: Id=%s, Name=%s %s, Grade=%d",
                getId(), getFirstName(), getLastName(), grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
