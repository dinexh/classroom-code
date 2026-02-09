
// Abstract class representing the template for making sandwiches
abstract class Sandwich {
    // Template method outlining the general steps for making a sandwich
    public final void makeSandwich() {
        System.out.println("Preparing bread...");
        addBread();
        System.out.println("Adding meat...");
        addMeat();
        System.out.println("Adding vegetables...");
        addVegetables();
        System.out.println("Adding condiments...");
        addCondiments();
        System.out.println("Sandwich is ready!");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void addBread();
    protected abstract void addMeat();
    protected abstract void addVegetables();
    protected abstract void addCondiments();
}

// Concrete subclass representing a Turkey Sandwich
class TurkeySandwich extends Sandwich {
    @Override
    protected void addBread() {
        System.out.println("Adding whole wheat bread for turkey sandwich.");
    }

    @Override
    protected void addMeat() {
        System.out.println("Adding turkey slices.");
    }

    @Override
    protected void addVegetables() {
        System.out.println("Adding lettuce, tomato, and onion slices.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding mustard and mayonnaise.");
    }
}

// Concrete subclass representing a Veggie Sandwich
class VeggieSandwich extends Sandwich {
    @Override
    protected void addBread() {
        System.out.println("Adding multi-grain bread for veggie sandwich.");
    }

    @Override
    protected void addMeat() {
        // Veggie sandwich doesn't contain meat
        System.out.println("No meat added.");
    }

    @Override
    protected void addVegetables() {
        System.out.println("Adding lettuce, tomato, cucumber, and bell pepper slices.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding hummus and mustard.");
    }
}

public class TemplateOne {
    public static void main(String[] args) {
        // Making a turkey sandwich
        Sandwich turkeySandwich = new TurkeySandwich();
        System.out.println("Making a Turkey Sandwich:");
        turkeySandwich.makeSandwich();
        System.out.println();

        // Making a veggie sandwich
        Sandwich veggieSandwich = new VeggieSandwich();
        System.out.println("Making a Veggie Sandwich:");
        veggieSandwich.makeSandwich();
    }
}

