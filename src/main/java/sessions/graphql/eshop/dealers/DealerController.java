package sessions.graphql.eshop.dealers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dealers")
public class DealerController {

    @Autowired
    DealerService dealerService;

    @GetMapping("")
    public List<Dealer> getAllDealers(){
        return dealerService.getAll();
    }
}
