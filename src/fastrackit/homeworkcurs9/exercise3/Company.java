package fastrackit.homeworkcurs9.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> persons = new ArrayList<>();

    public Company() {
        persons.add(new Person("Daniel Tom", 35, "manager"));
        persons.add(new Person("Ionut Pop", 28, "welder"));
        persons.add(new Person("Ana Tomoiaga", 42, "carpenter"));
        persons.add(new Person("Robert Horvat", 23, "plumber"));

    }

    public Person getManager() {
        for (Person person : persons) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPosition().equals(profession)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(filterName)) {
                result.add(person);
            }
        }
        return result;
    }

    public void employ(Person person) {
        persons.add(person);
    }
}
