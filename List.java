
import java.time.LocalDateTime;
import java.util.ArrayList;

public class List {
public static void main (String[]arg) {
ArrayList cars = new ArrayList();
cars.add("Volvo");
cars.add("BMW");
cars.add("Audi");
cars.add("Ford");
//cars.set(3,"Mercedes-Benz");
for (int i = 0; i < cars.size();i++) {
System.out.println(cars.get(i));
}
LocalDateTime a = LocalDateTime.now();
System.out.println(a);
}
}
