interface vehicleAction {
    public void identify_myself();
}

class Vehicle implements vehicleAction {
    protected String name;
    protected String with_engine;

    public Vehicle() {
    }

    public Vehicle(String name, String with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWith_engine() {
        return with_engine;
    }

    public void setWith_engine(String with_engine) {
        this.with_engine = with_engine;
    }

    @Override
    public void identify_myself() {
        System.out.println(
                "Hi I'm Parent of All Vehicles, My Name is " + name + ", My Engine status is '" + with_engine + "'");
    }
}

class Bikers extends Vehicle {
    private int wheel_count;

    public Bikers(String name, String with_engine, int wheel_count) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
    }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Bike, My Name is " + name + " Bikes, My Engine status is '" + with_engine
                + "', I have " + wheel_count + " wheel(s)");
    }
}

class Cars extends Vehicle {
    private int wheel_count;
    private String engine_type;

    public Cars(String name, String with_engine, int wheel_count, String engine_type) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Car, My Name is " + name + " Bikes, My Engine status is '" + with_engine
                + "', I have " + wheel_count + " wheel(s), My Engine Type = " + engine_type);
    }
}

class Buses extends Vehicle {
    private int wheel_count;
    private String private_bus;

    public Buses(String name, String with_engine, int wheel_count, String private_bus) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.private_bus = private_bus;
    }

    @Override
    public void identify_myself() {
        System.out.println(
                "Hi I'm Bus [" + private_bus + "], My Name is " + name + " Bikes, My Engine status is '" + with_engine
                        + "', I have " + wheel_count + " wheel(s)");
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Gerobak");
        vehicle.setWith_engine("no engine");
        vehicle.identify_myself();
        Bikers bikers = new Bikers("pedal", "no engine", 2);
        Bikers bikers2 = new Bikers("motor", "with engine", 2);
        bikers.identify_myself();
        bikers2.identify_myself();
        System.out.println();
        Cars cars = new Cars("Sport", "with_engine", 4, "V8");
        cars.identify_myself();
        Cars cars2 = new Cars("Pickup", "with_engine", 4, "Solar");
        cars2.identify_myself();
        System.out.println();
        Buses buses = new Buses("Trans Jakarta", "with engine", 4, "Public Bus");
        buses.identify_myself();
        Buses buses2 = new Buses("School Bus", "with engine", 4, "Private Bus");
        buses2.identify_myself();
    }
}
