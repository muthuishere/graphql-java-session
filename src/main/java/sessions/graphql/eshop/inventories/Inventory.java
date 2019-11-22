package sessions.graphql.eshop.inventories;

public class Inventory {
    Long vehicleId;
    Long dealerId;
    int totalVehicles;

    public Inventory() {
    }

    public Inventory(Long dealerId, Long vehicleId, int totalVehicles) {
        this.dealerId = dealerId;
        this.vehicleId = vehicleId;
        this.totalVehicles = totalVehicles;
    }
}
