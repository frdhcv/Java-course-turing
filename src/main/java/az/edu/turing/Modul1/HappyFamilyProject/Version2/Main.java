package az.edu.turing.Modul1.HappyFamilyProject.Version2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("dog","Rock",5,75,new String[]{"eat,drink,sleep"});
        Human father=new Human("Vito","Karleone",1950);
        Human mother=new Human("Jane","Karleone",1955);
        Family family=new Family(father,mother);
        Human child=new Human("Tyler","Karleone",1980);
        family.addChild(child);
        System.out.println(Arrays.toString(family.getChildren()));
        family.deleteChild(child);
        System.out.println(family.toString());
    }
}
