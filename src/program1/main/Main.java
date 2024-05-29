package program1.main;

import program1.example.Example;

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.setId(1);
        obj.setName("name");

        System.out.println("ID: " + obj.getId());
        System.out.println("Name: " + obj.getName());
    }
}
