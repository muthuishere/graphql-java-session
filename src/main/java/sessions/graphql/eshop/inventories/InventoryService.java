package sessions.graphql.eshop.inventories;

import org.springframework.stereotype.Service;
import sessions.graphql.eshop.mockgenerators.InventoryDataGenerator;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class InventoryService {
    List<Inventory> inventories = new ArrayList<>();

    @PostConstruct
    public void init(){

        this.inventories = InventoryDataGenerator.generate();
    }

    public  List<Inventory> getAll(){

        return inventories;
    }
}
