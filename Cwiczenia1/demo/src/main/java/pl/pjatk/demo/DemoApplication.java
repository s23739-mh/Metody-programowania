package pl.pjatk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    static void printing() {
        System.out.println("Thanks Cannons");
        zegarek rolex = new zegarek("rolex", 12);
        rolex.setValue(1);
        System.out.println("Model zegarka:" + rolex.getModel() +
                "\nWartosc zegarka:" + rolex.getValue());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        printing();
    }

}
