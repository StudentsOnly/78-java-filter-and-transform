import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    static List<String> filterAndTransform(List<Person> people) {
        List<String> result = new ArrayList<>();
        people.forEach(person -> {
            if (person.getAge() <= 30) {
                result.add(person.getName() + " is from " + person.getCity() + ".");
            }
        });
        return result;
    }

    public static void main(String[] args) {

        var people = List.of(
                new Person("Alice", 25, "New York"),
                new Person("Bob", 35, "New York"),
                new Person("Charlie", 28, "Chicago"),
                new Person("Diana", 32, "Houston"),
                new Person("Eve", 29, "Phoenix"));


        System.out.println("\nOriginal list of people:");
        people.forEach(System.out::println);

        List<String> transformedList = filterAndTransform(people);

        System.out.println("\nFiltered and transformed list:");
        transformedList.forEach(System.out::println);
    }
}
