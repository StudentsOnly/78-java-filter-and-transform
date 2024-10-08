import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

  public static void main(String[] args) {

    List<Person> persons = List.of(
      new Person("Fred", 28, "Berlin"),
      new Person("Fred2", 29, "Berlin2"),
      new Person("Fred3", 30, "Berlin3"),
      new Person("Fred4", 31, "Berlin4"),
      new Person("Fred5", 32, "Berlin5")
    );
    System.out.println("Original list:");
    System.out.println("------------------------------------");
    persons.forEach(System.out::println);
    System.out.println("------------------------------------");

    System.out.println("Filtered and transformed list:");
    System.out.println("------------------------------------");
    filterAndTransform(persons).forEach(System.out::println);

  }

  public static List<String> filterAndTransform(List<Person> persons) {

//    with streams
//    return persons.stream()
//      .filter(p -> p.getAge() > 30)
//      .map(p -> p.getName() + " " + p.getCity())
//      .toList();

    // alternative approach
    var result = new ArrayList<String>();
    persons.forEach(p -> { if (p.getAge() > 30) result.add(p.getName() + " " + p.getCity()); });

    return result;
  }
}
