package az.edu.turing.Modul1.HappyFamilyProject.Version3;

import java.util.Arrays;
import java.util.Objects;

class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Human[] newChildren = new Human[children.length - 1];
            int newIndex = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != index) {
                    newChildren[newIndex++] = children[i];
                }
            }
            children = newChildren;
            return true;
        }
        return false;
    }
    public boolean deleteChild(int index) {

        if (index >0||index<children.length) {
            Human[] newChildren = new Human[children.length - 1];
            int newIndex = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != index) {
                    newChildren[newIndex++] = children[i];
                }
            }
            children = newChildren;
            return true;
        }
        return false;
    }

    public int countFamily() {
        return children.length + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
