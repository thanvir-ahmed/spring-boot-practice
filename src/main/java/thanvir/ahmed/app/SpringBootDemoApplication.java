package thanvir.ahmed.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import thanvir.ahmed.app.model.Laptop;
import thanvir.ahmed.app.model.Student;
import thanvir.ahmed.app.service.LaptopService;
import thanvir.ahmed.app.service.StudentService;

import java.util.List;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//        Alien alien = context.getBean(Alien.class);
//        alien.code();

//        context.getBean(Laptop.class).compile();
//        LaptopService service = context.getBean(LaptopService.class);
//        Laptop laptop = context.getBean(Laptop.class);
//        service.addLaptop(laptop);

        Student student = context.getBean(Student.class);
        student.setRollno(109);
        student.setName("Thanvir");
        student.setMarks(90);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(student);

        List<Student> students = service.getStudents();
        students.forEach(System.out::println);
    }
}
