package ss05_Access_modifier_static_method_static_property.ThucHanh.Static_Property;

public class Car {
    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;
        this.engine = engine;

        numberOfCars++;

    }



    // getters and setters

}
