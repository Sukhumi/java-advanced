package demos;

import java.util.ArrayList;

public class HumanResources {

    private int currentId;

    private ArrayList<Person> personnel;

    public HumanResources(){
        currentId = 1;
        personnel = new ArrayList<>();
    }

    public void addPerson( Person p ){
        p.setId(Integer.toString(currentId++));
        personnel.add(p);
    }

    public void removePerson( Person p ){
        personnel.remove(p);
    }

    public void generateReport(){
        for( Person p : personnel){
            System.out.println(p.personalDetails());
        }
    }
}
