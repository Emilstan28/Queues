package com.company;

public class Main {

    public static void main(String[] args) {
        Employee jJ = new Employee("Jane", "Jones", 123);
        Employee jD = new Employee("John", "Doe", 4566);
        Employee mS = new Employee("Mary", "Smith", 8673);
        Employee mW = new Employee("Mike", "Wilson", 582851);
        Employee bE = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(jJ);
        queue.add(jD);
        queue.add(mS);
        queue.add(mW);
        queue.add(bE);

//        queue.printQueue();


//        queue.remove();
//        queue.remove();
//
//        queue.printQueue();

        System.out.println(queue.peek());
    }
}
