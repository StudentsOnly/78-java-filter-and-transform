import java.util.*;

@FunctionalInterface
interface PersonFilter {
    boolean filter(Person person);
}

@FunctionalInterface
interface PersonTransformer {
    String transform(Person person);
}

public class LambdaExercise {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Olga", 25, "Kharkiv"));
        people.add(new Person("Michael", 28, "Los Angeles"));
        people.add(new Person("Gabriel", 30, "San Francisco"));
        people.add(new Person("Raphael", 20, "Paris"));
        people.add(new Person("Zadkiel", 35, "Rome"));
        people.add(new Person("Uriel", 22, "Berlin"));

        System.out.println("Original list of people: \n");
        people.forEach(System.out::println);

        PersonFilter ageFilter = person -> person.age <= 30;
        PersonTransformer toNameAndCityTransformer = person -> person.name + " from " + person.city;

        List<String> transformedPeople =  filterAndTransform(people, ageFilter, toNameAndCityTransformer);

        System.out.println();
        System.out.println("Filtered and transformed list of people: \n");
        transformedPeople.forEach(System.out::println);
    }

    public static List<String> filterAndTransform(List<Person> people, PersonFilter ageFilter, PersonTransformer transformer){
        List<String> result = new ArrayList<>();
        people.forEach(person -> {
            if(ageFilter.filter(person)){
                result.add(transformer.transform(person));
            }
        });

        return result;
    }
}