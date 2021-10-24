package demo.example;

import com.intuit.karate.junit5.Karate;

public class ExampleLevelRunner {
    @Karate.Test
    Karate testExample() {
        return Karate.run().relativeTo(getClass());
    }
}
