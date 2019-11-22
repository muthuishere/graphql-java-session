package sessions.graphql.eshop.vehicles;

import org.springframework.stereotype.Service;
import sessions.graphql.eshop.mockgenerators.VehicleDataGenerator;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class VehicleService {
    List<Vehicle> vehicles = new ArrayList<>();


    @PostConstruct
    public void init(){

        vehicles = VehicleDataGenerator.generate();
    }
    public  List<Vehicle> getAll(){
        return vehicles;
    }
}
