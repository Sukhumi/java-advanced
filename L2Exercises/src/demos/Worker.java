package demos;

public class Worker extends Person {

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public double getWorkWours() {
        return workWours;
    }

    public void setWorkWours(double workWours) {
        this.workWours = workWours;
    }

    private double dailyWage;
    private double workWours;

    public Worker(String id, String firstName, String lastName, double dailyWage, double workWours) {
        super(id, firstName, lastName);
        this.dailyWage = dailyWage;
        this.workWours = workWours;
    }

    @Override
    public String personalDetails() {
        return String.format("Worker: Id=%s, Name=%s %s, Wage=%.2f, Hours=%.2f, Hour Pay=%.2f",
                getId(), getFirstName(), getLastName(), dailyWage, workWours, wagePerHour());
    }

    public double wagePerHour(){
        return dailyWage / workWours;
    }
}
