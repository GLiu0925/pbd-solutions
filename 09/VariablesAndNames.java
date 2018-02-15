public class VariablesAndNames{
    public static void main(String[] args) {
        //defining the variables cars, drivers, passengers, cars_not_driven, cars_driven. "_" represents sepace.
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //assigning values to the variables.
        cars = 50;
        space_in_a_car = 4.0;
        drivers = 10;
        passengers = 60;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        //printing the statements.
        System.out.println("There are " + cars + " cars availale.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
    }
}
