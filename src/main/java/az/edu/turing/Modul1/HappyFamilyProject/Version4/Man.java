package az.edu.turing.Modul1.HappyFamilyProject.Version4;

public class Man extends Human{
    @Override
    public void greetPet() {
        System.out.println("Hello my father" +getFamily().getFather());
    }
    public void repairCar(){
        System.out.println("Car is repairing...");
    }
}
