public class Main {
    public static void main(String[] args) {
        Airliner airliner1 = new Airliner(150, "Airliner One", "ABC123", 35);
        Airliner airliner2 = new Airliner(180, "Airliner Two", "DEF456", 36);

        Freighter freighter1 = new Freighter(20000, "Freighter One", "FRGT01", 65);
        Freighter freighter2 = new Freighter(15000, "Freighter Two", "FRGT02", 60);

        Drone drone1 = new Drone(5, "Drone One", "DRONE", 2);
        Drone drone2 = new Drone(10, "Drone Two", "DR1NE", 3);

        CargoCapable[] cargoAircraft = {freighter1, freighter2, drone1, drone2};

    }
}

interface PassengerCapable {
    int getPassengerCapacity();
    void setPassengerCapacity(int passengerCapacity);
}

interface CargoCapable {
    int getCargoCapacity();
    void setCargoCapacity(int cargoCapacity);
}

class Aircraft {
    protected int capacity;
    protected String model;
    protected String callsign;
    protected int wingspan;

    public Aircraft(int capacity, String model, String callsign, int wingspan) {
        this.capacity = capacity;
        this.model = model;
        this.callsign = callsign;
        this.wingspan = wingspan;
    }
}

class Airliner extends Aircraft implements PassengerCapable {
    public Airliner(int capacity, String model, String callsign, int wingspan) {
        super(capacity, model, callsign, wingspan);
    }

    public int getPassengerCapacity() {
        return capacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        capacity = passengerCapacity;
    }

}

class Freighter extends Aircraft implements CargoCapable {
    public Freighter(int capacity, String model, String callsign, int wingspan) {
        super(capacity, model, callsign, wingspan);
    }

    @Override
    public int getCargoCapacity() {
        return capacity;
    }

    @Override
    public void setCargoCapacity(int cargoCapacity) {
        capacity = cargoCapacity;
    }

}

class Drone extends Aircraft implements CargoCapable {
    private int batteryLife;

    public Drone(int capacity, String model, String callsign, int wingspan) {
        super(capacity, model, callsign, wingspan);
        this.batteryLife = 30;
    }

    public Drone(int capacity, String model, String callsign, int wingspan, int batteryLife) {
        super(capacity, model, callsign, wingspan);
        this.batteryLife = batteryLife;
    }

    public int getCargoCapacity() {
        return capacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        capacity = cargoCapacity;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}