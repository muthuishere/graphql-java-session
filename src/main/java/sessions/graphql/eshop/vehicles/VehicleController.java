package sessions.graphql.eshop.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {


    @Autowired
    VehicleService vehicleService;

    @GetMapping("")
    public List<Vehicle> getAllVehicles(){

        return vehicleService.getAll();
    }
}
