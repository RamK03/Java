package Collections;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        Person1 ram=new Person1("ram", new Bike1("R15", new Insurance1("sriram")));
        System.out.println(ram.getBikeInsuranceName(ram));

        Person1 mani=new Person1("mani",null);
        System.out.println(mani.getBikeInsuranceName(mani));

    }

}
class Person1{
    private String name;
    private Optional<Bike1> bike;
    public Person1(String name,Bike1 bike) {
        this.name=name;
        this.bike=Optional.ofNullable(bike);
    }
    public String getName() {
        return name;
    }
    public Optional<Bike1> getBike() {
        return bike;
    }
    public String getBikeInsuranceName(Person1 person) {
        Optional<Person1> optperson=Optional.ofNullable(person);
        return optperson.flatMap(Person1::getBike).flatMap(Bike1::getInsurance).map(Insurance1::getName).orElse("null value occured");

    }
}
//Optional<Person1> optperson = Optional.ofNullable(person);
//→ Wraps the person in an Optional.
//
//.flatMap(Person1::getBike)
//→ Calls getBike() which returns an Optional<Bike1>.
//
//.flatMap(Bike1::getInsurance)
//→ Calls getInsurance() which returns an Optional<Insurance1>.
//
//.map(Insurance1::getName)
//→ Calls getName() on Insurance1, returns a String.
//
//.orElse("null value occured")
//→ If any of the above values are null or missing, it returns the default string.

//map() vs flatMap() with Optional:
//.map() is used when the method returns a value, like String or int.
//.flatMap() is used when the method returns another Optional.
class Bike1{
    private String name;
    private Optional<Insurance1> insurance;
    public Bike1(String name,Insurance1 insurance) {
        this.name=name;
        this.insurance=Optional.ofNullable(insurance);
    }
    public String getName() {
        return name;
    }
    public Optional<Insurance1> getInsurance() {
        return insurance;
    }
}
class Insurance1{
    private String name;
    public Insurance1(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
}