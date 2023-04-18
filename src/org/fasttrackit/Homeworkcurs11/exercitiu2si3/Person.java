package org.fasttrackit.Homeworkcurs11.exercitiu2si3;

import java.util.*;

public class Person {

    private String name;
    private int age;
    private String hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public class PersonUtils{
        public static List<String> extractName(List<Person> people){
            List<String> names = new ArrayList<>();
            for(Person person : people){
                names.add(person.getName());
            }
            return names;
        }
        public static Map<String, Integer> createNameToAgeMap(List<Person>people){
            Map<String, Integer> nameToAge = new HashMap<>();
            for (Person person:people){
                nameToAge.put(person.getName(), person.getAge());
            }
            return nameToAge;
        }

        public static List<Person> extractOlderThan(List<Person> people, int age){
            List<Person> olderPeople = new ArrayList<>();
            for (Person person:people){
                if (person.getAge() > age){
                    olderPeople.add(person);
                }
            }
            return olderPeople;
        }

        public static Map<String, List<String>> createHairColorToNameMap(List<Person> people){
            Map<String, List<String>> hairColorToName = new HashMap<>();
            for (Person person:people){
                String hairColor = person.getHairColor();
                if (!hairColorToName.containsKey(hairColor)){
                    hairColorToName.put(hairColor, new ArrayList<>());
                }
                hairColorToName.get(hairColor).add(person.getName());
            }
            return hairColorToName;
        }

        public static Map<Integer, List<Person>> createAgeToPersonListMap(List<Person> people){
            Map<Integer, List<Person>> ageToPersonList = new HashMap<>();
            for (Person person:people){
                int age = person.getAge();
                if (!ageToPersonList.containsKey(age)){
                    ageToPersonList.put(age, new ArrayList<>());
                }
                ageToPersonList.get(age).add(person);
            }
            return ageToPersonList;
        }
    }
}
