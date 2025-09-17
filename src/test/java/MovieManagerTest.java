import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


@Test

public void test() {

    MovieManager manager = new MovieManager();

    manager.addMovie("Film one");
    manager.addMovie("Film two");
    manager.addMovie("Film three");

    String[] expected = {"Film one", "Film two", "Film three"};
    String[] actual = manager.findAll();
    Assertions.assertArrayEquals(expected, actual);




}




}
