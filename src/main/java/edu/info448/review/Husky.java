package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {

    }

    public void bark() {
        System.out.println(this + " says: Woof");
    }

    public void hug() {
        
    }
}