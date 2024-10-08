import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    static List<String> filterAndTransform(List<Person> listWithPersons) {
        List<String> output = new ArrayList<>();
        listWithPersons.forEach(s -> {
            if (s.getAge() > 30) output.add(s.getName() + " " + s.getCity());
        });
        return output;
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bob", 25, "Berlin"),
                new Person("Alice", 30, "London"),
                new Person("John", 28, "Paris"),
                new Person("Emma", 22, "New York"),
                new Person("David", 35, "Toronto"),
                new Person("Sophia", 27, "Sydney"),
                new Person("Michael", 32, "Tokyo"),
                new Person("Olivia", 24, "Rome"),
                new Person("James", 40, "Los Angeles"),
                new Person("Liam", 29, "Amsterdam"),
                new Person("Mia", 31, "Chicago")
        );

        filterAndTransform(persons).forEach(System.out::println);
    }
}


