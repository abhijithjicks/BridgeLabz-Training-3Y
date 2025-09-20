package Hybrid;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker c = new Chef("John", 1);
        Worker w = new Waiter("Mike", 2);

        c.performDuties();
        w.performDuties();
    }
}

