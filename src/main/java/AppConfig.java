import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype") // Указал, что бин должен создаваться заново при каждом запросе
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Барсик");
        return cat;
    }
}