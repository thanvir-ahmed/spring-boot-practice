package thanvir.ahmed.app.service;

import org.springframework.stereotype.Service;
import thanvir.ahmed.app.model.Laptop;

@Service
public class LaptopService {
    public void addLaptop(Laptop laptop) {
        System.out.println("Adding laptop");
    }
    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}
