package az.edu.turing.Modul1.HappyFamilyProject.Version4;

public class Woman extends Human{
    @Override
    public void greetPet() {
         System.out.println("Hello my mother" +getFamily().getMother());
    }
    public void makeUp(){
        System.out.println("Woman is makeup");
    }
}
