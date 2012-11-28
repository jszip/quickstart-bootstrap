package localhost.quickstart;

import org.junit.*;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void whenNobodyToGreetThenGreetNobody() throws Exception {
        Greeter instance = new Greeter();
        assertThat(instance.greet(Collections.<String>emptyList()),
                is(Collections.<String>emptyList()));
    }

    @Test
    public void whenSomebodyToGreetThenGreetThem() throws Exception {
        Greeter instance = new Greeter();
        assertThat(instance.greet(Collections.singletonList("Harry")),
                is(Collections.<String>singletonList("Hello Harry")));
    }

    @Test
    public void whenPeopleToGreetThenGreetEachOfThem() throws Exception {
        Greeter instance = new Greeter();
        assertThat(instance.greet(Arrays.asList("Harry","Sally")),
                hasItems("Hello Harry", "Hello Sally"));
    }
}
