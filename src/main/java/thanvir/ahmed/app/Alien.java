package thanvir.ahmed.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private Computer computer;
    @Value("20")
    private int age;

    public Alien() {
        System.out.println("Alien instance created ");
    }

//    public Alien(int age) {
//        System.out.println("Alien instance created with age " + age);
//        this.age = age;
//    }

    //@ConstructorProperties( {"age", "computer"})
    public Alien(int age, Computer computer) {
        this.computer = computer;
        this.age = age;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void code() {
        System.out.println("Alien age is " + age);
        System.out.println("Coding");
        computer.compile();
    }
}
