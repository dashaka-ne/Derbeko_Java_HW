package classWork;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.IntStream;


public class GenerateStudents {
    public static void students() {
        Stream<Student> generate = Stream.generate(new Supplier<Student>() {
            @Override
            public Student get() {
                return null;
            }
        });
        Stream <Student> limit=generate.limit(10000);
       // Stream map=generate.mapToInt(name -> Student.getFullName(name));
    }
}
