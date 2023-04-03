package fastrackit.homeworkcurs9.exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
     Company company = new Company();

     Person manager = company.getManager();
        System.out.println("Manager: " + manager.getName());


        List<Person> welders = company.getPersons("welder");
        System.out.print("Welders:");
        for (Person welder : welders){
            System.out.println(welder.getName());
        }

        List<Person> olderThan30 = company.getPersonsOlder(30);
        System.out.print("Person older than 30: ");
        for (Person person : olderThan30){
            System.out.println(person.getName()+ " " + person.getAge()+ " ");
        }

        Person newPerson = new Person("Ioana Teodora", 26, "carpenter");
        company.employ(newPerson);
        System.out.println("New person: " + newPerson.getName());

    }
}
