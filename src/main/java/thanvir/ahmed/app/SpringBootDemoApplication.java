package thanvir.ahmed.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import thanvir.ahmed.app.model.Laptop;
import thanvir.ahmed.app.service.LaptopService;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//        Alien alien = context.getBean(Alien.class);
//        alien.code();

//        context.getBean(Laptop.class).compile();
        LaptopService service = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);
    }
}
