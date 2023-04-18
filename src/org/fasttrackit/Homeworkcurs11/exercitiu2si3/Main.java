package org.fasttrackit.Homeworkcurs11.exercitiu2si3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ion", 25, "blond"));
        people.add(new Person("Alina", 30, "saten"));
        people.add(new Person("Alex", 40, "roscat"));
        people.add(new Person("Roxana", 48, "castaniu"));

        List<String> names = Person.PersonUtils.extractName(people);
        System.out.println(names);

        Map<String, Integer> nameToAge = Person.PersonUtils.createNameToAgeMap(people);
        System.out.println(nameToAge);

        List<Person> olderPeople = Person.PersonUtils.extractOlderThan(people, 26);
        System.out.println(olderPeople);

        Map<String, List<String>> hairColorToName = Person.PersonUtils.createHairColorToNameMap(people);
        System.out.println(hairColorToName);

        Map<Integer, List<Person>> ageToPersonList = Person.PersonUtils.createAgeToPersonListMap(people);
        System.out.println(ageToPersonList);
    }
}
