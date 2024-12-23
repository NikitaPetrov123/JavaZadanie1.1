import org.example.Container;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {
    @Test
    public void TestAddAndGet() {
        Container<String> container = new Container<>();
        container.add("Hello");
        container.add("World");
        container.add("!");
        container.add("pop");
        container.add("pip");

        assertEquals(container.get(1), "World");
    }

    @Test
    public void TestRemove() {
        Container<String> container = new Container<>();
        container.add("Hello");
        container.add("World");
        container.add("!");
        container.add("pop");
        container.add("pip");

        container.remove(2);
        assertEquals(container.get(2), "pop");
    }

    @Test
    public void TestSize() {
        Container<String> container = new Container<>();
        container.add("Hello");
        container.add("World");
        container.add("!");
        container.add("pop");
        container.add("pip");

        assertEquals(container.size(), 5);
    }
}
