package sessions.graphql.eshop.dealers;

import org.springframework.stereotype.Service;
import sessions.graphql.eshop.mockgenerators.DealerDataGenerator;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DealerService {

    List<Dealer> dealers = new ArrayList<>();

    @PostConstruct
    public void init(){
        dealers = DealerDataGenerator.generate();
    }


    public List<Dealer> getAll(){
        return dealers;
    }

    public Dealer getDealerById(Long id){
        return dealers.stream()
                .filter(dealer -> dealer.id == id)
                .findFirst()
                .orElse(null);
    }
}
