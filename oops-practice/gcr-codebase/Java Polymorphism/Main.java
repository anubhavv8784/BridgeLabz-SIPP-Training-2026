// Parent Class
class Vehicle {

    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

// Child Class - Bus
class Bus extends Vehicle {

    @Override
    void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = " + (km * 8));
    }
}
/* 
/////

class Bus extends Vehicle{
    @override
    void fuelCost(int km){
        System.out.println("bus Fuel cost = " + (km * 8));
    }
}

class Car estends Vehicle{
    @overide
    void fuelCost(int km){
        System.out.println("Car Fuel = " + (km * 5));
    }
}*/

// Child Class - Car
class Car extends Vehicle {

    @Override
    void fuelCost(int km) {
        System.out.println("Car Fuel Cost = " + (km * 5));
    }
}

// New Child Class
class ElectricCar extends Vehicle {

    @Override
    void fuelCost(int km) {
        System.out.println("Electric Car Cost = " + (km * 2));
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Bus(),
                new Car(),
                new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : vehicles) {

            if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.fuelCost(km);

            } else if (v instanceof Car) {
                Car c = (Car) v;
                c.fuelCost(km);

            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                e.fuelCost(km);
            }
        }
    }
}