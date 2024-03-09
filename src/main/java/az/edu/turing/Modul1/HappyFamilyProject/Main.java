package az.edu.turing.Modul1.HappyFamilyProject;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("dog","Rock",5,75,new String[]{"eat,drink,sleep"});
        Human father=new Human("Vito","Karleone",1950);
        Human mother=new Human("Jane","Karleone",1955);
        pet.foul();
    }
}
