public class VariablesAndNames {
    public static void main(String[] args) {
        //define interger variables cars, drivers, passengers, carsNotDriven, carsDriven.
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        //define double variables spaceInACar, carpoolCapacity and averagePassengersPerCar.
        double spaceInACar, carpoolCapacity, averagePassengersPerCar;

        //set value of cars = 100
        cars = 100;
        //set value of spaceInACar = 4.0 
        spaceInACar = 4.0; 
        //set value of drivers = 30
        drivers = 30;
        //set value of passengers = 90
        passengers = 90;
        //Make carsNotDriven equals to the difference between cars and drivers. 
        carsNotDriven = cars - drivers;
        //Make carsDriven = the number of drivers.
        carsDriven = drivers;
        //Make carpoolCapacity equals to product of carsDriven and spaceInACar. 
        carpoolCapacity = carsDriven * spaceInACar;
        //Make averagePassengersPerCar equals to passengers divide by carsDriven.
        averagePassengersPerCar = passengers / carsDriven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + carsNotDriven + " empty cars today." );
        System.out.println( "We can transport " + carpoolCapacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + averagePassengersPerCar + " in each car." );
    }
}
//1. It is not neccessary and it is just 4, the values will be rounded to the closest interger.
//2. Floating point is a number that can be expressed in fractional form.
//4. = is called equals and it is made to give things names.
